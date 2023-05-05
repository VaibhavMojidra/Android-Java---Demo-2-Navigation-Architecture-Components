package com.vaibhavmojidra.javademo2navigationarchitecturecomponents;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.vaibhavmojidra.javademo2navigationarchitecturecomponents.databinding.FragmentHomeBinding;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false);
        binding.submitButton.setOnClickListener(view -> {
            String name=binding.nameEditText.getText().toString();
            if(TextUtils.isEmpty(name)){
                Toast.makeText(getActivity(),"Please enter your name",Toast.LENGTH_LONG).show();
            }else{
                Bundle bundle=new Bundle();
                bundle.putString("name",name);
                Navigation.findNavController(view).navigate(R.id.action_homeFragment_to_detailsFragment,bundle);
            }
        });
        return binding.getRoot();

    }
}
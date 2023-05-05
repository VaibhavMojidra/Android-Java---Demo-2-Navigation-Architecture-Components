package com.vaibhavmojidra.javademo2navigationarchitecturecomponents;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.vaibhavmojidra.javademo2navigationarchitecturecomponents.databinding.FragmentDetailsBinding;
import com.vaibhavmojidra.javademo2navigationarchitecturecomponents.databinding.FragmentHomeBinding;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DetailsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DetailsFragment extends Fragment {
    private FragmentDetailsBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_details, container, false);
        binding.nameTextView.setText(getArguments().getString("name"));
        return binding.getRoot();
    }
}
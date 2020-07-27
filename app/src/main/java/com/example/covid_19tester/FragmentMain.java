package com.example.covid_19tester;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

public class FragmentMain extends Fragment {
    private ImageButton takeTest;

    public FragmentMain() {
        // Required empty public constructor
    }

     @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_main, container, false);

        takeTest = root.findViewById(R.id.takeTestButton);
        return root;
    }
    public void launchTest(View view) {
        NavDirections actions = FragmentMainDirections
                .actionFragmentMainToTestFragment();
        Navigation.findNavController(view).navigate(actions);
    }
}
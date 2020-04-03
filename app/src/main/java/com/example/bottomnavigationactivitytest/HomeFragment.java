package com.example.bottomnavigationactivitytest;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class HomeFragment extends Fragment {

    // (4 - B -1) Override this method
//        (5) Go to MainActivity.java
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // (4 - B -2)
        // change the return to this
        return inflater.inflate(R.layout.fragment_home, container, false);
    }
}

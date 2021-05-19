package com.example.musicapp.ui.Online;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.musicapp.R;

public class OnlineFragment extends Fragment {

    private OnlineViewModel onlineViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        onlineViewModel =
                ViewModelProviders.of(this).get(OnlineViewModel.class);
        View root = inflater.inflate(R.layout.fragment_online, container, false);
        final TextView textView = root.findViewById(R.id.text_home);
        onlineViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
package com.example.beltr.viewpager.Fragments;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.beltr.viewpager.R;

public class CDialog extends DialogFragment {

    private View mainView;
    private int month;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mainView = inflater.inflate(R.layout.month_fragment,container,false);
        return mainView;
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        month = getArguments().getInt("month");
    }

    public static CDialog getInstance(int month) {
        CDialog instance = new CDialog();
        Bundle bundle = new Bundle();
        bundle.putInt("month",month);
        instance.setArguments(bundle);
        return instance;
    }






}

package com.example.beltr.viewpager.Fragments;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import com.example.beltr.viewpager.Fragments.Adapters.GridAdapter;
import com.example.beltr.viewpager.R;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class CDialog extends DialogFragment {

    private View mainView;
    private int month;

    private Calendar currentDate;

    private List<Integer> numDays;

    private GridView gridView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mainView = inflater.inflate(R.layout.month_fragment,container,false);
        return mainView;
    }



    private void setupMonthInfo(){
        int daysInMonth = currentDate.getMaximum(Calendar.DAY_OF_MONTH);
         numDays = new ArrayList<>();
         for(int i=1; i <= daysInMonth+1; i++) {
             numDays.add(i);
         }
    }

    @Override
    public void onStart() {
        super.onStart();
        currentDate =  Calendar.getInstance();
        setupMonthInfo();
        GridAdapter adapter = new GridAdapter(numDays);
        gridView.setAdapter(adapter);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        gridView = mainView.findViewById(R.id.gridView);
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

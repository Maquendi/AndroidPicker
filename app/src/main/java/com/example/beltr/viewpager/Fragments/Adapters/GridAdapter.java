package com.example.beltr.viewpager.Fragments.Adapters;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;

import java.util.List;

public class GridAdapter extends BaseAdapter {

    private List<Integer> numDays;

    public GridAdapter(List<Integer> numDays) {
        this.numDays = numDays;
    }

    @Override
    public int getCount() {
        return numDays.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }
}

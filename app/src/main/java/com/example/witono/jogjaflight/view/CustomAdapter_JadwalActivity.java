package com.example.witono.jogjaflight.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.witono.jogjaflight.BaseApp;
import com.example.witono.jogjaflight.R;

public class CustomAdapter_JadwalActivity extends BaseAdapter {
    Context context;
    String[] countryNames;
    LayoutInflater inflter;

    public CustomAdapter_JadwalActivity(Context applicationContext, String[] countryNames) {
        this.context = applicationContext;

        this.countryNames = countryNames;
        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return countryNames.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflter.inflate(R.layout.custom_spinner_item, null);
        TextView names = (TextView) view.findViewById(R.id.textView);
        names.setText(countryNames[i]);
        return view;
    }
}
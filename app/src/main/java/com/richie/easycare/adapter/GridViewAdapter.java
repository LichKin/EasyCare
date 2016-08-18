package com.richie.easycare.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

/**
 * Created by liqi on 16/8/16.
 */
public class GridViewAdapter extends BaseAdapter {

    Context mContext;
    String[] names;

    public GridViewAdapter(Context context,String[] dnames){
        mContext = context;
        if(dnames!=null&&dnames.length>0){
        names = dnames;
        }
    }

    @Override
    public int getCount() {
        return names==null?0:names.length;
    }

    @Override
    public String getItem(int position) {
        return names[position];
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

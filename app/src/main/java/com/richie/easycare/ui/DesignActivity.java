package com.richie.easycare.ui;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import com.richie.easycare.R;

public class DesignActivity extends Activity {

    private GridView gridView;
    private String[] titles = {"感冒","发烧","咳嗽","头痛","上火","更多..."};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_design);

        init();

    }

    private void init(){
        gridView = (GridView) findViewById(R.id.gridview_main);
        ArrayAdapter adapter = new ArrayAdapter(this,R.layout.item_gridview_main,R.id.item_text,titles);
        gridView.setAdapter(adapter);
    }
}

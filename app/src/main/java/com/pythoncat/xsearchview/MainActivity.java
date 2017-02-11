package com.pythoncat.xsearchview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.pythoncat.xsearchlayout.SearchLayout;
import com.pythoncat.xsearchview.utils.ToastHelper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SearchLayout sl = (SearchLayout) findViewById(R.id.x_search_view);
        sl.getBackIcon().setImageResource(R.mipmap.ic_launcher);
        sl.getBackIcon().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ToastHelper.showShort("BACK...");
            }
        });
        sl.getCloseIcon().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               ToastHelper.showShort("CLOSE...");
            }
        });
    }
}

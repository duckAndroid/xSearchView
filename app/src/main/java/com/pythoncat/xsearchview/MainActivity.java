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
        final SearchLayout sl = (SearchLayout) findViewById(R.id.x_search_view);
        sl.setOnQuery(new SearchLayout.OnQuery() {
            @Override
            public void onQuery(CharSequence sequence) {
                ToastHelper.showShort(sequence);
            }
        });
        sl.setBackClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sl.clearText();
                ToastHelper.showShort("back .....");
//                finish();
            }
        });
    }
}

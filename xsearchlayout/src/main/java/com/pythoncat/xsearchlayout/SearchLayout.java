package com.pythoncat.xsearchlayout;

import android.content.Context;
import android.support.annotation.NonNull;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;

/**
 * @author Administrator
 *         2017/2/11
 *         com.pythoncat.xsearchlayout
 */

public class SearchLayout extends FrameLayout {

    private ImageView backIcon;
    private ImageView closeIcon;

    public ImageView getBackIcon() {
        return backIcon;
    }

    public ImageView getCloseIcon() {
        return closeIcon;
    }

    public EditText getSearchEdit() {
        return searchEdit;
    }

    public RelativeLayout getSearchBorder() {
        return searchBorder;
    }

    private EditText searchEdit;
    private RelativeLayout searchBorder;

    public SearchLayout(Context context) {
        this(context, null);
    }

    public SearchLayout(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public SearchLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        final ViewGroup rootLayout = (ViewGroup) LayoutInflater.from(context)
                .inflate(R.layout.search_layout, this, false);
        addView(rootLayout, new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT));
        initChildViews(rootLayout);
    }

    private void initChildViews(@NonNull ViewGroup rootLayout) {
        searchBorder = (RelativeLayout) rootLayout.findViewById(R.id.search_border);
        backIcon = (ImageView) rootLayout.findViewById(R.id.search_back);
        closeIcon = (ImageView) rootLayout.findViewById(R.id.search_close);
        searchEdit = (EditText) rootLayout.findViewById(R.id.et_search);
    }
}

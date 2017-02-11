package com.pythoncat.xsearchlayout;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
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

    public EditText getEt() {
        return et;
    }

    public RelativeLayout getSearchBody() {
        return searchBody;
    }

    private EditText et;
    private RelativeLayout searchBody;

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
        initChildViews(context, attrs, defStyleAttr, rootLayout);
    }

    private void initChildViews(Context context, AttributeSet attrs,
                                int defStyleAttr, ViewGroup rootLayout) {
        final int backBg, closeBg, rootBg, searchBodyBg, etBg;
        final int textColor, hintColor;
        final int hintRes, textRes;
        final float textSize;
        final int backPaddingStart, backPaddingEnd, backPaddingTop, backPaddingBottom, backPadding;
        final int backMarginStart, backMarginEnd, backMarginTop, backMarginBottom, backMargin;
        final int backIconRes;
        final int backIconVisibility;
        final int closeIconRes;
        final int closeIconVisibility;

        final int closePaddingStart, closePaddingEnd, closePaddingTop, closePaddingBottom, closePadding;
        final int closeMarginStart, closeMarginEnd, closeMarginTop, closeMarginBottom, closeMargin;

        final int etPaddingStart, etPaddingEnd, etPaddingTop, etPaddingBottom, etPadding;
        final int etMarginStart, etMarginEnd, etMarginTop, etMarginBottom, etMargin;

        final int searchBodyPaddingStart, searchBodyPaddingEnd,
                searchBodyPaddingTop, searchBodyPaddingBottom, searchBodyPadding;
        final int searchBodyMarginStart, searchBodyMarginEnd,
                searchBodyMarginTop, searchBodyMarginBottom, searchBodyMargin;

        final int hintIconRes;
        final int hintIconPadding;
        final int backWidth, backHeight, closeWidth, closeHeight, etWidth, etHeight;
        TypedArray array = context.getTheme()
                .obtainStyledAttributes(attrs, R.styleable.X_SearchView, defStyleAttr, 0);

        backWidth = (int) array.getDimension(R.styleable.X_SearchView_back_width, -1);
        backHeight = (int) array.getDimension(R.styleable.X_SearchView_back_height, -1);
        closeWidth = (int) array.getDimension(R.styleable.X_SearchView_close_width, -1);
        closeHeight = (int) array.getDimension(R.styleable.X_SearchView_close_height, -1);
        etWidth = (int) array.getDimension(R.styleable.X_SearchView_et_width, -1);
        etHeight = (int) array.getDimension(R.styleable.X_SearchView_et_height, -1);


        hintIconRes = array.getResourceId(R.styleable.X_SearchView_hint_src, R.drawable.search_hint_icon);
        hintIconPadding = (int) array.getDimension(R.styleable.X_SearchView_hint_padding, -1);

        closeMarginStart = (int) array.getDimension(R.styleable.X_SearchView_close_margin_start, -1);
        closeMarginEnd = (int) array.getDimension(R.styleable.X_SearchView_close_margin_end, -1);
        closeMarginTop = (int) array.getDimension(R.styleable.X_SearchView_close_margin_top, -1);
        closeMarginBottom = (int) array.getDimension(R.styleable.X_SearchView_close_margin_bottom, -1);
        closeMargin = (int) array.getDimension(R.styleable.X_SearchView_close_margin, -1);

        closePaddingStart = (int) array.getDimension(R.styleable.X_SearchView_close_padding_start, -1);
        closePaddingEnd = (int) array.getDimension(R.styleable.X_SearchView_close_padding_end, -1);
        closePaddingTop = (int) array.getDimension(R.styleable.X_SearchView_close_padding_top, -1);
        closePaddingBottom = (int) array.getDimension(R.styleable.X_SearchView_close_padding_bottom, -1);
        closePadding = (int) array.getDimension(R.styleable.X_SearchView_close_padding, -1);
        searchBodyMarginStart = (int) array.getDimension(R.styleable.X_SearchView_search_body_margin_start, -1);
        searchBodyMarginEnd = (int) array.getDimension(R.styleable.X_SearchView_search_body_margin_end, -1);
        searchBodyMarginTop = (int) array.getDimension(R.styleable.X_SearchView_search_body_margin_top, -1);
        searchBodyMarginBottom = (int) array.getDimension(R.styleable.X_SearchView_search_body_margin_bottom, -1);
        searchBodyMargin = (int) array.getDimension(R.styleable.X_SearchView_search_body_margin, -1);

        searchBodyPaddingStart = (int) array.getDimension(R.styleable.X_SearchView_search_body_padding_start, -1);
        searchBodyPaddingEnd = (int) array.getDimension(R.styleable.X_SearchView_search_body_padding_end, -1);
        searchBodyPaddingTop = (int) array.getDimension(R.styleable.X_SearchView_search_body_padding_top, -1);
        searchBodyPaddingBottom = (int) array.getDimension(R.styleable.X_SearchView_search_body_padding_bottom, -1);
        searchBodyPadding = (int) array.getDimension(R.styleable.X_SearchView_search_body_padding, -1);

        etMarginStart = (int) array.getDimension(R.styleable.X_SearchView_et_margin_start, -1);
        etMarginEnd = (int) array.getDimension(R.styleable.X_SearchView_et_margin_end, -1);
        etMarginTop = (int) array.getDimension(R.styleable.X_SearchView_et_margin_top, -1);
        etMarginBottom = (int) array.getDimension(R.styleable.X_SearchView_et_margin_bottom, -1);
        etMargin = (int) array.getDimension(R.styleable.X_SearchView_et_margin, -1);

        etPaddingStart = (int) array.getDimension(R.styleable.X_SearchView_et_padding_start, -1);
        etPaddingEnd = (int) array.getDimension(R.styleable.X_SearchView_et_padding_end, -1);
        etPaddingTop = (int) array.getDimension(R.styleable.X_SearchView_et_padding_top, -1);
        etPaddingBottom = (int) array.getDimension(R.styleable.X_SearchView_et_padding_bottom, -1);
        etPadding = (int) array.getDimension(R.styleable.X_SearchView_et_padding, -1);

        closeIconRes = array.getResourceId(R.styleable.X_SearchView_close_src, R.drawable.search_close_icon);
        closeIconVisibility = array.getInt(R.styleable.X_SearchView_close_visibility, View.VISIBLE);
        backIconRes = array.getResourceId(R.styleable.X_SearchView_back_src, R.drawable.search_back_icon);
        backIconVisibility = array.getInt(R.styleable.X_SearchView_back_visibility, View.VISIBLE);

        backMarginStart = (int) array.getDimension(R.styleable.X_SearchView_back_margin_start, -1);
        backMarginEnd = (int) array.getDimension(R.styleable.X_SearchView_back_margin_end, -1);
        backMarginTop = (int) array.getDimension(R.styleable.X_SearchView_back_margin_top, -1);
        backMarginBottom = (int) array.getDimension(R.styleable.X_SearchView_back_margin_bottom, -1);
        backMargin = (int) array.getDimension(R.styleable.X_SearchView_back_margin, -1);

        backPaddingStart = (int) array.getDimension(R.styleable.X_SearchView_back_padding_start, -1);
        backPaddingEnd = (int) array.getDimension(R.styleable.X_SearchView_back_padding_end, -1);
        backPaddingTop = (int) array.getDimension(R.styleable.X_SearchView_back_padding_top, -1);
        backPaddingBottom = (int) array.getDimension(R.styleable.X_SearchView_back_padding_bottom, -1);
        backPadding = (int) array.getDimension(R.styleable.X_SearchView_back_padding, -1);

        textSize = array.getDimension(R.styleable.X_SearchView_text_size, -1);
        textColor = array.getColor(R.styleable.X_SearchView_text_color, Color.BLACK);
        hintColor = array.getColor(R.styleable.X_SearchView_hint_color, Color.BLACK);
        textRes = array.getResourceId(R.styleable.X_SearchView_search_text, R.string.empty);
        hintRes = array.getResourceId(R.styleable.X_SearchView_search_hint, R.string.app_name);
        backBg = array.getResourceId(R.styleable.X_SearchView_back_background, R.color.colorAccent);
        closeBg = array.getResourceId(R.styleable.X_SearchView_close_background, R.color.transparent);
        rootBg = array.getResourceId(R.styleable.X_SearchView_root_background, R.color.transparent);
        searchBodyBg = array.getResourceId(R.styleable.X_SearchView_search_body_background,
                R.color.transparent);
        etBg = array.getResourceId(R.styleable.X_SearchView_et_background, R.color.transparent);
        array.recycle();

        searchBody = (RelativeLayout) rootLayout.findViewById(R.id.search_border);
        //        searchBody.setBackgroundResource(R.color.colorPrimary); // ok !!!
        backIcon = (ImageView) rootLayout.findViewById(R.id.search_back);
        closeIcon = (ImageView) rootLayout.findViewById(R.id.search_close);
        et = (EditText) rootLayout.findViewById(R.id.et_search);
        // todo ---> set data
        rootLayout.setBackgroundResource(rootBg);
        backIcon.setBackgroundResource(backBg);
        closeIcon.setBackgroundResource(closeBg);
        searchBody.setBackgroundResource(searchBodyBg);
        et.setBackgroundResource(etBg);
        et.setHint(hintRes);
        et.setText(textRes);
        et.setTextColor(textColor);
        et.setHintTextColor(hintColor);
        et.setTextSize(textSize);

        if (etPadding >= 0) {
            et.setPadding(etPadding, etPadding, etPadding, etPadding);
        } else if (etPaddingStart >= 0 || etPaddingTop >= 0
                || etPaddingEnd >= 0 || etPaddingBottom > 0) {
            et.setPadding(leastZero(etPaddingStart), leastZero(etPaddingTop),
                    leastZero(etPaddingEnd), leastZero(etPaddingBottom));
        }
        final ViewGroup.LayoutParams params3= et.getLayoutParams();
        if (params3 instanceof RelativeLayout.LayoutParams) {
            // todo ->
            RelativeLayout.LayoutParams rp = (RelativeLayout.LayoutParams) params3;
            if (etMargin > 0) {
                rp.setMargins(etMargin, etMargin, etMargin, etMargin);
            } else if (etMarginStart > 0 || etMarginTop > 0
                    || etMarginEnd > 0 || etMarginBottom > 0) {
                rp.setMargins(leastZero(etMarginStart), leastZero(etMarginTop),
                        leastZero(etMarginEnd), leastZero(etMarginBottom));
            }
        }
        if (searchBodyPadding >= 0) {
            searchBody.setPadding(searchBodyPadding, searchBodyPadding, searchBodyPadding, searchBodyPadding);
        } else if (searchBodyPaddingStart >= 0 || searchBodyPaddingTop >= 0
                || searchBodyPaddingEnd >= 0 || searchBodyPaddingBottom > 0) {
            searchBody.setPadding(leastZero(searchBodyPaddingStart), leastZero(searchBodyPaddingTop),
                    leastZero(searchBodyPaddingEnd), leastZero(searchBodyPaddingBottom));
        }
        final ViewGroup.LayoutParams params4= searchBody.getLayoutParams();
        if (params4 instanceof RelativeLayout.LayoutParams) {
            // todo ->
            RelativeLayout.LayoutParams rp = (RelativeLayout.LayoutParams) params4;
            if (searchBodyMargin > 0) {
                rp.setMargins(searchBodyMargin, searchBodyMargin, searchBodyMargin, searchBodyMargin);
            } else if (searchBodyMarginStart > 0 || searchBodyMarginTop > 0
                    || searchBodyMarginEnd > 0 || searchBodyMarginBottom > 0) {
                rp.setMargins(leastZero(searchBodyMarginStart), leastZero(searchBodyMarginTop),
                        leastZero(searchBodyMarginEnd), leastZero(searchBodyMarginBottom));
            }
        }


        if (backPadding >= 0) {
            backIcon.setPadding(backPadding, backPadding, backPadding, backPadding);
        } else if (backPaddingStart >= 0 || backPaddingTop >= 0
                || backPaddingEnd >= 0 || backPaddingBottom > 0) {
            backIcon.setPadding(leastZero(backPaddingStart), leastZero(backPaddingTop),
                    leastZero(backPaddingEnd), leastZero(backPaddingBottom));
        }
        final ViewGroup.LayoutParams params1 = backIcon.getLayoutParams();
        if (params1 instanceof RelativeLayout.LayoutParams) {
            // todo ->
            RelativeLayout.LayoutParams rp = (RelativeLayout.LayoutParams) params1;
            if (backMargin > 0) {
                rp.setMargins(backMargin, backMargin, backMargin, backMargin);
            } else if (backMarginStart > 0 || backMarginTop > 0
                    || backMarginEnd > 0 || backMarginBottom > 0) {
                rp.setMargins(leastZero(backMarginStart), leastZero(backMarginTop),
                        leastZero(backMarginEnd), leastZero(backMarginBottom));
            }
        }
        backIcon.setImageResource(backIconRes);
        //noinspection WrongConstant // only can 0,4,8 !!!
        backIcon.setVisibility(backIconVisibility);

        closeIcon.setImageResource(closeIconRes);
        //noinspection WrongConstant // only can 0,4,8 !!!
        closeIcon.setVisibility(closeIconVisibility);

        if (closePadding > 0) {
            closeIcon.setPadding(closePadding, closePadding, closePadding, closePadding);
        } else if (closePaddingStart > 0 || closePaddingTop > 0
                || closePaddingEnd > 0 || closePaddingBottom > 0) {
            closeIcon.setPadding(leastZero(closePaddingStart), leastZero(closePaddingTop),
                    leastZero(closePaddingEnd), leastZero(closePaddingBottom));
        }
        final ViewGroup.LayoutParams params2 = closeIcon.getLayoutParams();
        if (params2 instanceof RelativeLayout.LayoutParams) {
            // todo ->
            RelativeLayout.LayoutParams rp = (RelativeLayout.LayoutParams) params2;
            if (closeMargin > 0) {
                rp.setMargins(closeMargin, closeMargin, closeMargin, closeMargin);
            } else if (closeMarginStart > 0 || closeMarginTop > 0
                    || closeMarginEnd > 0 || closeMarginBottom > 0) {
                rp.setMargins(leastZero(closeMarginStart), leastZero(closeMarginTop),
                        leastZero(closeMarginEnd), leastZero(closeMarginBottom));
            }
        }
        Drawable drawable = getResources().getDrawable(hintIconRes);
        /// 这一步必须要做,否则不会显示.
        drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        et.setCompoundDrawables(drawable, null, null, null);
        et.setCompoundDrawablePadding(hintIconPadding);

        setLayoutWidth(backIcon, backWidth);
        setLayoutWidth(closeIcon, closeWidth);
        setLayoutWidth(et, etWidth);
        setLayoutHeight(backIcon, backHeight);
        setLayoutHeight(closeIcon, closeHeight);
        setLayoutHeight(et, etHeight);
    }

    private int leastZero(int backPaddingStart) {
        return backPaddingStart > 0 ? backPaddingStart : 0;
    }


    static int dp2Px(Context context, float dp) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dp * scale + 0.5f);
    }

    /**
     * from: http://www.tuicool.com/articles/rAbeya <br/>
     * 設置View的寬度（像素），若設置爲自適應則應該傳入MarginLayoutParams.WRAP_CONTENT
     *
     * @param view  v
     * @param width w
     */
    static void setLayoutWidth(@NonNull View view, int width) {
       /* MarginLayoutParams margin=new MarginLayoutParams(view.getLayoutParams());
        margin.setMargins(margin.leftMargin,y, margin.rightMargin, y+margin.height);
        //RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(margin);
        //view.setLayoutParams(layoutParams);
        ViewGroup.MarginLayoutParams  layoutParams =newLayParms(view, margin);
        //RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(margin);
        view.setLayoutParams(layoutParams);
        view.requestLayout();*/
        if (width < 0) return;
        if (view.getParent() instanceof FrameLayout) {
            FrameLayout.LayoutParams lp = (FrameLayout.LayoutParams) view.getLayoutParams();
            lp.width = width;
            view.setLayoutParams(lp);
            //view.setX(x);
            view.requestLayout();
        } else if (view.getParent() instanceof RelativeLayout) {
            RelativeLayout.LayoutParams lp = (RelativeLayout.LayoutParams) view.getLayoutParams();
            lp.width = width;
            view.setLayoutParams(lp);
            //view.setX(x);
            view.requestLayout();
        } else if (view.getParent() instanceof LinearLayout) {
            LinearLayout.LayoutParams lp = (LinearLayout.LayoutParams) view.getLayoutParams();
            lp.width = width;
            view.setLayoutParams(lp);
            //view.setX(x);
            view.requestLayout();
        }
    }

    /**
     * from: http://www.tuicool.com/articles/rAbeya <br/>
     * 設置View的寬度（像素），若設置爲自適應則應該傳入MarginLayoutParams.WRAP_CONTENT
     *
     * @param view   v
     * @param height w
     */
    static void setLayoutHeight(@NonNull View view, int height) {
       /* MarginLayoutParams margin=new MarginLayoutParams(view.getLayoutParams());
        margin.setMargins(margin.leftMargin,y, margin.rightMargin, y+margin.height);
        //RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(margin);
        //view.setLayoutParams(layoutParams);
        ViewGroup.MarginLayoutParams  layoutParams =newLayParms(view, margin);
        //RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(margin);
        view.setLayoutParams(layoutParams);
        view.requestLayout();*/
        if (height < 0) return;
        if (view.getParent() instanceof FrameLayout) {
            FrameLayout.LayoutParams lp = (FrameLayout.LayoutParams) view.getLayoutParams();
            lp.height = height;
            view.setLayoutParams(lp);
            //view.setX(x);
            view.requestLayout();
        } else if (view.getParent() instanceof RelativeLayout) {
            RelativeLayout.LayoutParams lp = (RelativeLayout.LayoutParams) view.getLayoutParams();
            lp.height = height;
            view.setLayoutParams(lp);
            //view.setX(x);
            view.requestLayout();
        } else if (view.getParent() instanceof LinearLayout) {
            LinearLayout.LayoutParams lp = (LinearLayout.LayoutParams) view.getLayoutParams();
            lp.height = height;
            view.setLayoutParams(lp);
            //view.setX(x);
            view.requestLayout();
        }
    }
}

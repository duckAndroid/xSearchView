# xSearchView
一个失败的自定义控件

* 使用最原始的方式，组合了一个搜索框控件
* 但是，实现很麻烦，也不好使用，自定义属性太多。容易让人晕头转向
<pre>

Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
Step 2. Add the dependency

	dependencies {
	        compile 'com.github.duckAndroid:xSearchView:0.0.1'
	}
  
Step 3. use in you layoput and Activity/Fragment/ViewGroup

```
  <com.pythoncat.xsearchlayout.SearchLayout
        android:id="@+id/x_search_view"
        android:layout_width="match_parent"
        android:layout_height="?attr/actionBarSize"/>
  
  
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
                //  finish();
            }
        });
```
</pre>

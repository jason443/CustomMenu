package com.jason.custommenu;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Window;

/**
 * Created by jason on 2016/9/13.
 *
 */
public class ZhiHuActivity  extends Activity{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_zhihu);

        Toolbar toolbar = (Toolbar) findViewById(R.id.zhihu_toolbar);
        toolbar.setNavigationIcon(R.drawable.now);
        toolbar.inflateMenu(R.menu.zhihu_toolbar_menu);
    }
}

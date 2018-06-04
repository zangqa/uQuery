package com.zangqa.uquery.Home;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;
import com.zangqa.uquery.R;
import com.zangqa.uquery.Utils.BottomNavigationViewHelper;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Main Activity";
    private Context mContext = MainActivity.this;
    private static final int ACTIVITY_NUM = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate: Main Activity Successfully Started");
        setupBottomNavigationView();
    }

    /**
     * BottomNavigationView setup
     */
    private void setupBottomNavigationView(){
        Log.d(TAG, "setupBottomNavigationView: Setting up BottomNavigationView");
        BottomNavigationViewEx bottomNavigationViewEx = findViewById(R.id.navigation);
        BottomNavigationViewHelper.setupBottomNavigationView(bottomNavigationViewEx);
        BottomNavigationViewHelper.enableNavigation(mContext, bottomNavigationViewEx);
        Menu menu = bottomNavigationViewEx.getMenu();
        MenuItem menuItem = menu.getItem(ACTIVITY_NUM);
        menuItem.setChecked(true);
    }
}

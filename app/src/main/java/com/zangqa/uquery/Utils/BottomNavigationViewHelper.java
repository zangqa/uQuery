package com.zangqa.uquery.Utils;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.util.Log;
import android.view.MenuItem;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;
import com.zangqa.uquery.Dashboard.DashboardActivity;
import com.zangqa.uquery.Home.MainActivity;
import com.zangqa.uquery.Private.PrivateActivity;
import com.zangqa.uquery.R;

public class BottomNavigationViewHelper {

    private static final String TAG = "Main Activity";

    public static void setupBottomNavigationView(BottomNavigationViewEx bottomNavigationViewEx) {

        Log.d(TAG, "setupBottomNavigationView: Setting up Bottom Navigation View");

        bottomNavigationViewEx.enableAnimation(false);
        bottomNavigationViewEx.enableItemShiftingMode(false);
        bottomNavigationViewEx.enableShiftingMode(false);
        bottomNavigationViewEx.setTextVisibility(false);
    }

    public static void enableNavigation(final Context context, BottomNavigationViewEx view) {
        view.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                Log.d(TAG, "onNavigationItemSelected: onNavigationItemSelected Method Called");

                switch (item.getItemId()) {

                    case R.id.navigation_home: //ACTIVITY_NUM = 0
                        Intent intent1 = new Intent(context, MainActivity.class);
                        context.startActivity(intent1);
                        break;

                    case R.id.navigation_dashboard: //ACTIVITY_NUM = 1
                        Intent intent2 = new Intent(context, DashboardActivity.class);
                        context.startActivity(intent2);
                        break;

                    case R.id.navigation_private: //ACTIVITY_NUM = 2
                        Intent intent3 = new Intent(context, PrivateActivity.class);
                        context.startActivity(intent3);
                        break;
                }

                return true;

            }
        });
    }
}

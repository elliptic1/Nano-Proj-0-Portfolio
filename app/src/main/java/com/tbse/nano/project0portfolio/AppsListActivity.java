package com.tbse.nano.project0portfolio;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class AppsListActivity extends Activity implements View.OnTouchListener {

    private Toast myToast;

    @SuppressLint("ShowToast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apps_list);

        Button btn_spotify = (Button) findViewById(R.id.btn_spotify);
        Button btn_super_duo_football_scores = (Button) findViewById(R.id.btn_super_duo_football_scores);
        Button btn_super_duo_library_app = (Button) findViewById(R.id.btn_super_duo_library_app);
        Button btn_build_it_bigger = (Button) findViewById(R.id.btn_build_it_bigger);
        Button btn_xyz_reader = (Button) findViewById(R.id.btn_xyz_reader);
        Button btn_capstone = (Button) findViewById(R.id.btn_capstone);

        btn_spotify.setOnTouchListener(this);
        btn_super_duo_football_scores.setOnTouchListener(this);
        btn_super_duo_library_app.setOnTouchListener(this);
        btn_build_it_bigger.setOnTouchListener(this);
        btn_xyz_reader.setOnTouchListener(this);
        btn_capstone.setOnTouchListener(this);

        myToast = Toast.makeText(this, "", Toast.LENGTH_SHORT);

    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {

        int action = event.getAction();

        switch (action) {
            case MotionEvent.ACTION_DOWN:
                if (v.getId() == R.id.btn_capstone) {
                    v.setBackgroundColor(getResources().getColor(R.color.accent_dark));
                } else {
                    v.setBackgroundColor(getResources().getColor(R.color.primary_dark));
                }
                break;
            case MotionEvent.ACTION_UP:
                myToast.setText("This button will launch my app " + ((Button)v).getText() + "!");
                myToast.show();
                // flow into ACTION_CANCEL
            case MotionEvent.ACTION_CANCEL:
                if (v.getId() == R.id.btn_capstone) {
                    v.setBackgroundColor(getResources().getColor(R.color.accent));
                } else {
                    v.setBackgroundColor(getResources().getColor(R.color.primary_med));
                }
                break;
        }

        return false;
    }

}

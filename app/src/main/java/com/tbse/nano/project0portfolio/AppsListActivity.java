package com.tbse.nano.project0portfolio;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class AppsListActivity extends Activity {

    private Toast myToast;

    @SuppressLint("ShowToast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apps_list);

        myToast = Toast.makeText(this, "", Toast.LENGTH_SHORT);

    }

    public void btnClick(View v) {

        myToast.setText("This button will launch my app " + ((Button)v).getText() + "!");
        myToast.show();

    }

}

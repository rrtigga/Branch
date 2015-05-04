package com.challenge.branch;

/**
 * Created by Spicycurryman on 3/12/15.
 */

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;



public class NextActivity extends Activity {

    // UI References
    private TextView textTxt;

    private String text;

    SharedPreference sharedPreference;

    Activity context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        sharedPreference = new SharedPreference();

        findViewsById();

        //Retrieve a value from SharedPreference
        text = sharedPreference.getValue(context);
        textTxt.setText(text);

    }

    private void findViewsById() {
        textTxt = (TextView) findViewById(R.id.txt_text);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
}
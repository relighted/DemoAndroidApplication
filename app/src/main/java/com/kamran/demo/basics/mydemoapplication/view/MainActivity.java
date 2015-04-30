package com.kamran.demo.basics.mydemoapplication.view;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.kamran.demo.basics.mydemoapplication.MyService;
import com.kamran.demo.basics.mydemoapplication.R;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnButton0 = (Button) findViewById(R.id.btnButton0);
        btnButton0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentForActivity = new Intent(MainActivity.this, AnotherActivity.class);
                startActivity(intentForActivity);
            }
        });

        Button btnButton1 = (Button) findViewById(R.id.btnButton1);
        btnButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentForActivity = new Intent(MainActivity.this, MyService.class);
                startService(intentForActivity);
            }
        });

        Button btnButton2 = (Button) findViewById(R.id.btnButton2);
        btnButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentForActivity = new Intent(MainActivity.this, MyService.class);
                stopService(intentForActivity);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Toast.makeText(MainActivity.this, "You clicked settings from the menu", Toast.LENGTH_LONG).show();

            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

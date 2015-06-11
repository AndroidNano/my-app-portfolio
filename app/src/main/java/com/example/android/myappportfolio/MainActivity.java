package com.example.android.myappportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    //Button Toasts
    public void button1 (View view) {
        // Call Toast to show msg
        Toast.makeText(this, "This button will launch my Spotify Streamer App", Toast.LENGTH_SHORT).show();
    }

    public void button2 (View view) {
        // Call Toast to show msg
        Toast.makeText(this, "This button will launch my Football Scores App", Toast.LENGTH_SHORT).show();
    }

    public void button3 (View view) {
        // Call Toast to show msg
        Toast.makeText(this, "This button will launch my Library App", Toast.LENGTH_SHORT).show();
    }

    public void button4 (View view) {
        // Call Toast to show msg
        Toast.makeText(this, "This button will launch my Build It Bigger App", Toast.LENGTH_SHORT).show();
    }

    public void button5 (View view) {
        // Call Toast to show msg
        Toast.makeText(this, "This button will launch my XYZ Reader App", Toast.LENGTH_SHORT).show();
    }

    public void button6 (View view) {
        // Call Toast to show msg
        Toast.makeText(this, "This button will launch my Capstone App", Toast.LENGTH_SHORT).show();
    }


}

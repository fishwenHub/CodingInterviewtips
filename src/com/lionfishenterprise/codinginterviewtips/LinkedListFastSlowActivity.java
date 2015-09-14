
package com.lionfishenterprise.codinginterviewtips;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class LinkedListFastSlowActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linked_list_fast_slow);
        getActionBar().setDisplayHomeAsUpEnabled(true);
        TextView problemDescription = (TextView) findViewById(R.id.problem_description);
        problemDescription.setText(R.string.linkedlist_remove_nth_node);
        ImageView  solutionImage = (ImageView) findViewById(R.id.linkedlist_remove_nthfromend_solution);
        solutionImage.setImageResource(R.drawable.linkedlist_remove_nthfromend_solution);
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.linked_list_fast_slow, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}


package com.lionfishenterprise.codinginterviewtips;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.os.Build;

public class MainActivity extends Activity{
    
    private static Button mButton1, mButton2, mButtonLinkedListSlowFast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        getWindow().getDecorView().setBackgroundColor(getResources().getColor(android.R.color.holo_blue_bright));
        getWindow().getDecorView().setBackgroundColor(Color.parseColor("#B9E8EE"));
        
        if (savedInstanceState == null) {
            getFragmentManager().beginTransaction().add(R.id.container, new PlaceholderFragment())
                    .commit();
        }
//        mContactDetail = (ImageView) findViewById(R.id.contact_details_image);
//        mContactDetail.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                showNativeContactDetail();
//            }
//        });
        onClickButton1Listener();
        onClickButton2Listener();
        mButtonLinkedListSlowFast = (Button) findViewById(R.id.button_linkedlist_slowfast_ptr);
        mButtonLinkedListSlowFast.setOnClickListener(new View.OnClickListener() {
            
            @Override
            public void onClick(View v) {
                Intent launchLinkListIntent = new Intent("com.lionfishenterprise.codinginterviewtips.LinkedListFastSlowActivity");
                startActivity(launchLinkListIntent);
            }
        });

    }
        
       public void onClickButton1Listener() {
           mButton1 = (Button)findViewById(R.id.button1);
           
           mButton1.setOnClickListener(new View.OnClickListener() {
               
               @Override
               public void onClick(View v) {
                   Intent launchWebLinkIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.programcreek.com/2012/11/top-10-algorithms-for-coding-interview/"));
                   startActivity(launchWebLinkIntent);
               }
           });
       }
        
       public void onClickButton2Listener() {
           mButton2 = (Button)findViewById(R.id.button2);
           
           mButton2.setOnClickListener(new View.OnClickListener() {
               
               @Override
               public void onClick(View v) {
                   Intent launchDetailCodeIntent = new Intent("com.lionfishenterprise.codinginterviewtips.DetailedCodeActivity");
                   startActivity(launchDetailCodeIntent);
               }
           });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            return rootView;
        }
    }

}

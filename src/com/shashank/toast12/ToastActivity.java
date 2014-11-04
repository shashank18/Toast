package com.shashank.toast12;

/* Simple Code to understand the concept of Toasts
 * Import the project and run for best results
 * Author: Shashank S Mirji
 * email: shashankmirji@gmail.com*/
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class ToastActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Button b= (Button) findViewById(R.id.button1);
        b.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Toast.makeText(getBaseContext(), "I am toast message",Toast.LENGTH_LONG).show();
			}
		});
    }
}
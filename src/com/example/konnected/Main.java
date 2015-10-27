package com.example.konnected;

import java.security.PublicKey;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class Main extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		getActionBar().hide();
		
		Intent i = getIntent();
	    Bundle extras=i.getExtras();
		String user = extras.getString("username");
		TextView usertTextView=(TextView) findViewById(R.id.textView1);
		usertTextView.setText(".."+user);
		
		ImageButton notifyb = (ImageButton) findViewById(R.id.ImageButton01);
			notifyb.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(Main.this,Notify.class);
				startActivity(intent);
				
			}
		});
			ImageButton todob = (ImageButton) findViewById(R.id.imageButton1);
			todob.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(Main.this,TodoActivity.class);
				startActivity(intent);
				
			}
		});
			
			ImageButton map = (ImageButton) findViewById(R.id.ImageButton02);
			map.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(Main.this,MapActivity.class);
				startActivity(intent);
				
			}
		});
			
			ImageButton setting = (ImageButton) findViewById(R.id.ImageButton03);
			setting.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(Main.this,SettingsActivity.class);
				startActivity(intent);
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.login, menu);
		return true;
	}
}

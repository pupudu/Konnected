package com.example.konnected;

import android.app.Activity;
import android.os.Bundle;
public class Notify extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.notify);
		getActionBar().hide();
		
	}

}

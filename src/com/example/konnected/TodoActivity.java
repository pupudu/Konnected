package com.example.konnected;

import android.app.Activity;
import android.os.Bundle;

public class TodoActivity extends Activity {

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.todo);
		getActionBar().hide();
		
	}
}

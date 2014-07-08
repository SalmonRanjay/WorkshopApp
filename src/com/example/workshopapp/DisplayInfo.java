package com.example.workshopapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class DisplayInfo extends ActionBarActivity {

	TextView nameDisplay, emailDisplay;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		init();
		
		setData();
	}

	private void setData() {
		Intent intent = getIntent();
		String name = intent.getStringExtra("name");
		String email = intent.getStringExtra("email");
		Log.v("DisplayINFO", "Name value received: "+name);
		Log.v("DisplayINFO", "Email value received: "+email);
		nameDisplay.setText(name);
		emailDisplay.setText(email);
	}

	private void init() {
		nameDisplay = (TextView) findViewById(R.id.nameDisplay);
		emailDisplay = (TextView) findViewById(R.id.emailDisplay);
		
		
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
}

package com.example.workshopapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class WorkShopMain extends ActionBarActivity {

	Button signInButton;
	EditText nameIn, emailIn;
	Intent intent;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_work_shop_main);
		
		//Initialise views
		init();
		
		signInButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				String name = nameIn.getText().toString();
				String email = emailIn.getText().toString();
				
				
				intent.putExtra("name", name);
				intent.putExtra("email", email);
				
				startActivity(intent);
				Log.v("signInbutton", "Name value  sent: "+name);
				Log.v("signInbutton", "Email value sent: "+email);
				
			}
		});
	}

	private void init() {
		// TODO Auto-generated method stub
		signInButton = (Button) findViewById(R.id.button1);
		nameIn = (EditText) findViewById(R.id.nameEditText);
		emailIn = (EditText) findViewById(R.id.emailEditText);
		intent = new Intent(this, DisplayInfo.class);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.work_shop_main, menu);
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

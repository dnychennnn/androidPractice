package com.example.androidtry;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity_1 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_activity_1);
		
		
		 EditText myEditText = (EditText)findViewById(R.id.editText1);
		myEditText.setText(this.getIntent().getStringExtra("passedData"));
		 
		 Button backButton = (Button)findViewById(R.id.backButton);
		 backButton.setOnClickListener(new OnClickListener(){
			 @Override 
			 	public void onClick(View arg0) {
				 Intent myIntent = new Intent();
				
				 EditText myEditText = (EditText)findViewById(R.id.editText1);
				 String str = myEditText.getText().toString();
				 EditText myEditText2 = (EditText)findViewById(R.id.editText2);
				 String str1 = myEditText2.getText().toString();
				 int value = Integer.valueOf(str).intValue();
				 int value2 = Integer.valueOf(str1).intValue();
				 value = value + value2;
				 String s = Integer.toString(value);
				 myIntent.putExtra("returnData", s);
				 
				 setResult(200,myIntent);
				 finish();
			 }
		 });
		 
	}
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_activity_1, menu);
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

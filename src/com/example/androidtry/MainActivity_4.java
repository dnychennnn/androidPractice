package com.example.androidtry;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;

public class MainActivity_4 extends Activity {
	ArrayAdapter<String> myArrayAdapter;
	
	String Str;
	EditText myedittext;
	// List<String> mylist = new ArrayList();
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_activity_4);
		
		GridView mygridview = (GridView)findViewById(R.id.gridView1);
		final List<String> mylist = new ArrayList();  //declaring var using final means read-only.
		
		myArrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, mylist);
		mygridview.setAdapter(myArrayAdapter);

		myedittext = (EditText)findViewById(R.id.editText1);
		
		Button mybutton1 = (Button)findViewById(R.id.button1);
		mybutton1.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Str = myedittext.getText().toString();
				mylist.add(Str);
				myArrayAdapter.notifyDataSetChanged();
				}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_activity_4, menu);
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

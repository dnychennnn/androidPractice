package com.example.androidtry;

import java.util.ArrayList;
import java.util.List;


import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.view.View.OnClickListener;

public class MainActivity_2 extends Activity {

	List<String> myStrList = new ArrayList();
	ArrayAdapter<String> myArrayAdapter;
	String keywordStr;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_activity_2);
		myStrList.add("UCLA");
		myStrList.add("UW");
		myStrList.add("CMU");
		
		ListView myListView = (ListView)findViewById(R.id.listView1);

		myArrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, myStrList);
		myListView.setAdapter(myArrayAdapter);
		
		
		Button button1 = (Button)findViewById(R.id.button1);
		button1.setOnClickListener(new OnClickListener(){
			
			

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				EditText keyword = (EditText) findViewById(R.id.editText1);
				keywordStr = keyword.getText().toString();
				myStrList.add(keywordStr);
				myArrayAdapter.notifyDataSetChanged();
			}
		});
	
		Button button2 = (Button)findViewById(R.id.button2);
		button2.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				EditText keyword = (EditText) findViewById(R.id.editText1);
				keywordStr = keyword.getText().toString();
//				if(!myStrList.isEmpty())
//				{
				   	myStrList.remove(keywordStr);
					myArrayAdapter.notifyDataSetChanged();
//				}
			}
		});

		}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_activity_2, menu);
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

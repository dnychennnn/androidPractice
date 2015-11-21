package com.example.androidtry;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class MainActivity_5 extends Activity {
	
	List<HashMap<String, Object>> myDataList = new ArrayList<HashMap<String, Object>>();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_activity_5);
		
		HashMap<String, Object> itemHashMap;
		itemHashMap = new HashMap<String, Object>();
		itemHashMap.put("MainImage", R.drawable.ic_launcher);  //新增照片
		itemHashMap.put("Title", "Apple");
		itemHashMap.put("SubTitle", "0973513763");
		myDataList.add(itemHashMap);
		
		itemHashMap = new HashMap<String, Object>();
		itemHashMap.put("Title", "Banana");
		itemHashMap.put("SubTitle", "0973521312");
		myDataList.add(itemHashMap);
		
		itemHashMap = new HashMap<String, Object>();
		itemHashMap.put("Title", "MicroSoft");
		itemHashMap.put("SubTitle", "0973523423");
		myDataList.add(itemHashMap);
		
		ListView myListview = (ListView)findViewById(R.id.listView1);
		
		SimpleAdapter simpleadapter = new SimpleAdapter(
				this, //context
				myDataList,
				R.layout.listview_item_layout, //自訂的layout
				new String[]{"MainImage","Title", "SubTitle" }, 
				new int[]{R.id.imageView1, R.id.TitleTextView, R.id.SubTitleTextView }); //抓畫面
		
		myListview.setAdapter(simpleadapter);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_activity_5, menu);
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

package com.example.androidtry;


import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//瀏覽google
//		Button button = (Button)findViewById(R.id.button1);
//        
//		 button.setOnClickListener(new OnClickListener() {
//		   
//		   @Override
//		   public void onClick(View arg0) {
//			   Intent myintent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
//			   startActivity(myintent);
//		   }
//
//		  });
		
//		 //自動打電話
//		 Button button2 = (Button)findViewById(R.id.button2);
//		 
//		 button2.setOnClickListener(new OnClickListener() {
//			   
//			   @Override
//			   public void onClick(View arg0) {
//				   Intent myintent1 = new Intent(Intent.ACTION_CALL, Uri.parse("tel:0973513763"));
//				   startActivity(myintent1);
//			   }
//
//			  });
		
		//將資料傳到另一個MainActivity_1
		 Button button3 = (Button)findViewById(R.id.button3);
		 button3.setOnClickListener(new OnClickListener() {
			 @Override
			   public void onClick(View arg0) {
				   Intent myintent2 = new Intent(MainActivity.this, MainActivity_1.class);
				   
				   
				   EditText myEditText = (EditText)findViewById(R.id.editText);
					 String str = myEditText.getText().toString();
					 myintent2.putExtra("passedData", str);
				   startActivity(myintent2);
			   }
		 });
			 
		 //跑到MainAcitivity_1
		 Button getReturnButton = (Button)findViewById(R.id.getReturnButton);
		 getReturnButton.setOnClickListener(new OnClickListener() {
			 @Override 
			 	public void onClick(View arg0) {
				 Intent myIntent = new Intent(MainActivity.this, MainActivity_1.class);
				  EditText myEditText = (EditText)findViewById(R.id.editText);
					 String str = myEditText.getText().toString();
					 myIntent.putExtra("passedData", str);
				 startActivityForResult(myIntent, 214736);
			 }
		 });
		 
		 Button button7 = (Button)findViewById(R.id.button7);
		 button7.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent urIntent = new Intent(MainActivity.this, MainActivity_2.class);
				startActivity(urIntent);
			}
		 });
		 
		 Button button6 = (Button)findViewById(R.id.button6);
		 button6.setOnClickListener(new OnClickListener(){
			 
			 @Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent urIntent = new Intent(MainActivity.this, MainActivity_4.class);
					startActivity(urIntent);
			 }
		 });
		 
		}
	
		 

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO Auto-generated method stub
		super.onActivityResult(requestCode, resultCode, data);
		
		String str = data.getStringExtra("returnData");
		EditText myEditText = (EditText)findViewById(R.id.editText1);
		myEditText.setText(str);
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
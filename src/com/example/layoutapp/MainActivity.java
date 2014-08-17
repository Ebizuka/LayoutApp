package com.example.layoutapp;

import android.app.Activity;
import android.widget.Toast;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	Context context;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		context = this;

		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button button = (Button) findViewById(R.id.button1);
		button.setOnClickListener(new OnClickListener(){
			@Override	
			public void onClick(View v){
				Toast.makeText(getApplicationContext(), "Touch‚³‚ê‚Ü‚µ‚½", Toast.LENGTH_SHORT).show();
			}
			});

		Log.v("TAG", "message1");
		Log.d("TAG", "message2");
		Log.i("TAG", "message3");
		Log.w("TAG", "message4");
		Log.e("TAG", "message5");
		
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

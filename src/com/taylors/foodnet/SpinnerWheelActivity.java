package com.taylors.foodnet;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.MenuItem;
import android.widget.Toast;

public class SpinnerWheelActivity extends FragmentActivity{
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_wheel);		
		getActionBar().setDisplayHomeAsUpEnabled(true);
		
	}
	
	
	
	public boolean onOptionsItemSelected(MenuItem item) {
		switch(item.getItemId())
		{
			case android.R.id.home:
				finish();
				Toast.makeText(getApplicationContext(), "You click UP button", Toast.LENGTH_LONG).show();
				Intent restListIntent = new Intent(SpinnerWheelActivity.this, HomeActivity.class);
				startActivity(restListIntent);
				overridePendingTransition(R.anim.left_slide_in, R.anim.left_slide_out);
		}
		return false;
		
	}
	
	
	
	
}

package com.taylors.foodnet;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import com.taylors.foodnet.R;
import com.taylors.foodnet.fragment.RestaurantListFragment;

public class HomeActivity extends BaseActivity {

	View container;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		container = (View) findViewById(R.id.container);
		
		changeFragment_toLeft(new RestaurantListFragment()); /* Navigate to ListView fragment */
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.main, menu);
		
		return super.onCreateOptionsMenu(menu);
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		
		switch(item.getItemId())
		{
		case R.id.action_random:
			Intent wheelIntent = new Intent(HomeActivity.this,SpinnerWheelActivity.class);
			startActivity(wheelIntent);
			overridePendingTransition(R.anim.right_slide_in, R.anim.right_slide_out);
			
			return true;
		default:
			return super.onOptionsItemSelected(item);
		}
	}
	
	
}

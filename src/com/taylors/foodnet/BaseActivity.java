package com.taylors.foodnet;

import com.taylors.foodnet.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;

public class BaseActivity extends FragmentActivity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}
	
	public void changeFragment_toLeft(Fragment frag) /* Slide to left screen */
	{
		if (getSupportFragmentManager().findFragmentByTag("frag")!=null)
			getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.slide_in_from_left, R.anim.slide_out_to_right).replace(R.id.container, frag, "frag").commit();
		else
			getSupportFragmentManager().beginTransaction().add(R.id.container, frag, "frag").commit();	
		
	}
	
	public void changeFragmentWithBackstack_toLeft(Fragment frag) /* Slide to left screen */
	{
		if (getSupportFragmentManager().findFragmentByTag("frag")!=null)
			getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.slide_in_from_left, R.anim.slide_out_to_right).replace(R.id.container, frag, "frag").addToBackStack(null).commit();
		else
			getSupportFragmentManager().beginTransaction().add(R.id.container, frag, "frag").commit();
	
	}
	
	public void changeFragment_toRight(Fragment frag) /* Slide to right screen */
	{
		if (getSupportFragmentManager().findFragmentByTag("frag")!=null)
			getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.right_slide_in, R.anim.right_slide_out).replace(R.id.container, frag, "frag").commit();
		else
			getSupportFragmentManager().beginTransaction().add(R.id.container, frag, "frag").commit();	
		
	}
	
	public void changeFragmentWithBackstack_toRight(Fragment frag) /* Slide to right screen */
	{
		if (getSupportFragmentManager().findFragmentByTag("frag")!=null)
			getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.right_slide_in, R.anim.right_slide_out).replace(R.id.container, frag, "frag").addToBackStack(null).commit();
		else
			getSupportFragmentManager().beginTransaction().add(R.id.container, frag, "frag").commit();
	
	}
}
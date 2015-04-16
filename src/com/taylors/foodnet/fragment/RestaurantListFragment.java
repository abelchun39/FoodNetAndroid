package com.taylors.foodnet.fragment;

import java.util.ArrayList;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import com.taylors.foodnet.R;
import com.taylors.foodnet.adapter.RestaurantListAdapter;
import com.taylors.foodnet.models.Restaurant;

public class RestaurantListFragment extends Fragment {
	
	ListView lv;
	ImageView restImage;
	RestaurantListAdapter adapter;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		super.onCreateView(inflater, container, savedInstanceState);
		View v = inflater.inflate(R.layout.fragment_restaurantlist, container, false);
		
		lv = (ListView) v.findViewById(R.id.rest_listview);
		
		lv.setOnItemClickListener(onListViewClickListener);
		
		return v; 
	}
	
	OnItemClickListener onListViewClickListener = new OnItemClickListener() {
		
		public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
			Toast.makeText(getActivity(), "You clicked: the list", Toast.LENGTH_LONG).show();
		};
		
	};
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onActivityCreated(savedInstanceState);
		
		Restaurant r1 = new Restaurant(
				getResources().getString(R.string.RestId_1),
				getResources().getString(R.string.RestName_1),
				getResources().getString(R.string.RestSubName_1),
				R.drawable.ic_launcher);
		Restaurant r2 = new Restaurant(
				getResources().getString(R.string.RestId_2),
				getResources().getString(R.string.RestName_2),
				getResources().getString(R.string.RestSubName_2),
				R.drawable.ic_launcher);
		Restaurant r3 = new Restaurant(
				getResources().getString(R.string.RestId_3),
				getResources().getString(R.string.RestName_3),
				getResources().getString(R.string.RestSubName_3),
				R.drawable.ic_launcher);
		
		ArrayList<Restaurant> restaurants = new ArrayList<Restaurant>();
		restaurants.add(r1);
		restaurants.add(r2);
		restaurants.add(r3);
		
		adapter = new RestaurantListAdapter(getActivity(), restaurants);
		lv.setAdapter(adapter);
		
		
	
		
	}
}

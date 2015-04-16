package com.taylors.foodnet.adapter;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.mikhaellopez.circularimageview.CircularImageView;
import com.taylors.foodnet.R;
import com.taylors.foodnet.models.Restaurant;

public class RestaurantListAdapter extends BaseAdapter {
	
	Context c;
	ArrayList<Restaurant> restaurants;
	
	
	public RestaurantListAdapter(Context c, ArrayList<Restaurant> restaurants)
	{
		this.c = c;
		this.restaurants = restaurants;
		
		if (restaurants == null)
			restaurants = new ArrayList<Restaurant>();
	}
	@Override
	public int getCount() {
		return restaurants.size();
	}

	@Override
	public Object getItem(int position) {
		return null;
	}

	@Override
	public long getItemId(int position) {
		return 0;
	}

	class ViewHolder
	{
		TextView restId;
		TextView restName;
		TextView restSubName;
		CircularImageView restImage;
		
	}
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		View v = convertView;
		ViewHolder vh;
		
		if( v == null)
		{
			v = LayoutInflater.from(c).inflate(R.layout.item_restaurant, parent, false);
			vh = new ViewHolder();
			
			vh.restId = (TextView) v.findViewById(R.id.rest_id);
			vh.restImage = (CircularImageView) v.findViewById(R.id.rest_pic);
			vh.restName = (TextView) v.findViewById(R.id.rest_name);
			vh.restSubName = (TextView) v.findViewById(R.id.rest_subname);
			
			v.setTag(vh);
		}else {
			vh = (ViewHolder) v.getTag();
		}
		
		Restaurant r = restaurants.get(position);
		vh.restImage.setImageResource(r.getImage());
		vh.restId.setText(r.getId());
		vh.restName.setText(r.getName());
		vh.restSubName.setText(r.getSubname());
		
		
		return v;
	}
	
}

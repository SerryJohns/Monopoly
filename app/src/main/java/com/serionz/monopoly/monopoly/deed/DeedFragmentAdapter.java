package com.serionz.monopoly.monopoly.deed;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.serionz.monopoly.monopoly.R;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by johnpaulseremba on 18/12/2017.
 */

public class DeedFragmentAdapter extends RecyclerView.Adapter<DeedFragmentAdapter.ViewHolder> {
	private  ArrayList<String> items;

	public DeedFragmentAdapter(ArrayList<String> items) {
		this.items = items;
	}

	@Override
	public DeedFragmentAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
		View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.deed_layout, parent, false);
		return new ViewHolder(v);
	}

	@Override public void onBindViewHolder(ViewHolder holder, int position) {

	}

	@Override public void onBindViewHolder(ViewHolder holder, int position,
			List<Object> payloads) {
		holder.position = position;

		super.onBindViewHolder(holder, position, payloads);
	}

	@Override public int getItemCount() {
		return items.size();
	}

	public class ViewHolder extends RecyclerView.ViewHolder {
		public Integer position;

		public ViewHolder(View itemView) {
			super(itemView);
		}

	}

}

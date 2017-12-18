package com.serionz.monopoly.monopoly.deed;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.serionz.monopoly.monopoly.R;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by johnpaulseremba on 18/12/2017.
 */

public class DeedFragmentAdapter extends RecyclerView.Adapter<DeedFragmentAdapter.ViewHolder> {
	private  ArrayList<String> items;
	private ArrayList<String> rentItems;

	public DeedFragmentAdapter(ArrayList<String> items) {
		this.items = items;
		this.rentItems = items;
	}

	@Override
	public DeedFragmentAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
		View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.deed_layout, parent, false);
		return new ViewHolder(v);
	}

	@Override public void onBindViewHolder(ViewHolder holder, int position) {
		holder.position = position;
	}

	@Override public int getItemCount() {
		return items.size();
	}

	public class ViewHolder extends RecyclerView.ViewHolder {
		public Integer position;
		private RecyclerView rentDetails;
		private RentDetailsAdapter rentDetailsAdapter;

		@BindView(R.id.img_title_bg) ImageView titleBg;
		@BindView(R.id.txt_deed_name) TextView deedName;
		@BindView(R.id.txt_rent) TextView rent;

		public ViewHolder(View itemView) {
			super(itemView);
			ButterKnife.bind(this, itemView);
			rentDetailsAdapter = new RentDetailsAdapter(rentItems);
			rentDetails = (RecyclerView) itemView.findViewById(R.id.rent_details_recycler);
			rentDetails.setLayoutManager(new LinearLayoutManager(itemView.getContext()));
			rentDetails.setAdapter(rentDetailsAdapter);
		}

	}

}

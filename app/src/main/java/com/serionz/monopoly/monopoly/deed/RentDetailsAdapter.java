package com.serionz.monopoly.monopoly.deed;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.serionz.monopoly.monopoly.R;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by johnpaulseremba on 18/12/2017.
 */

public class RentDetailsAdapter extends RecyclerView.Adapter<RentDetailsAdapter.ViewHolder> {

	private ArrayList<String> items;

	public RentDetailsAdapter(ArrayList<String> items) {
		this.items = items;
	}

	@Override
	public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
		View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.rent_details_layout, parent, false);
		return new ViewHolder(v);
	}

	@Override public void onBindViewHolder(ViewHolder holder, int position) {

	}

	@Override public int getItemCount() {
		return items.size();
	}

	@Override public void onBindViewHolder(ViewHolder holder, int position, List<Object> payloads) {
		super.onBindViewHolder(holder, position, payloads);
	}

	public class ViewHolder extends RecyclerView.ViewHolder {

		@BindView(R.id.txt_house) TextView houseCaption;
		@BindView(R.id.txt_price) TextView price;

		public ViewHolder(View itemView) {
			super(itemView);
			ButterKnife.bind(this, itemView);
		}

	}

}

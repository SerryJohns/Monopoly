package com.serionz.monopoly.monopoly.deed;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.serionz.monopoly.monopoly.R;
import java.util.ArrayList;

public class DeedFragment extends Fragment implements DeedFragmentContract.View {

	private OnFragmentInteractionListener mListener;
	private DeedFragmentAdapter deedFragmentAdapter;

	private ArrayList<String> items = new ArrayList<String>() {
		{
			add("Card 1");
			add("Card 1");
		}
	};

	public DeedFragment() {
		// Required empty public constructor
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}

	@Override public void showLoading() {

	}

	@Override public void hideLoading() {

	}


	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_deed, container, false);

		View deedLayoutView = getLayoutInflater().inflate(R.layout.deed_layout, container, false);
		RecyclerView cardsRecyclerView = (RecyclerView) view.findViewById(R.id.cards_recycler_view);

		deedFragmentAdapter = new DeedFragmentAdapter(this.items);
		cardsRecyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
		cardsRecyclerView.setItemAnimator(new DefaultItemAnimator());
		cardsRecyclerView.setAdapter(deedFragmentAdapter);

		return view;
	}

	@Override
	public void onAttach(Context context) {
		super.onAttach(context);
		if (context instanceof OnFragmentInteractionListener) {
			mListener = (OnFragmentInteractionListener) context;
		} else {
			throw new RuntimeException(context.toString()
					+ " must implement OnFragmentInteractionListener");
		}
	}

	@Override
	public void onDetach() {
		super.onDetach();
		mListener = null;
	}

	public interface OnFragmentInteractionListener {
		void onFragmentInteraction(Uri uri);
	}

}

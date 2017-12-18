package com.serionz.monopoly.monopoly;

import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;
import com.serionz.monopoly.monopoly.deed.DeedFragment;

public class MainActivity extends AppCompatActivity implements
		DeedFragment.OnFragmentInteractionListener {

	private TextView mTextMessage;

	private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
			= new BottomNavigationView.OnNavigationItemSelectedListener() {

		@Override
		public boolean onNavigationItemSelected(@NonNull MenuItem item) {
			switch (item.getItemId()) {
				case R.id.navigation_home:
					// TODO add home
					return true;
				case R.id.navigation_dashboard:
					// TODO add_dashboard
					return true;
				case R.id.navigation_notifications:
					// TODO add_notification
					return true;
			}
			return false;
		}
	};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		mTextMessage = (TextView) findViewById(R.id.message);
		BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
		navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

		DeedFragment deedFragment = new DeedFragment();
		FragmentManager manager = getSupportFragmentManager();
		manager.beginTransaction()
				.replace(R.id.fragment_container, deedFragment, deedFragment.getTag())
				.commit();

	}

	@Override public void onFragmentInteraction(Uri uri) {

	}
}

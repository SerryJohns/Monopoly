package com.serionz.monopoly.monopoly.deed;

/**
 * Created by johnpaulseremba on 18/12/2017.
 */

public interface DeedFragmentContract {

	interface View {
		void showLoading();
		void hideLoading();
	}

	interface Presenter {
		void displayDeeds();
	}

}

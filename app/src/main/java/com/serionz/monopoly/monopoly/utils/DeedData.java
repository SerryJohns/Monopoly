package com.serionz.monopoly.monopoly.utils;

import com.serionz.monopoly.monopoly.R;
import com.serionz.monopoly.monopoly.models.Deed;
import com.serionz.monopoly.monopoly.models.Rent;
import java.util.ArrayList;

/**
 * Created by johnpaulseremba on 18/12/2017.
 */

public class DeedData {
	private static Deed obj1 = new Deed(
			"Green Street",
			"property",
			"200",
			R.color.colorPrimaryDark,
			new Rent("200",
					"400",
					"600",
					"500",
					"1000",
					"75",
					"100", 
					"150"),
			null,
			null);

	private static Deed obj2 = new Deed(
			"Yellow Street",
			"utility",
			"400",
			R.color.colorAccent,
			new Rent("500",
					"900",
					"1200",
					"3000",
					"1000",
					"75",
					"100",
					"150"),
			"Some condition",
			"Condition two");

	public static ArrayList<Deed> deeds = new ArrayList<Deed>() {
		{
			add(obj1);
			add(obj2);
		}
	};

}

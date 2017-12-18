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

	public static ArrayList<Integer> imageDeeds = new ArrayList<Integer>() {
		{
			add(R.drawable.bond_street);
			add(R.drawable.bow_street);
			add(R.drawable.conventry_street);
			add(R.drawable.electric_company);
			add(R.drawable.euston_road);
			add(R.drawable.fenchruch_station);
			add(R.drawable.fleet_street);
			add(R.drawable.kings_cross_station);
			add(R.drawable.leciester_square);
			add(R.drawable.liverpool_st_station);
			add(R.drawable.marlborough_street);
			add(R.drawable.marylebone_station);
			add(R.drawable.mayfair);
			add(R.drawable.mortgaged);
			add(R.drawable.northland_ave);
			add(R.drawable.old_kent_road);
			add(R.drawable.oxford_street);
			add(R.drawable.pall_mall);
			add(R.drawable.park_lane);
			add(R.drawable.pentoville_road);
			add(R.drawable.piccadily_circus);
			add(R.drawable.regent_street);
			add(R.drawable.the_angel_islington);
			add(R.drawable.the_strand);
			add(R.drawable.trafalgar_square);
			add(R.drawable.vine_street);
			add(R.drawable.water_works);
			add(R.drawable.whitechapel_road);
			add(R.drawable.whitehall);
		}
	};

}

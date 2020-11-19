package com.test.findlargestcity.util;

import java.util.HashMap;
import java.util.Map;

public class Util {

	private Util() {
	}

	public static String getStateCodeByName(String name) throws Exception {
		String code = states.get(name.toUpperCase());
		if (null != code && !"".equals(code)) {
			return code;
		} else {
			throw new Exception("Invalid State Name!!!");
		}
	}

	private static Map<String, String> states = new HashMap<>();

	static {
		states.put("ALABAMA", "AL");
		states.put("ALASKA", "AK");
		states.put("ARIZONA", "AZ");
		states.put("ARKANSAS", "AR");
		states.put("CALIFORNIA", "CA");
		states.put("COLORADO", "CO");
		states.put("CONNECTICUT", "CT");
		states.put("DELAWARE", "DE");
		states.put("FLORIDA", "FL");
		states.put("GEORGIA", "GA");
		states.put("HAWAII", "HI");
		states.put("IDAHO", "ID");
		states.put("ILLINOIS", "IL");
		states.put("INDIANA", "IN");
		states.put("IOWA", "IA");
		states.put("KANSAS", "KS");
		states.put("KENTUCKY", "KY");
		states.put("LOUISIANA", "LA");
		states.put("MAINE", "ME");
		states.put("MARYLAND", "MD");
		states.put("MASSACHUSETTS", "MA");
		states.put("MICHIGAN", "MI");
		states.put("MINNESOTA", "MN");
		states.put("MISSISSIPPI", "MS");
		states.put("MISSOURI", "MO");
		states.put("MONTANA", "MT");
		states.put("NEBRASKA", "NE");
		states.put("NEVADA", "NV");
		states.put("NEW HAMPSHIRE", "NH");
		states.put("NEW JERSEY", "NJ");
		states.put("NEW MEXICO", "NM");
		states.put("NEW YORK", "NY");
		states.put("NORTH CAROLINA", "NC");
		states.put("NORTH DAKOTA", "ND");
		states.put("OHIO", "OH");
		states.put("OKLAHOMA", "OK");
		states.put("OREGON", "OR");
		states.put("PENNSYLVANIA", "PA");
		states.put("RHODE ISLAND", "RI");
		states.put("SOUTH CAROLINA", "SC");
		states.put("SOUTH DAKOTA", "SD");
		states.put("TENNESSEE", "TN");
		states.put("TEXAS", "TX");
		states.put("UTAH", "UT");
		states.put("VERMONT", "VT");
		states.put("VIRGINIA", "VA");
		states.put("WASHINGTON", "WA");
		states.put("WEST VIRGINIA", "WV");
		states.put("WISCONSIN", "WI");
		states.put("WYOMING", "WY");
	}

}

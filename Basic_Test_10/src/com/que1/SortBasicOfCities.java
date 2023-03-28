package com.que1;

import java.util.Comparator;

public class SortBasicOfCities implements Comparator<Shipment> {

	@Override
	public int compare(Shipment s1, Shipment s2) {
		int cityCompare = s1.getAddr().getCity().compareTo(s2.getAddr().getCity());
		if (cityCompare != 0) {
			return cityCompare;
		} else {
			return s1.getShipDate().getDd() - s2.getShipDate().getDd();
		}
	}
}

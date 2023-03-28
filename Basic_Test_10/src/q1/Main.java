package q1;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		ArrayList<Shipment> list = new ArrayList<>();
		list.add(new Shipment(1, "Omkar", new Address("Shirur", "Pune", "Maharashtra"), new MyDate(24, 03, 2023)));
		list.add(new Shipment(2, "Suyog", new Address("SangviSurya", "A.Nagar", "Maharashtra"),
				new MyDate(25, 03, 2023)));
		list.add(new Shipment(3, "Vivek", new Address("Pimpri dumala", "Pune", "Maharashtra"),
				new MyDate(22, 03, 2023)));
		for (Shipment s : list) {
			System.out.println(s);
		}
		System.out.println("==============================================");
		Collections.sort(list, new ComparatorClass());
		for (Shipment s : list) {
			System.out.println(s);
		}
	}

}

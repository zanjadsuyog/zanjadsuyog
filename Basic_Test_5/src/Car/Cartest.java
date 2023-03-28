package Car;

public class Cartest {
	public static void main(String[] args) {
		Engine engine1 = new Engine("V6", 50000);
		Machine machine1 = new Machine("Sports Car", engine1);
		Car car1 = new Car(1234, machine1);

		Engine engine2 = new Engine("V8", 70000);
		Machine machine2 = new Machine("Luxury Sedan", engine2);
		Car car2 = new Car(5678, null);
		car2.setModelNo(5678);
		car2.setMachine(machine2);

		System.out.println(
				"Car 1: Model No = " + car1.getModelNo() + ", Machine Type = " + car1.getMachine().getMachineType()
						+ ", Engine Type = " + car1.getMachine().getEngine().getEngineType() + ", Price = "
						+ car1.getMachine().getEngine().getPrice());
		System.out.println(
				"Car 2: Model No = " + car2.getModelNo() + ","
						+ " Machine Type = " + car2.getMachine().getMachineType()
						+ ","
						+ " Engine Type = " + car2.getMachine().getEngine().getEngineType() + ", "
								+ "Price = "
						+ car2.getMachine().getEngine().getPrice());
	}
}

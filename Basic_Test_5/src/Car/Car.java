package Car;

public class Car {
    private int modelNo;
    private Machine machine;

    public Car(int modelNo, Machine machine) {
        this.modelNo = modelNo;
        this.machine = machine;
    }

    public int getModelNo() {
        return modelNo;
    }

    public Machine getMachine() {
        return machine;
    }

    public void setModelNo(int modelNo) {
        this.modelNo = modelNo;
    }

    public void setMachine(Machine machine) {
        this.machine = machine;
    }
}

class Machine {
    private String machineType;
    private Engine engine;

    public Machine(String machineType, Engine engine) {
        this.machineType = machineType;
        this.engine = engine;
    }

    public String getMachineType() {
        return machineType;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setMachineType(String machineType) {
        this.machineType = machineType;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}

 class Engine {
    private String engineType;
    private int price;

    public Engine(String engineType, int price) {
        this.engineType = engineType;
        this.price = price;
    }

    public String getEngineType() {
        return engineType;
    }

    public int getPrice() {
        return price;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

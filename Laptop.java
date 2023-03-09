// 1 Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.

public class Laptop {

    private String model;
    private int operatingMemory;
    private int HDD;
    private String operationSystem;
    private String color;

    public Laptop(String model, int operatingMemory, int HDD, String operationSystem, String color) {
        this.model = model;
        this.operatingMemory = operatingMemory;
        this.HDD = HDD;
        this.operationSystem = operationSystem;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Task1 [model=" + model + ", operatingMemory=" + operatingMemory + ", HDD=" + HDD + ", operationSystem="
                + operationSystem + ", color=" + color + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + operatingMemory;
        result = prime * result + HDD;
        result = prime * result + ((operationSystem == null) ? 0 : operationSystem.hashCode());
        result = prime * result + ((color == null) ? 0 : color.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (operatingMemory != other.operatingMemory)
            return false;
        if (HDD != other.HDD)
            return false;
        if (operationSystem == null) {
            if (other.operationSystem != null)
                return false;
        } else if (!operationSystem.equals(other.operationSystem))
            return false;
        if (color == null) {
            if (other.color != null)
                return false;
        } else if (!color.equals(other.color))
            return false;
        return true;
    }

    public int getOperatingMemory() {
        return operatingMemory;
    }

    public int getHDD() {
        return HDD;
    }

    public String getOperationSystem() {
        return operationSystem;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }
}
package me.vinuvicho.computers;

public class Laptop extends Computer {


    private ComputerProperty weight;

    public Laptop(String name, String info, Double computerPrice, Integer stock) {
        super(name, info, computerPrice, stock);
    }

    @Override
    public void displayInfo() {
        System.out.println(displayName());
        super.displayInfo();
        weight.displayInfo();
        System.out.println();
    }

    public Laptop() {
    }

    @Override
    public String displayName() {
        return getComputerId() + ". Laptop " + getName();
    }

    public ComputerProperty getWeight() {
        return weight;
    }

    public void setWeight(ComputerProperty weight) {
        this.weight = weight;
    }
}

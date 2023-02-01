package me.vinuvicho.computers;

public class Smartphone  extends  Computer {
    private ComputerProperty camera;

    public Smartphone(String name, String info, Double computerPrice, Integer stock) {
        super(name, info, computerPrice, stock);
    }

    @Override
    public void displayInfo() {
        System.out.println(displayName());
        super.displayInfo();
        camera.displayInfo();
        System.out.println();
    }

    @Override
    public String displayName() {
        return (getComputerId() + ". Smartphone " + getName());
    }

    public Smartphone() {
    }

    public ComputerProperty getCamera() {
        return camera;
    }

    public void setCamera(ComputerProperty camera) {
        this.camera = camera;
    }
}

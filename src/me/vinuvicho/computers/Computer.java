package me.vinuvicho.computers;

public abstract class Computer {

    private Integer computerId;
    private static int counterId = 1;
    private String name;
    private String info;

    private ComputerProperty processor;
    private ComputerProperty memory;

    private Double computerPrice;
    private Integer stock;

    {
        this.computerId = counterId++;
    }

    public Computer(String name, String info, Double computerPrice, Integer stock) {
        this.name = name;
        this.info = info;
        this.computerPrice = computerPrice;
        this.stock = stock;
    }

    public void displayInfo() {
        System.out.println(info);
        System.out.println("Computers in stock: " + stock);
        System.out.println("Price: " + computerPrice);
        System.out.println("More properties:");
        processor.displayInfo();
        memory.displayInfo();
    }

    public abstract String displayName();

    public void decreaseStock() {
        stock--;
    }

    public Computer(Integer computerId, String name, String info, ComputerProperty processor, ComputerProperty memory, Double computerPrice, Integer stock) {
        this.computerId = computerId;
        this.name = name;
        this.info = info;
        this.processor = processor;
        this.memory = memory;
        this.computerPrice = computerPrice;
        this.stock = stock;
    }

    public Computer() {
    }

    public Integer getComputerId() {
        return computerId;
    }

    public void setComputerId(Integer computerId) {
        this.computerId = computerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public ComputerProperty getProcessor() {
        return processor;
    }

    public void setProcessor(ComputerProperty processor) {
        this.processor = processor;
    }

    public ComputerProperty getMemory() {
        return memory;
    }

    public void setMemory(ComputerProperty memory) {
        this.memory = memory;
    }

    public Double getComputerPrice() {
        return computerPrice;
    }

    public void setComputerPrice(Double computerPrice) {
        this.computerPrice = computerPrice;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }
}

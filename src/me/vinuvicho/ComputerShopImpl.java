package me.vinuvicho;

import me.vinuvicho.computers.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ComputerShopImpl implements ComputerShop{
    public static List<Computer> computers = new ArrayList();
    public static List<Order> orders = new ArrayList();

    @Override
    public Computer getComputerById(Integer id) {
        return computers.stream().filter(computer -> computer.getComputerId().equals(id)).findAny().orElse(null);
    }

    @Override
    public List<Computer> getAllComputers() {
        if (computers.size() == 0) fillDatabase();
        return computers;
    }

    @Override
    public void displayAllComputerProperties() {
        computers.forEach(Computer::displayInfo);
    }

    @Override
    public void orderComputer(String userEmail, Integer computerId) {
        if (isValidEmailAddress(userEmail)) {
            Computer computer = getComputerById(computerId);
            if (computer.getStock() > 0) {
                computer.decreaseStock();
                Order order = new Order(userEmail, computer);
                orders.add(order);
            }
        }
    }



    @Override
    public void displayComputerProperties(Computer computer) {
        computer.displayInfo();
    }
    @Override
    public void displayComputerProperties(List<Computer> computers) {
        computers.forEach(Computer::displayInfo);
    }

    @Override
    public List<Order> getAllOrders() {
        return orders;
    }

    public boolean isValidEmailAddress(String email) {
        String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        return email.matches(regex);
    }

    @Override
    public List<Computer> getAllDesktops() {
        return computers.stream().filter(computer -> computer instanceof DesktopComputer).collect(Collectors.toList());
    }
    @Override
    public List<Computer> getAllLaptops() {
        return computers.stream().filter(computer -> computer instanceof Laptop).collect(Collectors.toList());
    }
    @Override
    public List<Computer> getAllSmartphones() {
        return computers.stream().filter(computer -> computer instanceof Smartphone).collect(Collectors.toList());
    }

    public ComputerShopImpl() {
        fillDatabase();
    }

    @Override
    public void fillDatabase() {
        Smartphone smartphone = new Smartphone("Xiaomi Mi Mix 3", "Cool smartphone without camera on display", 300.0, 3);
        smartphone.setMemory(new ComputerProperty("Memory", "128GB", 20.20));
        smartphone.setProcessor(new ComputerProperty("Processor", "Qualcomm Snapdragon 845", 169.96));
        smartphone.setCamera(new ComputerProperty("Camera", "12MP + 12MP", 78.0));
        computers.add(smartphone);
        smartphone = new Smartphone("Iphone X", "Smartphone with huge eyebrow", 380.85, 2);
        smartphone.setMemory(new ComputerProperty("Memory", "64GB", 10.10));
        smartphone.setProcessor(new ComputerProperty("Processor", "Apple A11 Bionic Neural", 120.01));
        smartphone.setCamera(new ComputerProperty("Camera", "12MP + 12MP", 78.0));
        computers.add(smartphone);
        String description = "ASUS S500MC is a powerful, stylish and versatile PC suitable for a wide range of tasks, " +
                "from ubiquitous content creation and working from home to online learning and light gaming.";
        DesktopComputer desktopComputer = new DesktopComputer("Asus S500MC-5114000460", description, 1090.77, 4);
        desktopComputer.setProcessor(new ComputerProperty("Processor", "Intel Core i5-11400 (2.6 — 4.4 GHz)", 173.95));
        desktopComputer.setMemory(new ComputerProperty("Memory", "SSD 512Gb", 34.09));
        desktopComputer.setMotherboard(new ComputerProperty("Motherboard", "Asus Intel® B560", 148.62));
        desktopComputer.setGraphicCard(new ComputerProperty("GraphicCard", "Asus GeForce RTX 3060 12GB GDDR6", 463.58));
        computers.add(desktopComputer);
        description = "`ARTLINE Gaming` personal computers are created specifically for those who want to personally create a real home entertainment center on their basis.";
        desktopComputer = new DesktopComputer("ARTLINE Gaming X57 v37", description, 1134.37, 1);
        desktopComputer.setProcessor(new ComputerProperty("Processor", "Intel Core i5-11400 (2.6 — 4.4 GHz)", 173.95));
        desktopComputer.setMemory(new ComputerProperty("Memory", "SSD 480Gb + HDD 2Tb", 128.14));
        desktopComputer.setMotherboard(new ComputerProperty("Motherboard", "Intel B560 (PRIME B560M-A)", 119.96));
        desktopComputer.setGraphicCard(new ComputerProperty("GraphicCard", "GeForce RTX 3060 Ti", 550.81));
        computers.add(desktopComputer);
        description = "This Chromebook is light, portable, durable, and productive—the perfect everyday study aid.";
        Laptop laptop = new Laptop("Lenovo Chromebook 100e", description, 182.78, 2);
        laptop.setProcessor(new ComputerProperty("Processor", "AMD Dual-Core A4-9120 (2.2 - 2.5 GHz)", 38.18));
        laptop.setMemory(new ComputerProperty("Memory", "HDD 32Gb", 21.87));
        laptop.setWeight(new ComputerProperty("Weight", "1.26 kg", 0.0));
        computers.add(laptop);
        description = "The Lenovo ThinkPad E550 is a laptop designed for everyday use that has powerful processing and plenty of features.";
        laptop = new Laptop("Lenovo Thinkpad E550", description, 248.00, 6);
        laptop.setProcessor(new ComputerProperty("Processor", "Intel Core i3-5005u", 137.0));
        laptop.setMemory(new ComputerProperty("Memory", "SSD 250GB", 59.99));
        laptop.setWeight(new ComputerProperty("Weight", "2.35 kg", 0.0));
        computers.add(laptop);
    }

    @Override
    public void displayOrders(List<Order> orders) {
        orders.forEach(Order::display);
    }

    @Override
    public void displayAllOrders() {
        orders.forEach(Order::display);
    }
}

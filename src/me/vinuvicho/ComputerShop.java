package me.vinuvicho;

import me.vinuvicho.computers.Computer;

import java.util.List;

//List of all methods u can test:
public interface ComputerShop {
    Computer getComputerById(Integer id);
    List<Computer> getAllComputers();
    void displayAllComputerProperties();
    void displayComputerProperties(Computer computer);
    void displayComputerProperties(List<Computer> computers);
    public List<Order> getAllOrders();
    List<Computer> getAllDesktops();
    List<Computer> getAllLaptops();
    List<Computer> getAllSmartphones();
    void fillDatabase();
    void displayOrders(List<Order> orders);
    void displayAllOrders();
    void orderComputer(String userEmail, Integer computerId);
}

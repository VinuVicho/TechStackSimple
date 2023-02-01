package me.vinuvicho;

import me.vinuvicho.computers.Computer;

public class Order {
    private Integer id;
    private static int idCounter = 1;
    private String userEmail;
    private Computer computer;

    {
        this.id = idCounter++;
    }

    public Order(String userEmail, Computer computer) {
        this.userEmail = userEmail;
        this.computer = computer;
    }

    public void display() {
        System.out.println(id + ". User: " + userEmail + " — " + computer.getComputerId() + ". " + computer.displayName());
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }
}

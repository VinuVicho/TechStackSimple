package me.vinuvicho;

import me.vinuvicho.computers.Computer;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        ComputerShopImpl shop = new ComputerShopImpl();
//        shop.displayAllComputerProperties();
        List<Computer> desktops = shop.getAllDesktops();
        shop.displayComputerProperties(desktops);
        shop.orderComputer("vovkamlad@gmail.com", 4);
        shop.displayComputerProperties(desktops);
        List<Order> allOrders = shop.getAllOrders();
    }
}

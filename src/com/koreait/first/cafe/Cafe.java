package com.koreait.first.cafe;

public class Cafe {
    public static void main(String[] args) {

        Menu menu = new Menu();
        Customer customer = new Customer();
        MenuItem mi = customer.order(menu);

        System.out.println("mi menuName: " + mi.getItemName());
    }
}

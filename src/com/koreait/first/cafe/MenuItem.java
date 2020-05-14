package com.koreait.first.cafe;

public class MenuItem {
    private String itemName;
    private int itemPrice;

    public MenuItem(String itemName, int itemPrice) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }

    public String getItemName() {
        return itemName;
    }

    public int getItemPrice() {
        return itemPrice;
    }
}

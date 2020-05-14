package com.koreait.first.cafe;

public class Menu {
    private final int ITEM_COUNT = 4;
    private MenuItem[] arr = new MenuItem[ITEM_COUNT];

    public Menu() {
        super();
        init();
    }

    private void init() {
        arr[0] = new MenuItem("아메리카노", 1500);
        arr[1] = new MenuItem("카푸치노", 2000);
        arr[2] = new MenuItem("카라멜 마키아또", 2500);
        arr[3] = new MenuItem("에스프레소", 2500);
    }

    public void showMenus() {
        System.out.println("--- Menu ---");
        for(int i=0; i<ITEM_COUNT; i++) {
            MenuItem mi = arr[i];
            System.out.printf("%s \t %,d원\n"
                    , mi.getItemName(), mi.getItemPrice());
        }
    }

    public MenuItem choose(String menuName) {
        for(int i=0; i<ITEM_COUNT; i++) {
            MenuItem mi = arr[i];
            if(mi.getItemName().equals(menuName)) {
                return mi;
            }
        }
        return null;
    }



}

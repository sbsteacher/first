package com.koreait.first.cafe;

import java.util.Scanner;

public class Customer {
    private Scanner scan = new Scanner(System.in);

    public MenuItem order(Menu menu) {
        menu.showMenus();
        MenuItem selectedMenu = null;
        while(selectedMenu == null) {
            System.out.print("메뉴 이름을 입력해 주세요:");
            String menuName = scan.next();
            selectedMenu = menu.choose(menuName);
            if(selectedMenu == null) {
                System.out.println("해당하는 메뉴가 없습니다.");
            }
        }
        return selectedMenu;
    }
}

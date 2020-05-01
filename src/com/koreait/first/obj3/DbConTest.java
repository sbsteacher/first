package com.koreait.first.obj3;

public class DbConTest {
    public static void main(String[] args) {
        System.out.println("args[0]: " + args[0]);
        String db = DbCon.getCon(args[0]);
        System.out.println("db : " + db);
    }
}

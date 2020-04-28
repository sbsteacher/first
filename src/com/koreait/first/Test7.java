package com.koreait.first;

class Test7 {
    public static void main(String[] args) {
        int num = 10;
        System.out.println("num: " + num);
        changeNum(num);
        System.out.println("num: " + num);

        ClsNum clsNum = new ClsNum();
        clsNum.num = 10;

        System.out.println("clsNum.num: " + clsNum.num);
        changeNum(clsNum);
        System.out.println("clsNum.num: " + clsNum.num);
    }

    public static void changeNum(int num) {
        num = 20;
    }
    static void changeNum(ClsNum cn) {
        cn.num = 20;
    }
}

class ClsNum {
    int num;
}

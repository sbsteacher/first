package com.koreait.first;

public class Test1 {

    final int AGE = 11;

    public static void main(String[] args) {
/*
        int lastNum = 6;

       for(int i=0; i<lastNum; i++) {
            for(int z=0; z<lastNum; z++) {
                System.out.print("*");
            }
            System.out.println();
       }
*/
        //정수, 실수, 문자, 문자열

        String name = "이순신";
        char cls = 'C';
        int age = 2000;
        double height = 175.5;

        System.out.printf("나의 이름은 %s이고 나는 %c반이다. 나의 나이는 %,d이고, 키는 %.2f이다\n", name, cls, age, height);

        String str = "나의 이름은 "+ name + "이고 나는 " + cls + "반이다. 나의 나이는 " + age + "이고, 키는 " + height + "이다";
        System.out.println(str);

        String str2 = String.format("나의 이름은 %s이고 나는 %c반이다. 나의 나이는 %,d이고, 키는 %.2f이다\n", name, cls, age, height);
        System.out.println(str2);

//print, println, printf, 상수, 리터럴



        int a44aa;
        int aaa;
        int Aaa;
        int aAa;
        int 한글변수 = 10;


        //문자열 매커니즘
    }
}

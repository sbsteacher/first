package com.koreait.first;

public class ObjectMission {
    public static void main(String[] args) {
        Tv tv2 = new Tv();
        Tv tv3 = new Tv(60);
        Tv tv4 = new Tv("LG");
        Tv tv1 = new Tv(50, "삼성");
    }
}
class Tv {
    private int inch;
    private String name;

    public Tv() {
        this("모름");
    }
    public Tv(int inch) {
        this(inch, "모름");
    }
    public Tv(String name) {
        this(30, name);
    }
    public Tv(int inch, String name2) {
        this.inch = inch;
        name = name2;
        System.out.println("Tv 생성!");
    }
    public void check() {
        System.out.printf("%s의 %d인치 TV\n", this.name, this.inch);
    }

    //1. 리턴타입이 없다
    //2. 생성자이름은 클래스 이름과 동일하다
}
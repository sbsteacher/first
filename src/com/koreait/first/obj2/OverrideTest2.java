package com.koreait.first.obj2;

public class OverrideTest2 {
    public static void main(String[] args) {
        Bucket bucket1 = new Bucket(1);
        Bucket bucket2 = new Bucket(1);

        System.out.println(bucket1 == bucket2);
        System.out.println(bucket1.equals("dd"));
    }
}

class Bucket {
    private int value;

    Bucket(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Bucket) {
            Bucket buc = (Bucket)obj;
            return this.value == buc.getValue();
        } else {
            return false;
        }
    }
}

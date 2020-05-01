package com.koreait.first.obj3;

public class OracleConnection implements DbConnectable {
    @Override
    public String dbConnect() {
        return "Oracle Connection";
    }
}

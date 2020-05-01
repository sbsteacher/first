package com.koreait.first.obj3;

public class MsSQLConnection implements DbConnectable {
    @Override
    public String dbConnect() {
        return "MS-SQL connection";
    }
}

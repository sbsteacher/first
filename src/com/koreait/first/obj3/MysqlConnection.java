package com.koreait.first.obj3;

public class MysqlConnection implements DbConnectable {

    @Override
    public String dbConnect() {
        return "Mysql Connection";
    }
}

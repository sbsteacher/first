package com.koreait.first.obj3;

public class DbCon {
    public static String getCon(String dbName) {
        String db = "";
        //디비 연결
        db = dbFactory(dbName);
        return db;
    }

    public static String dbFactory(String dbName) {
        DbConnectable dt = null;
        switch(dbName) {
            default: case "mysql":
                dt = new MysqlConnection();
                break;
            case "oracle":
                dt = new OracleConnection();
                break;
            case "mssql":
                dt = new MsSQLConnection();
                break;
        }

        return dt.dbConnect();
    }
}

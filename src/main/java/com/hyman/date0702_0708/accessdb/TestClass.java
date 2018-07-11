package com.hyman.date0702_0708.accessdb;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @program: javalearning
 * @Date: 2018/7/11 11:36
 * @Author: hyman.hu
 * @Description: 测试类
 */
public class TestClass {

    public static void main(String[] args) throws SQLException, InstantiationException, IllegalAccessException, NoSuchFieldException {
//        List<User> list =  DBUtils.select("select * from User",null,User.class);
//        System.out.println(list);
        String sql = "insert into User (userName,email,age) values (?,?,?)";
        List<Object> list = new ArrayList<>();
        list.add("andy");
        list.add("andy.zhu@cdskysoft.com");
        list.add(29);
        System.out.println(DBUtils.update(sql,list));
    }
}

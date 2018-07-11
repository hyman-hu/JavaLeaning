package com.hyman.date0625_0701.designpatterns.builder;

/**
 * @program: javalearning
 * @Date: 2018/6/25 9:39
 * @Author: hyman.hu
 * @Description: 用户实体
 */
public class User {
    private String userName;//用户名
    private String password;//密码
    private String email;//邮箱
    private Integer age;//年龄
    private Integer sex;//性别

    public User(UserBuilder builder){
        this.userName = builder.getUserName();
        this.password = builder.getPassword();
        this.email = builder.getEmail();
        this.age = builder.getAge();
        this.sex = builder.getSex();
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getSex() {
        return sex;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}

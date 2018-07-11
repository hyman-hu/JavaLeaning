package com.hyman.date0625_0701.designpatterns.builder;

/**
 * @program: javalearning
 * @Date: 2018/6/25 9:41
 * @Author: hyman.hu
 * @Description: 用户建造者类
 */
public class UserBuilder {
    private String userName;
    private String password;
    private String email;
    private Integer age;
    private Integer sex;

    public UserBuilder(String userName) {
        this.userName = userName;
    }

    public UserBuilder withUserName(String userName){
        this.userName = userName;
        return this;
    }

    public UserBuilder withPassword(String password){
        this.password = password;
        return this;
    }

    public UserBuilder withEmail(String email){
        this.email = email;
        return this;
    }

    public UserBuilder withAge(Integer age){
        this.age = age;
        return this;
    }

    public UserBuilder withSex(Integer sex){
        this.sex = sex;
        return this;
    }

    public User build(){
        return new User(this);
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
}

package com.hyman.date0625_0701.designpatterns.builder;

/**
 * @program: javalearning
 * @Date: 2018/6/25 9:58
 * @Author: hyman.hu
 * @Description:
 */
public class Student {

    private String userName;
    private String email;
    private Integer age;
    private Integer sex;

    public static class StudentBuilder {

        private final Student instance;

        public StudentBuilder() {
            this.instance = new Student();
        }

        public StudentBuilder withUserName(String userName) {
            instance.userName = userName;
            return this;
        }

        public StudentBuilder withEmail(String email) {
            instance.email = email;
            return this;
        }

        public StudentBuilder withAge(Integer age) {
            instance.age = age;
            return this;
        }

        public StudentBuilder withSex(Integer sex) {
            instance.sex = sex;
            return this;
        }

        public Student build() {
            return instance;
        }

    }

    public static StudentBuilder newBuilder() {
        return new StudentBuilder();
    }

    public String getUserName() {
        return userName;
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
        return "Student{" +
                "userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}

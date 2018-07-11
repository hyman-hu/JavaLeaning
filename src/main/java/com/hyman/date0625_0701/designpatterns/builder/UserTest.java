package com.hyman.date0625_0701.designpatterns.builder;

import org.junit.Test;

/**
 * @program: javalearning
 * @Date: 2018/6/25 9:51
 * @Author: hyman.hu
 * @Description:
 */
public class UserTest {
    public static void main(String[] args) {
        User user = new UserBuilder("hyman")
                .withAge(25)
                .withEmail("hyman.hu@cdskysoft.com")
                .withPassword("1234")
                .withSex(1)
                .build();
        System.out.println(user);
    }

    @Test
    public void testBuilder(){
        Student student = Student.newBuilder()
                .withUserName("hyman")
                .withEmail("hyman.hu@cdskysoft.com")
                .withAge(26)
                .withSex(1)
                .build();
        System.out.println(student);
    }
}

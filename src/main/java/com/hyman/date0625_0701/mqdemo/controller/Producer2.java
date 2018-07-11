package com.hyman.date0625_0701.mqdemo.controller;

import javax.jms.*;

public class Producer2 {
  public static void main(String[] args) {
    String msg = "Hello World!";
    Producer2 p = new Producer2();
    p.sendMessage(msg);
    System.out.println("发送消息结束：" + msg);
  }

  public void sendMessage(final String msg) {
    final String subject = "TOOL.DEFAULT";
    MyJMSTemplate jt = new MyJMSTemplate();
    jt.excute(new ExcutionCallback() {

      public void excute(Session session) {
        try {
          Destination destination = session.createQueue(subject);
          MessageProducer producer = session.createProducer(destination);
          TextMessage message = session.createTextMessage();
          for (int i = 0; i < 5; i++) {
            String tmp = i + "--:\t" + msg;
            message.setStringProperty("msg", tmp);
            producer.send(message);
          }
        } catch (JMSException e) {
          e.printStackTrace();
        }
      }
    });
  }

}

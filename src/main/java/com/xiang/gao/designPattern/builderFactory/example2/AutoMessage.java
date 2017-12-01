package com.xiang.gao.designPattern.builderFactory.example2;

import java.util.Date;

/**
 * @author Administrator
 * @crdate 2017-10-26 13:27
 */
public abstract class AutoMessage {
    /**
     * 假设有一个电子杂志系统，定期的向用户的邮箱发信息。用户可以通过网页订阅，也可能通过网页取消订阅。当客户订阅的时候发送一个欢迎
     * 当客户取消的时候发送一个欢送。本类子就是这个系统负责发送“欢迎”和“欢送”的模块
     */

    //发件人
    private String to;

    //收件人
    private String from;

    //内容
    private String body;

    //标题
    private String subject;

    //发送日期
    private Date date;

    public void send() {
        System.out.println("收件人地址：" + to);
        System.out.println("发件人地址：" + from);
        System.out.println("标题：" + subject);
        System.out.println("内容：" + body);
        System.out.println("发送日期：" + date);
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }
}

package com.xiang.gao.designPattern.builderFactory.example2;

import java.util.Date;

/**
 * @author Administrator
 * @crdate 2017-10-26 15:15
 */

public abstract class Builder {
    protected AutoMessage msg;

    //内容零件
    public abstract void buildBody();

    //标题零件
    public abstract void buildSubject();

    //收件人零件
    public void buildTo(String to) {
        msg.setTo(to);
    }

    //寄件人零件
    public void buildFrom(String from) {
        msg.setFrom(from);
    }

    //发件日期零件
    public void bulidSendDate() {
        msg.setDate(new Date());
    }

    public void sendMessage() {
        msg.send();
    }

}

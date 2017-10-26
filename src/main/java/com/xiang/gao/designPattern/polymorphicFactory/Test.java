package com.xiang.gao.designPattern.polymorphicFactory;

/**
 * @author Administrator
 * @crdate 2017-10-13 17:21
 */
public class Test {
    public static void main(String[] args) {
        String data = "这是最新的文档";
        ExportFactory exportFactory = new ExportHTMLFactory();
        ExportFile ef = exportFactory.factory("financial");
        ef.export(data);
    }
}

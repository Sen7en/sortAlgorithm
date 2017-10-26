package com.xiang.gao.designPattern.polymorphicFactory;

/**
 * @author Administrator
 * @crdate 2017-10-13 16:37
 */
public class ExportHTMLFactory implements ExportFactory {

    @Override
    public ExportFile factory(String type) {

        if ("standard".equals(type)) {
            return new ExportStandardHtmlFile();
        } else if ("financial".equals(type)) {
            return new ExportFinancialHtmlFile();
        } else {
            throw new RuntimeException("没有找到对象");
        }

    }
}

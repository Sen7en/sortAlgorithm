package com.xiang.gao.designPattern.polymorphicFactory;

/**
 * @author Administrator
 * @crdate 2017-10-13 17:09
 */
public class ExportPdfFactory implements ExportFactory {

    @Override
    public ExportFile factory(String type) {

        if ("standard".equals(type)) {
            return new ExportStandardPdfFile();
        } else if ("financial".equals(type)) {
            return new ExportFinancialPdfFile();
        } else {
            throw new RuntimeException("没有找到对象");
        }
    }
}

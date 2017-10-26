package com.xiang.gao.designPattern.polymorphicFactory;

/**
 * 导出账务版Pdf文件
 *
 * @author Administrator
 * @crdate 2017-10-13 16:54
 */
public class ExportFinancialPdfFile implements ExportFile {


    @Override
    public boolean export(String data) {

        System.out.println("导出账务版pdf文件");
        return true;
    }
}

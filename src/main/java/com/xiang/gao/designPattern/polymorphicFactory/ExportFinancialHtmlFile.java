package com.xiang.gao.designPattern.polymorphicFactory;

/**
 * 具体导出角色类
 *
 * @author Administrator
 * @crdate 2017-10-13 16:51
 */
public class ExportFinancialHtmlFile implements ExportFile {

    @Override
    public boolean export(String data) {

        System.out.println("导出账务版html文件");
        return true;
    }
}

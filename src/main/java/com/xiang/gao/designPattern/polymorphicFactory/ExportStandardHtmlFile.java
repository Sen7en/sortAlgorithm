package com.xiang.gao.designPattern.polymorphicFactory;

/**
 * 导出标准的html文件
 *
 * @author Administrator
 * @crdate 2017-10-13 16:57
 */
public class ExportStandardHtmlFile implements ExportFile {

    @Override
    public boolean export(String data) {

        System.out.println("导出标准版html文件");
        return true;
    }
}

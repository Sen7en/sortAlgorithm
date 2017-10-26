package com.xiang.gao.designPattern.polymorphicFactory;

/**
 * 导出标准版pdf文件
 *
 * @author Administrator
 * @crdate 2017-10-13 17:02
 */
public class ExportStandardPdfFile implements ExportFile {

    @Override
    public boolean export(String data) {

        System.out.println("导出标准版pdf文件");
        return true;
    }
}

package com.xiang.gao.designPattern.polymorphicFactory;

/**
 * @author Administrator
 * @crdate 2017-10-13 15:55
 */
public interface ExportFactory {
    /**
     * 抽象工厂，它声明了一个工厂方法，要求所有的具体工厂角色都实现这个工厂方法，参数type代表着导出的文件是哪一种结构，如
     * 导出html格式有2种结构，一种是标准结构，一种是财务需要的结构。
     */

    ExportFile factory(String type);

}

package com.xiang.gao.designPattern.singletonFactory;

/**
 * @author Administrator
 * @crdate 2017-10-20 13:26
 */
public class LazySingleton {
    /**
     * 懒汉式
     */
    private static LazySingleton instance = null;

    private LazySingleton() {
    }

    public static synchronized LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
    //------------第二种 start----------------------------------------------------

    /**
     * private static LazySingleton instance = null ;
     *
     * private LazySingleton(){};
     *
     * public static LazySingleton getInstance(){
     * //先检查实例是否存在，如果不存在进入同步快
     *     if(instance == null){
     *          synchronized(LazySingleton.class){
     *              if(instance == null){
     *                  instance = new LazySingleton();
     *              }
     *          }
     *     }
     *     return instance;
     * }
     */
    //-----------------------end---------------------------------------------------------

    //-----------------------------第三种start--------------------------------------------

    /**
     * private LazySingleton () {}
     *
     * //类级的内部类，也就是静态的成员内部类，该内部类的实例与外部类的实例没有绑定关系，而且只有被调用的时候才
     * //会装载，从而实现了延迟加载。
     * private static class SingletonHolder{
     *
     *  //静态初始化器，由jvm来保证线程安全
     *  private static LazySingleton instance = new LazySingleton();
     * }
     *
     * public static LazySingleton getInstance(){
     *     return SingletonHolder.getInstance;
     * }
     */
}

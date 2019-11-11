package q_02_singleton;

/**
 * 第一种模式：懒加载
 * 好处：减少占用的内存
 * 坏处：在多线程的情况下，容易出现问题。如两个线程同时判断是否为null,则破坏了单例模式
 *
 */
public class OneThread {
    private static OneThread oneThread = null;
    private OneThread(){

    }
    public static OneThread newInstance(){
        if(oneThread ==null){
            oneThread = new OneThread();
        }
        return oneThread;
    }
}

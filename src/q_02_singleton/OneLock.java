package q_02_singleton;

/**
 * 单锁模式：第一种懒加载的改进，可以解决多线程下的并发问题
 * 坏处：完全串行化处理，单线程下的效率低下
 *
 */
public class OneLock {
    private static OneLock oneLock;
    private OneLock(){

    }
    public static OneLock newInstance(){
        synchronized(OneLock.class){
            if(oneLock == null){
                oneLock = new OneLock();
            }
            return oneLock;
        }
    }
}

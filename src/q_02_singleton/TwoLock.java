package q_02_singleton;
/**
 * 进行两次判断，有效的解决了串行效率低下的问题
 */
public class TwoLock {
    private static TwoLock twoLock;
    private TwoLock(){
    }
    public static TwoLock newInstance(){
        if(twoLock==null){
            synchronized(TwoLock.class){
                if(twoLock==null){
                    twoLock = new TwoLock();
                }
            }
        }
        return twoLock;
    }

}

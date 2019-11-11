package q_02_singleton;

/**
 *使用内部类，是一种比较好的方式
 */
public class StaInner {
    public static class SingleTonObject{
        private static StaInner singleTonObject = new StaInner();
    }
    public static StaInner getInstance(){
        return SingleTonObject.singleTonObject;
    }
}

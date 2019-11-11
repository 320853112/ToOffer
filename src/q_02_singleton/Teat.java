package q_02_singleton;

public class Teat {
    public static void main(String[] args) {
        System.out.println(StaInner.getInstance());
        System.out.println(StaInner.getInstance());
    }
}

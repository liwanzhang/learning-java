package zwl.learning.java.instance;

/**
 * @author zhangwanli
 * @description
 * @date 2017-07-02 上午12:00
 */
public class StaticExtends {

    public static void main(String[] args) {
        C c = new D();
        c.f1();
    }
}

class C {
    public static void f1() {
        System.out.println("C");
    }
}
class D extends C {
    public static void f1() {
        System.out.println("D");
    }
}

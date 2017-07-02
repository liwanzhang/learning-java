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
        c.f2();
        D d = new D();
        d.f1();
        d.f2();
    }
}

class C {
    public static void f1() {
        System.out.println("C");
    }
    public static void f2() {
        System.out.println("C.f2");
    }
}
class D extends C {
    public static void f1() {
        System.out.println("D");
    }
}

package zwl.learning.java.instance;

/**
 * @author zhangwanli
 * @description
 * @date 2017-07-01 下午11:51
 */
public class StaticHello {
//    1
//    a
//    2
//    b
//    2
//    b
    public static void main(String[] args) {
        A ab = new B();
        ab = new B();
    }
}

class A {
    static {
        System.out.println(1);
    }

    public A() {
        System.out.println(2);
    }
}
class B extends A {
    static {
        System.out.println("a");
    }

    public B() {
        System.out.println("b");
    }
}

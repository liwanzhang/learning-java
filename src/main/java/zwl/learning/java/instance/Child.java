package zwl.learning.java.instance;

/**
 * @author zhangwanli
 * @description
 * @date 2017-07-01 下午11:25
 */
public class Child extends People{
    People father;

    public Child(String name) {
        System.out.println(3);
        this.name = name;
        father = new People(name + ":F");
    }

    public Child() {
        System.out.println(4);
    }
//            1
//            3
//            2
    public static void main(String[] args) {
        new Child("hello");
        //1 3 2
    }
}

class People {
    protected String name;

    public People() {
        System.out.println(1);
    }

    public People(String name) {
        System.out.println(2);
        this.name = name;
    }
}

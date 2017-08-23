package zwl.test.java;

import java.util.Objects;

/**
 * @author zhangwanli
 * @description
 * @date 2017-07-24 上午11:40
 */
public class ObjectsTest {
    public static void main(String[] args) {
        Test t = new Test();
        t.objectsTest();
    }
}

class Test {

    public void objectsTest() {
        Test t = null;
        Objects.nonNull(t);
        Objects.requireNonNull(t, "t is null");
    }
}

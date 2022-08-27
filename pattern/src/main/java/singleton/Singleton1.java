package singleton;

/**
 * 1. 饿汉式
 *
 * @author yayee
 */
public class Singleton1 {
    private Singleton1() {
        // 防止反射破坏单例
        if (INSTANCE != null) {
            throw new RuntimeException("单例对象不能重复创建");
        }
        System.out.println("private Singleton1()");
    }

    private static final Singleton1 INSTANCE = new Singleton1();

    public static Singleton1 getInstance() {
        return INSTANCE;
    }

    public static void otherMethod() {
        System.out.println("otherMethod()");
    }

    // 防止反序列化破坏单例
    public Object readResolve() {
        return INSTANCE;
    }
}

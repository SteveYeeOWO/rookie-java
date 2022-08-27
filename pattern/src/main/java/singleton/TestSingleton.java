package singleton;

import org.springframework.objenesis.instantiator.util.UnsafeUtils;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author yayee
 */
public class TestSingleton {
    public static void main(String[] args) throws Exception {
        Singleton5.otherMethod();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println(Singleton3.getInstance());
        System.out.println(Singleton3.getInstance());

        // 反射破坏单例
//        reflection(Singleton3.class);

        // 反序列化破坏单例
//        serializable(Singleton3.getInstance());

        // Unsafe 破坏单例
//        unsafe(Singleton3.class);
    }

    private static void unsafe(Class<?> clazz) throws InstantiationException {
        Object o = UnsafeUtils.getUnsafe().allocateInstance(clazz);
        System.out.println("Unsafe 创建实例:" + o);
    }

    // 反序列化创建实例不走构造方法
    private static void serializable(Object instance) throws IOException, ClassNotFoundException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(instance);
        ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(bos.toByteArray()));
        System.out.println("反序列化创建实例:" + ois.readObject());
    }

    private static void reflection(Class<?> clazz) throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Constructor<?> constructor = clazz.getDeclaredConstructor();
        // Cannot reflectively create enum objects
        // Constructor<?> constructor = clazz.getDeclaredConstructor(String.class, int.class);
        constructor.setAccessible(true);
        System.out.println("反射创建实例:" + constructor.newInstance());
        // 测试枚举饿汉式
        // System.out.println("反射创建实例:" + constructor.newInstance("OTHER", 1));
    }
}

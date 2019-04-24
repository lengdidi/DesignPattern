package singleton;

public class LazySingleton {
    private static LazySingleton lazySingleton = null;

//    private static boolean flag = true;

    private LazySingleton() {
//        if (flag) {
//            flag = false;
//        } else {
        if (lazySingleton != null) {
            throw new RuntimeException("禁止单例模式通过反射调用");
        }
//        }
    }

    public synchronized static LazySingleton getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

//    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
//        Class objectClass = LazySingleton.class;
//        Constructor c = objectClass.getDeclaredConstructor();
//        c.setAccessible(true);
//
//        LazySingleton o1 = LazySingleton.getInstance();
//        Field flag = o1.getClass().getDeclaredField("flag");
//        flag.setAccessible(true);
//        flag.set(o1, true);
//        LazySingleton o2 = (LazySingleton) c.newInstance();
//
//        System.out.println(o1);
//        System.out.println(o2);
//        System.out.println(o1 == o2);
//    }
}

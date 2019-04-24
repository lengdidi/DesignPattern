package singleton;

public class T implements Runnable {

    @Override
    public void run() {
//        LazySingleton lazySingleton = LazySingleton.getInstance();
//        System.out.println(Thread.currentThread().getName() + " " + lazySingleton);
//        LazyDoubleCheckSingleton lazyDoubleCheckSingleton = LazyDoubleCheckSingleton.getInstance();
//        System.out.println(Thread.currentThread().getName() + " " + lazyDoubleCheckSingleton);
//        StaticInnerClassSingleton staticInnerClassSingleton = StaticInnerClassSingleton.getInstance();
//        System.out.println(Thread.currentThread().getName() + " " + staticInnerClassSingleton);

        ThreadLocalInstance threadLocalInstance = ThreadLocalInstance.getInstance();
        System.out.println(Thread.currentThread().getName() + " " + threadLocalInstance);


    }
}

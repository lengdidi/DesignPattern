package composite;

/**
 * 组合模式
 */
public class Test {
    public static void main(String[] args) {
        CatalogComponent linuxCourse = new Course("linux课程", 11);
        CatalogComponent windowsCourse = new Course("windows课程", 22);

        CatalogComponent javaCourseCatalog = new CourseCatalog("Java课程目录", 2);

        CatalogComponent mmallCourse1 = new Course("Java自学1期", 11);
        CatalogComponent mmallCourse2 = new Course("Java自学2期", 22);
        CatalogComponent mmallCourse3 = new Course("Java自学3期", 33);
        CatalogComponent mmallCourse4 = new Course("Java自学4期", 44);

        javaCourseCatalog.add(mmallCourse1);
        javaCourseCatalog.add(mmallCourse2);
        javaCourseCatalog.add(mmallCourse3);
        javaCourseCatalog.add(mmallCourse4);

        CatalogComponent imoocMainCourseCatalog = new CourseCatalog("慕课网课程主目录", 1);
        imoocMainCourseCatalog.add(linuxCourse);
        imoocMainCourseCatalog.add(windowsCourse);
        imoocMainCourseCatalog.add(javaCourseCatalog);

        imoocMainCourseCatalog.print();
    }
}

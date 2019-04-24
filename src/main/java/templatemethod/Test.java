package templatemethod;

/**
 * 模板方法模式
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("后端设计模式课程start---");
        ACourse designPatternCourse = new DesignPattermCourse();
        designPatternCourse.makeCourse();
        System.out.println("后端设计模式课程end---");

        System.out.println("前端课程start---");
        ACourse feCoures = new FECourse(true);
        feCoures.makeCourse();
        System.out.println("前端课程end---");
    }
}

package builder;

/**
 * 建造者模式
 */
public class Test {
    public static void main(String[] args) {
        CourseBuilder courseBuilder = new CourseActualBuilder();
        Coach coach = new Coach();
        coach.setCourseBuilder(courseBuilder);

        Course course = coach.makeCourse("java", "java",
                "java", "java", "java");
        System.out.println(course);
    }
}

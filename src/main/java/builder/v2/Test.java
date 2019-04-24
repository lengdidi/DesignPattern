package builder.v2;

public class Test {
    public static void main(String[] args) {
        Course course = new Course.CourseBuilder().buildCourseName("java").buildCoursePPT("ppt").buildCourseVideo("video").build();
        System.out.println(course);
    }
}

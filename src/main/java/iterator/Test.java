package iterator;

/**
 * 迭代器模式
 */
public class Test {
    public static void main(String[] args) {
        Course course1 = new Course("1");
        Course course2 = new Course("2");
        Course course3 = new Course("3");
        Course course4 = new Course("4");
        Course course5 = new Course("5");
        Course course6 = new Course("6");

        CourseAggregate courseAggregate = new CourseAggregateImpl();

        courseAggregate.addCourse(course1);
        courseAggregate.addCourse(course2);
        courseAggregate.addCourse(course3);
        courseAggregate.addCourse(course4);
        courseAggregate.addCourse(course5);
        courseAggregate.addCourse(course6);

        System.out.println("课程列表--------------");
        printCourses(courseAggregate);

        courseAggregate.removeCourse(course4);
        courseAggregate.removeCourse(course5);

        System.out.println("删除之后的课程列表---------------");
        printCourses(courseAggregate);
    }

    public static void printCourses(CourseAggregate courseAggregate) {
        CourseIterator courseIterator = courseAggregate.getCourseIterator();
        while (!courseIterator.isLastCourse()) {
            Course course = courseIterator.nextCourse();
            System.out.println(course.getName());
        }
    }
}

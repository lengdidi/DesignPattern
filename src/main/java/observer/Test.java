package observer;

/**
 * 观察者模式
 */
public class Test {
    public static void main(String[] args) {
        Course course = new Course("设计模式精讲");
        Teacher teacher = new Teacher("ld");
        course.addObserver(teacher);
        Question question = new Question();
        question.setUserName("lengdi");
        question.setQuestionCOntent("怎么写主函数");
        course.produceQuestion(course, question);
    }
}

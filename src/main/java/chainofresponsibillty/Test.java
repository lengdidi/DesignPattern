package chainofresponsibillty;

/**
 * 责任链模式
 */
public class Test {
    public static void main(String[] args) {
        Approver articleApprover = new ArticleApprover();
        Approver videoApprover = new VideoApprover();

        Course course = new Course();
        course.setName("设计模式精讲");
        course.setArticle("设计模式手记");
        course.setVideo("设计模式视频");

        articleApprover.setNaexApprover(videoApprover);
        articleApprover.deploy(course);
    }
}

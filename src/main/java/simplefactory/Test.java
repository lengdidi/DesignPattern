package simplefactory;

/**
 * 简单工厂模式
 */
public class Test {
    public static void main(String[] args) {
//        Video video = new JavaVideo();
//        video.produce();
//        video = new PythonVideo();
//        video.produce();
//        VideoFactory videoFactory = new VideoFactory();
//        Video video = videoFactory.getVider("java");
//        if (video == null) {
//            return;
//        }
//        video.produce();
        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo(JavaVideo.class);
        if (video == null) {
            return;
        }
        video.produce();
    }
}

package factorymethod;

/**
 * 工厂方法模式
 */
public class Test {
    public static void main(String[] args) {
        VideoFactory videoFactory = new JavaVideoFactory();
        Video video = videoFactory.getVideo();
        video.produce();
        videoFactory = new PythonVideoFactory();
        video = videoFactory.getVideo();
        video.produce();
        videoFactory = new FEVideoFactory();
        video = videoFactory.getVideo();
        video.produce();
    }
}

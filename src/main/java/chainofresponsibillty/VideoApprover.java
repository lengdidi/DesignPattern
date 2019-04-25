package chainofresponsibillty;

import org.apache.commons.lang.StringUtils;

public class VideoApprover extends Approver {
    @Override
    public void deploy(Course course) {
        if (StringUtils.isNotEmpty(course.getVideo())) {
            System.out.println(course.getName() + "含有视频，批准");
            if (approver != null) {
                approver.deploy(course);
            }
        } else {
            System.out.println(course.getName() + "不包含视频，不批准，流程结束");
            return;
        }
    }
}

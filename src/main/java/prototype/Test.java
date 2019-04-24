package prototype;

/**
 * 原型模式
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mail = new Mail();
        mail.setContent("初始化模板");
        for (int i = 1; i <= 10; i++) {
            Mail mailTemp = (Mail) mail.clone();
            mail.setName("姓名" + i);
            mail.setEmailAddress(i + "@qq.com");
            mail.setContent("恭喜您中奖了");
            MailUtil.sendMail(mailTemp);
        }
        MailUtil.saveOriginMailRecord(mail);
    }
}

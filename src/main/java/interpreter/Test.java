package interpreter;

public class Test {
    public static void main(String[] args) {
        String str = "6 100 11 + *";
        LdExpressionParser expressionParser = new LdExpressionParser();
        int result = expressionParser.parse(str);
        System.out.println("解释器计算结果：" + result);
    }
}

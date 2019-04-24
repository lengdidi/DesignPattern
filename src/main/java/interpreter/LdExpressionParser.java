package interpreter;

import java.util.Stack;

public class LdExpressionParser {
    private Stack<Interpreter> stack = new Stack<>();

    public int parse(String str) {
        String[] strItemArray = str.split(" ");
        for (String symbol : strItemArray) {
            if (!OperatorUtil.isOperator(symbol)) {
                Interpreter numberExpression = new NumberIntrpreter(symbol);
                stack.push(numberExpression);
                System.out.println(String.format("入栈：%d", numberExpression.interprte()));
            } else {
                Interpreter firstExpression = stack.pop();
                Interpreter secondExpression = stack.pop();
                System.out.println(String.format("出栈:%d 和 %d", firstExpression.interprte(), secondExpression.interprte()));
                Interpreter operator = OperatorUtil.getExpressionObject(firstExpression, secondExpression, symbol);
                System.out.println(String.format("应用运算符： %s", operator));
                int result = operator.interprte();
                NumberIntrpreter resultExpression = new NumberIntrpreter(result);
                stack.push(resultExpression);
                System.out.println(String.format("阶段结果入栈： %d", resultExpression.interprte()));
            }
        }
        int result = stack.pop().interprte();
        return result;
    }
}

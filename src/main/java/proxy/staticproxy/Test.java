package proxy.staticproxy;

import proxy.IOrderService;
import proxy.Order;
import proxy.OrderServiceImpl;
import proxy.dyamicproxy.OrderServiceDynamicProxy;

/**
 * 动态代理模式
 */
public class Test {
    public static void main(String[] args) {
        Order order = new Order();
        order.setUserId(1);

        IOrderService orderService = (IOrderService) new OrderServiceDynamicProxy(new OrderServiceImpl()).bind();
        orderService.saveOrder(order);

    }
}

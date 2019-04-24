package proxy.staticproxy;

import proxy.IOrderService;
import proxy.Order;
import proxy.OrderServiceImpl;
import proxy.db.DataSourceCOntextHolder;

public class OrderServiceStaticProxy {
    private IOrderService iOrderService;

    public int saveOrder(Order order) {
        beforeMethod(order);
        iOrderService = new OrderServiceImpl();

        afterMethod();
        return iOrderService.saveOrder(order);
    }

    private void beforeMethod(Order order) {
        int userId = order.getUserId();
        int dbRouter = userId % 2;
        System.out.println("静态代理分配到[db" + dbRouter + "]处理数据");

        DataSourceCOntextHolder.setDBType("db" + String.valueOf(dbRouter));
        System.out.println("静态代理 before code");
    }

    private void afterMethod() {
        System.out.println("静态代理 after code");
    }

}

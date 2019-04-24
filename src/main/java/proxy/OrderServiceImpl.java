package proxy;

public class OrderServiceImpl implements IOrderService {
    private IOrderDao iOrderDao;

    @Override
    public int saveOrder(Order order) {
        //Spring
        iOrderDao = new OrderDaoImpl();
        System.out.println("Service层调用Dao层添加成功");
        return iOrderDao.insert(order);
    }

}

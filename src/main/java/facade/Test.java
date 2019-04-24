package facade;

/**
 * 外观模式
 */
public class Test {
    public static void main(String[] args) {
        PointsGift pointsGift = new PointsGift("手机");
        GiftExchangeService giftExchangeService = new GiftExchangeService();
        giftExchangeService.setPointsPaymentService(new PointsPaymentService());
        giftExchangeService.setQualifyService(new QualifyService());
        giftExchangeService.setShippingService(new ShippingService());

        giftExchangeService.giftExchange(pointsGift);
    }
}

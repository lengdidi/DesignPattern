package decorator.v1;

/**
 * 装饰者模式
 */
public class Test {
    public static void main(String[] args) {
        Battercake battercake = new Battercake();
        System.out.println(battercake.getDesc() + "销售价格：" + battercake.cost());

        BattercakeWithEgg battercakeWithEgg = new BattercakeWithEgg();
        System.out.println(battercakeWithEgg.getDesc() + "销售价格：" + battercakeWithEgg.cost());

        BattercakeWithEggSauasge battercakeWithEggSauasge = new BattercakeWithEggSauasge();
        System.out.println(battercakeWithEggSauasge.getDesc() + "销售价格：" + battercakeWithEggSauasge.cost());

    }
}

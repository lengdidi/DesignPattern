package adapter;

public class PowerAdapter implements DC5 {
    private AC220 ac220 = new AC220();

    @Override
    public int outputDC5V() {
        int adapterInput = ac220.output220V();
        int adapterOutPut = adapterInput / 44;
        System.out.println("使用PowerAdapter输出AC:" + adapterInput + "V,输出DC:" + adapterOutPut);
        return adapterOutPut;
    }

}

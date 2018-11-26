package structural.adaptor.objectAdaptor;

public class APP {
    public static void main(String[] args) {
        // 有一只野鸡
        Cock wildCock = new WildCock();
        // 成功将野鸡适配成鸭
        Duck duck = new CockAdaptor(wildCock);

        //do something...
    }
}

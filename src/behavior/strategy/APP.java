package behavior.strategy;

public class APP {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(num1, num2));

        context = new Context(new OperationSubstract());
        System.out.println("10 - 5 = " + context.executeStrategy(num1, num2));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(num1, num2));
    }
}

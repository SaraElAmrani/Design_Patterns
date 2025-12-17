package ma.elamrani;

public class DefaultStrategyImpl implements Strategy {
    @Override
    public void operationStrategy() {
        System.out.println("===============================");
        System.out.printf("This is Default Strategy impl ");
        System.out.println("===============================");
    }
}

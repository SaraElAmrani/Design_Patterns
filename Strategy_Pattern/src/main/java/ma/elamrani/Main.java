package ma.elamrani;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Context context = new Context();
        Scanner scanner = new Scanner(System.in);
        Map<String, Strategy> strategies = new HashMap<>();
        Strategy strategy;
        while (true){
            System.out.println("Which strategy would you like to use?");
            String strategyName = scanner.nextLine();
            strategy = strategies.get(strategyName);
            if (strategy == null){
                System.out.printf("New object creation of StrategyImpl" + strategyName);
                strategy = (Strategy) Class.forName("ma.elamrani.StrategyImpl" + strategyName).getConstructor().newInstance();
                strategies.put(strategyName, strategy);
            }

            context.setStrategy(strategy);
            context.effectuerOperation();
        }
    }
}

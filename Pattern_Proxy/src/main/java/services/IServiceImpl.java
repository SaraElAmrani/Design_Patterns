package services;

public class IServiceImpl implements IService {
    @Override
    public double compute(int t) {
        System.out.println("Computing .....");
        return Math.cos(t * Math.PI / 100) * Math.sqrt(t * t);

    }
}

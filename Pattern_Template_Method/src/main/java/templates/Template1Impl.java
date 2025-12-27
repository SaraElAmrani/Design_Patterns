package templates;

public class Template1Impl extends Template {

    @Override
    public int param1() {
        return 3;
    }

    @Override
    public double compute(int a, int b) {
        return Math.sqrt(a*a + b*b);
    }
    // comme les franchises tu achete une franchise et tu l a personaliser

}

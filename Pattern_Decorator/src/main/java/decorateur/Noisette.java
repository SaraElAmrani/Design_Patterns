package decorateur;


import composants.Boisson;

public class Noisette extends Decorateur{

    public Noisette(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDescription() {
        return boisson.getDescription()+" Au Noisette";
    }

    @Override
    public double cout() {
        return 1.2 + boisson.cout();
    }
}

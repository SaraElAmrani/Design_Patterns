import composants.Boisson;
import composants.Sumatra;
import decorateur.Caramel;
import decorateur.Chocolat;
import decorateur.Noisette;

public class Main {
    public static void main(String[] args) {

        /*Boisson boisson;
        boisson = new Sumatra();
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());
        System.out.println("---------------------------------");
        boisson = new Chocolat(boisson);
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());
        System.out.println("---------------------------------");
        boisson = new Caramel(boisson);
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());
        System.out.println("---------------------------------"); */

        Boisson b;
        b = new Chocolat(new Caramel(new Chocolat(new Caramel(new Noisette(new Sumatra())))));
        System.out.println(b.getDescription());
        System.out.println(b.cout());

    }
}

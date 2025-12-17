import obs.*;


public class Main {
    public static void main(String[] args) {
        ObservableImpl observable = new ObservableImpl();
        Observer observer1 = new ObserverImpl1();
        Observer observer2 = new ObserverImpl2();
        observable.subscribe(observer1);
        observable.subscribe(observer2);

        observable.subscribe(new Observer() {
            @Override
            public void update(Observable o) {
                System.out.println("++++++++++++++++ OBS IMPL 3 +++++++++++");
                System.out.println(" Res = " + ((ObservableImpl) o).getState() * Math.cos(((ObservableImpl) o).getState()));
                System.out.println("++++++++++++++++ OBS IMPL 3 +++++++++++");
            }
        });

        observable.subscribe((obs) -> {
            if (obs instanceof ObservableImpl o) {
                System.out.println("++++++++++++++++ OBS IMPL 4 +++++++++++");
                System.out.println(" Res = " + o.getState() * Math.cos(o.getState()));
                System.out.println("++++++++++++++++ OBS IMPL 4 +++++++++++");
            }

        });


        observable.setState(60);
        observable.setState(80);
        observable.unsubscribe(observer2);
        observable.setState(100);

       /* Button but = new Button("OK");
        button.addActionListener(e -> {
            System.out.println(e.getSource());
        });*/


    }
}

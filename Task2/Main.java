package Task2;

import Task1.Human;

public class Main {
    
    public static void main(String[] args) {
        Market market1 = new Market();
        Human human1 = new Human("Geospatii", 21, "Nizhnee Gmihovo");
        Human human2 = new Human("Evrentii", 90, "Muxosranks");
        Human human3 = new Human("Feodosii", 2, "Kukundrovo");
        Human human4 = new Human("Sevratii", 45, "Saint Lopatovo");

        market1.acceptToMarket(human1);
        market1.acceptToMarket(human1);
        market1.acceptToMarket(human2);
        market1.acceptToMarket(human3);
        System.out.println();
        market1.giveOrder();
        market1.takeOrder();
        market1.update();
        System.out.println(market1);
        market1.update();
        market1.update();
        market1.update();
        market1.giveOrder();
        System.out.println();
        market1.acceptToMarket(human4);
        System.out.println(market1);
        market1.releaseFromQueue();
        System.out.println(market1);
        market1.acceptToMarket(human1);
        System.out.println(market1);

    }
}

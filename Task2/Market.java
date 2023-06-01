package Task2;

import java.util.ArrayList;
import java.util.List;

import Task1.Actor;

public class Market implements MarketBehavior, QueueBehavior {

    private final List<Actor> listActors;
    private final List<Actor> listReleaseActors;
    private int takeOrderCount = 0;
    private int giveOrderCount = 0;

    public Market() {
        listActors = new ArrayList<>();
        listReleaseActors = new ArrayList<>();
    }

    public void acceptToMarket(Actor actor) {
        if (! listActors.contains(actor)) {
            System.out.println(actor.getName() + " подключился к магазину");
            takeInQueue(actor);
        } else System.out.println(actor.getName() + " уже в магазине");
    }

    public void takeInQueue(Actor actor) {
        System.out.println(actor.getName() + " встал в очередь");
        listActors.add(actor);
    }

    public void takeOrder() {
        if (takeOrderCount < listActors.size()) {
            listActors.get(takeOrderCount).setMakeOrder();
            takeOrderCount += 1;
        } else System.out.println("Все в очереди сделали заказ");
    }

    public void giveOrder() {
        if (giveOrderCount < listActors.size() && listActors.get(giveOrderCount).isMakeOrder()) {
            listActors.get(giveOrderCount).setTakeOrder();
            giveOrderCount += 1;
        } else if (takeOrderCount == 0) {
            System.out.println("Никаких заказов нет");
        } else System.out.println("Все заказы отданы");
    }

    public void releaseFromQueue() {
        for (int i = 0; i < giveOrderCount; i++) {
            listReleaseActors.add(listActors.get(i));
            listActors.get(i).unsetMakeOrder();
            listActors.get(i).unsetTakeOrder();
        }
        System.out.println(nameOfListActorsToString(listReleaseActors) + " покинули очередь");
        releaseFromMarket(listReleaseActors);
        listReleaseActors.clear();
        giveOrderCount = 0;
        takeOrderCount = 0;
    }

    public void releaseFromMarket(List<Actor> actors) {
        listActors.removeAll(actors);
        System.out.println(nameOfListActorsToString(actors) + " вышли из магазина");
    }

    public String nameOfListActorsToString(List<Actor> actors) {
        String textName = actors.get(0).getName();
        for (int i = 1; i < actors.size(); i++) {
            textName += String.format(", %s", actors.get(i).getName());
        }
        return textName;
    }

    public void update() {
        takeOrder();
        giveOrder();
    }

    @Override
    public String toString() {
        String text = "\n";
        for (int i = 0; i < listActors.size(); i++) {
            if (listActors.get(i).isTakeOrder()) {
                text += String.format("%d: %s - заказ получен\n", i + 1, listActors.get(i).getName());
            } else if (listActors.get(i).isMakeOrder()) {
                text += String.format("%d: %s - заказ сделан\n", i + 1, listActors.get(i).getName());
            } else {
                text += String.format("%d: %s - заказ не сделан\n", i + 1, listActors.get(i).getName());
            }
        }
        return text;
    }

}

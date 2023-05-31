package Task2;

import java.util.List;

import Task1.Actor;

public interface MarketBehavior {
    
    void acceptToMarket(Actor actor);
    void releaseFromMarket(List<Actor> actors);
    void update(); 

}


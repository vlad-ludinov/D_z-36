package Task2;

import Task1.Actor;

public interface QueueBehavior {
    
    void takelnQueue(Actor actor);
    void takeOrder();
    void giveOrder();
    void releaseFromQueue();

}

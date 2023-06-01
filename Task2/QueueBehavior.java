package Task2;

import Task1.Actor;

public interface QueueBehavior {
    
    void takeInQueue(Actor actor);
    void takeOrder();
    void giveOrder();
    void releaseFromQueue();

}

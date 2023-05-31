package Task1;

/**
 * Actor
 */
public abstract class Actor implements ActorBehavior {

    private String name;
    private boolean isMakeOrder;
    private boolean isTakeOrder;

    public Actor(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setMakeOrder() {
        System.out.println(name + " сделал заказ");
        isMakeOrder = true;
    }

    @Override
    public void setTakeOrder() {
        System.out.println(name + " забрал заказ");
        isTakeOrder = true;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
    }
    
}

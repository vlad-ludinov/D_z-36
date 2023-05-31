package Task1;

public class Human extends Actor {

    private int age;
    private String adress;

    public Human(String name, int age, String adress) {
        super(name);
        this.age = age;
        this.adress = adress;
    }

    public String orderStatus() {
        if (isMakeOrder()) {
            if (isTakeOrder()) {
                return "заказ забран";
            }
            return "заказ сделан";
        }
        return "заказ не сделан";
    }

    @Override
    public String toString() {
        return String.format("Клиент: %s, возраст %s, адресс %s - %s", getName(), age, adress, orderStatus());
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getAge() {
        return age;
    }

    public String getAdress() {
        return adress;
    }
    
}
package Task1;

public class Main {
    
    public static void main(String[] args) {
       
        Human human1 = new Human("Evgen", 2, "Saratov");

        System.out.println(human1);
        human1.setMakeOrder();
        System.out.println(human1);
        human1.setTakeOrder();
        System.out.println(human1);

    }
}
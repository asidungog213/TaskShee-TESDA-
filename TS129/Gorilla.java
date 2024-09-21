package TS129;

public class Gorilla implements Animal {
    @Override
    public boolean feed(boolean timeToEat) {
        if (timeToEat) {
            System.out.println("Put gorilla food into cage");
            return true;
        } else {
            System.out.println("Not time to eat yet");
            return false;
        }
    }

    @Override
    public void groom() {
        System.out.println("Grooming gorilla...");
        System.out.println("Lather, rinse, repeat");
    }

    @Override
    public void pet() {
        System.out.println("Pet at your own risk!");
        System.out.println("Gorilla may get angry if petted incorrectly");
    }
}

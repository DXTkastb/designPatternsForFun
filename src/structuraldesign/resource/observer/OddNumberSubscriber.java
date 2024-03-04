package structuraldesign.resource.observer;

public class OddNumberSubscriber implements Subscriber{
    @Override
    public void listener(int number) {
        System.out.println("Number is ODD :"+ number);
    }
}

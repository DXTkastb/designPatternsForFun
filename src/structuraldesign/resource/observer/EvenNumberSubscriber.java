package structuraldesign.resource.observer;

public class EvenNumberSubscriber implements Subscriber{
    @Override
    public void listener(int number) {
        System.out.println("Number is EVEN :"+ number);
    }
}

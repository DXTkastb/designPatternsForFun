package structuraldesign.resource.facade;

public class AddOperation implements Operation{
    @Override
    public int performOperationAndFetchResult(int number) {
        return number + 1;
    }

}

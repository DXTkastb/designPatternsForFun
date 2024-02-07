package structuraldesign.resource.facade;

public class SubtractOperation implements Operation{
    @Override
    public int performOperationAndFetchResult(int number) {
        return number - 1;
    }
}

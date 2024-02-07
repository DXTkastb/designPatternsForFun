package structuraldesign.resource.facade;

public class OperationService {
    private OperationService(){
    }

    private static OperationService operationService;
    public static OperationService getInstance() {
        if(operationService == null)
            operationService = new OperationService();
        return operationService;
    }

    public int doOperation(int number,Operation operation){
        return operation.performOperationAndFetchResult(number);
    }
}

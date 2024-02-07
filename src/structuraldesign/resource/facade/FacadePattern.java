package structuraldesign.resource.facade;

public class FacadePattern {
    public static void main(String[] args) {
        OperationService operationService = OperationService.getInstance();
        Operation addOperation = new AddOperation();
        Operation subtractOperation = new SubtractOperation();
        System.out.println(operationService.doOperation(10,addOperation));
        System.out.println(operationService.doOperation(10,subtractOperation));
    }
}

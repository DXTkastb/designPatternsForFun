package structuraldesign.resource.observer;

public class GetSubscriberType {
    public static String even_sub_type_name = "EVEN_SUBSCRIBER";
    public static String odd_sub_type_name = "ODD_SUBSCRIBER";

    public static String getType(int value){
        if(value%2 == 0) return even_sub_type_name;
        else return odd_sub_type_name;
    }
}

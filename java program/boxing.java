public class boxing {
    public static void main(String[] args) {
        /*why this process do because the data will transform easyly and fast to send */
        //autoboxing it conver primitive data type to object 
        double primitivedoble=1234.567789;
        Double objectDouble=primitivedoble;
        System.out.println("Primitive double:"+primitivedoble);
        System.out.println("Oject Double:"+objectDouble);//boxing
        System.out.println();
        //unboxing it convert object data to primitive data
        float primitivefloat=23.345f;
        Float objecFloat=primitivefloat;
        float unboxing=objecFloat;
        System.out.println("primitive double:"+primitivefloat);
        System.out.println("object Double:"+objecFloat);//boxing
        System.out.println("unboxing:"+unboxing);//unboxing 
    }
}

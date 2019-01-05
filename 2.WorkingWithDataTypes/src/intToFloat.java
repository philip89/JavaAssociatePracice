public class intToFloat {

    public static void main(String []args){
        int i = 1234567890;
        float f = i;
        System.out.println(f);// float wont hold a value so large so it creates a diff number
        System.out.println(i - (int)f);
    }
}

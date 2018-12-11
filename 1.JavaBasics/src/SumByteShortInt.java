public class SumByteShortInt {
// The following works as int is larger than any of the other variables
// If you change the last int to byte or short it will not compile
//If you change it to a double or float you will get 7.0 as the output
    public static void main(String args[]){
        byte starting = 3;
        long firstValue = 5;
        int secondValue = 7;
        int functionValue = (int) (starting/2 + firstValue/2 + (int) firstValue/3 ) + secondValue/2;
        System.out.println(functionValue);
    }
}

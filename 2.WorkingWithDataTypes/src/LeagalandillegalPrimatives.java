public class LeagalandillegalPrimatives {

    public static void main(String [] args){

        char c = 320; //ok
        float f = 320; //ok
        double d = 320; //ok
        //byte b = 320; // not ok it needs to be wrapped eg
        byte b2 = (byte) 320;
        float f2 = 22.0f/7.0f;
        long g = 012;// This s a valid Octa number also watch out for hex umbers
        float f3 = -123;
    }
}

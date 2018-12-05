public class BooleanWrapper {

    public static void main(String [] args){
        //Which of the following yeild false

        System.out.println(Boolean.parseBoolean("true") == true);
        System.out.println(Boolean.parseBoolean("TrUe") == new Boolean(null));
        System.out.println(new Boolean("TrUe") == new Boolean(true));
       // System.out.println(new Boolean() == false)//This will not compile because Boolean class does not have a no-args constructor
        System.out.println(new Boolean("true") == Boolean.TRUE);
        System.out.println(new Boolean("no") == false);
    }
}

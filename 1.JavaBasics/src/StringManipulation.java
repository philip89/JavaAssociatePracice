public class StringManipulation {

    static String g = "philip";
    public  static void main(String [] args){
        System.out.println(g);
        changeit(g);
        System.out.println(g);

    }

    public static  String changeit(String local){


        return local.concat("m");
    }
}

public class ParseStringToLong{

    public static void main(String[] args){


        String mStr="123";
        long m= new Long(mStr);
        long m1 = Long.parseLong(mStr);
        long m2 = Long.valueOf(mStr).longValue();


        System.out.println(m);
        System.out.println(m1);
        System.out.println(m2);

        // These dont work
//        (new Long()).parseLong(mStr); Long does not have a no args constructor so cannot work
//        Long.longValue(mStr) : longValue is a non-static method in Long class

        //This is how to use longValue
        Float i = new Float (3.0);
        i.longValue();


    }
}

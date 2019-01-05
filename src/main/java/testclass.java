public class testclass  {
    static{
    }
    public static void main(String []args){

        String s = "123";
        Long l = Long.valueOf(s).longValue();

        System.out.println(l);
    }

    Object m1(){
        return new Object();
    }
    void m2(){
        Object s = (Object) m1();
    }
}

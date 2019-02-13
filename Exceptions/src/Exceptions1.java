public class Exceptions1 {


    public static void main(String[] args) throws Exception{


        try{
            m1();
            System.out.println("1");
        }finally {
            System.out.println("2");
        }
        System.out.println("3");



    }
    public static void m1() throws Exception{ throw new Exception();}

}

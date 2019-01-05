public class SuperOrSubVariablesUsed {

    public static void main(String [] args){

        System.out.println(new b().a + " " + new b().b );

    }


}

class a{
    int a = 1;
    static int b = 2;

}
class b extends a{
    int a = 3;
    static int b = 4;

}

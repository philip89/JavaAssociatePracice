public class TestingStaticVariableScope {



    public static void main(String[] args){

        System.out.println(Super.s);

    }

}

class Super{
    static String s = "super";
    String p = "sup";
}

class Sub extends Super{
    static String s= "sub";

    static {
        System.out.println("in static initializer sub");
    }
}

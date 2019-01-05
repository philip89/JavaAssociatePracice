public class ConstructorCallsuperIfdefault {

    public static void main (String [] args){


        B b = new B();

    }

}

class A{

    public A(){

        System.out.println("A");
    }

    public  String n(){return "";};
}
class B extends A{

    public B(){}
    public String n(){return "";};
}
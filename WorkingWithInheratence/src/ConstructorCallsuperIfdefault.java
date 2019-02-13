public class ConstructorCallsuperIfdefault {

    public static void main (String [] args){


        B b = new B();

        A[] a, al;
        B[] b2;

        a = new A[10];al = a;
//        b2 = (B[]) a;
        b2 = new B[20];
        a =  b2;
        al = b2;
        b2 = (B[]) a;
        b2 = (B[]) al;

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
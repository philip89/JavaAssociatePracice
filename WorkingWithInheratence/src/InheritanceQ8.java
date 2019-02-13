public class InheritanceQ8 {

    public static void main(String args[]){

        A1 a = new C1();
        B1 b = (B1) a;

        System.out.println(b.m1());

    }
}

class A1{
    int i = 0;
    int m1(){
        return i;
    }

}
class B1 extends A1{
    int i = 2;
    int m1(){
        return i;
    }
}

class C1 extends B1{
    int i = 3;
    int m1(){
        return i;
    }

}
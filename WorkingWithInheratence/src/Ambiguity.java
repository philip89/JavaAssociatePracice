public class Ambiguity implements i1, i2{


    public void m1(){
        System.out.println("Hello");
    }
    public static void main(String[] args){
        Ambiguity a = new Ambiguity();
        ((i1) a).m1();


    }
}
interface i1{
    int VALUE = 1;
    void m1();
}

interface i2{
    int VALUE = 2;
    void m1();
}
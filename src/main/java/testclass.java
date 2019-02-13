import java.util.ArrayList;
import java.util.List;
public class testclass {
    public static void main(String[] args) throws Exception {

        int[][] p = {{1, 0}, {2, 3}, {4, 5}};
        for (int x = 0; x <=p.length; x++) {
            System.out.println(p[x]);
        }


        List a = new ArrayList();
        a.add(1);
        a.add("3");

    }


}

class B {

     public static void main(String [] args)throws Exception{
        B b = new B();
        b.s(10);


    }

    public void s(int q){
        A a = new A();
        System.out.println(a.q);
    }
}

class A {
    protected int q=0;

}


class AB{
    AB(){print();}
    void print(){
        System.out.println("AB");
    }
}


public class RealBrainer extends AB{
    int i = 4;
    public static void main(String[] args){
        AB a = new RealBrainer();
        a.print();
    }

    void print(){
//        System.out.println("2");
        System.out.println(i);
    }

}


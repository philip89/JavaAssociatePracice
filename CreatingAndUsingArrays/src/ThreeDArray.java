public class ThreeDArray {

    public static void main(String [] args){

        double daaa[][][] = new double[3][][];
        double d = 100.0;
        double[][] daa = new double[1][1];

//    Which of the following will not cause a problem at runtime
       // daaa[0] = d;  //daaa[0] should be a 2 dimensional array because daaa is a 3 dimensional array.
        daaa[0] = daa;
        //daaa[0] = daa[0]; //daa[0] is nota 2 d array
//        daa[1][1] = d; //daa[1][1] will cause an ArrayIndexOutOfBoundsException because daa's length is only 1 and the indexing starts from 0. To access the first element, you should use daa[0][0].
        daa = daaa[0];
        System.out.println(daa);
    }
}

import java.util.Arrays;

public class ArrayQ7 {


    public static void main(String[] args){
        int i = 4;
        int ia[][][] = new int[i][i = 3][8];//first array is setting length of ia,
        // second i setting how many arrays are in each array and
        // last value is setting how many values arw in each array
        System.out.println( ia.length + ", " + ia[0].length+", "+ ia[1].length +", "+ ia[2].length +", "+ ia[3].length);
        System.out.println(Arrays.deepToString(ia));

        int array[][] ={{2,3,4},{2,3}};
//        array[0][0] = 3;
//        array[1][0] = 2;
//        System.out.println( array.length + ", " + array[0].length+", "+ array[1].length +", "+ array[2].length);
        System.out.println(Arrays.deepToString(array));

    }
}

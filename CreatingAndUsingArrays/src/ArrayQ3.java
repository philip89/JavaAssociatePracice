public class ArrayQ3 {
    public static void main(String[] args) {
        int ia[][] = {{1, 2}, null};
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                System.out.println(ia[i][j]);
    }
}
//It will throw a NullPointerException for ia[1][0] because ia[1] is null.
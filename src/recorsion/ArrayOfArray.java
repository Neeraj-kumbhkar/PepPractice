package recorsion;

public class ArrayOfArray {
    public static void main(String[] args) {
        int[][] arrOfArr= new int[][]{{1},{1}, {2, 3}, {4,6}, {3}, {2, 4}};
        int[] res= flattnArr(arrOfArr);
    }

    /*private static int[] flattnArr(int[][] arrOfArr) {
        flattnArr(arrOfArr);
    }*/
}

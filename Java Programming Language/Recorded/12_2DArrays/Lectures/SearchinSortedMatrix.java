public class SearchinSortedMatrix {
    public static boolean stairCaseSearch(int[][] matrix, int key){

        boolean flag = false;
        return flag;
    }

    public static void main(String[] args) {
        int[][] mat = {
                { 10, 20, 30, 40 },
                { 15, 25, 25, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 },
        };
        int key = 33;
        System.out.println(stairCaseSearch(mat, key));
    }
}

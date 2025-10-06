import java.util.*;

public class MultiDimensionArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();

        ArrayList<Integer> list = new ArrayList<>();
        // list.add(1);
        // list.add(2);
        // list.add(3);
        // list.add(4);
        // list.add(5);
        for(int i = 1; i<=5; i++){
            list.add(i*1);
        }
        matrix.add(list);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(4);
        list2.add(6);
        list2.add(8);
        list2.add(10);
        matrix.add(list2);

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(3);
        list3.add(6);
        list3.add(9);
        list3.add(12);
        list3.add(15);
        matrix.add(list3);


        for(int i = 0; i<matrix.size(); i++){
            ArrayList<Integer> currList = matrix.get(i);
            for(int j=0; j<currList.size(); j++){
                System.out.print(currList.get(j) + " ");
            }
            System.out.println();
        }

    }
}

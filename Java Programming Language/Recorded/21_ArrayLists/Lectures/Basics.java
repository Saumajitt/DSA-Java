import java.util.ArrayList;

public class Basics {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        
        
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);


        // System.out.println(list);
        list.add(1, 99);  //----> O(n) -- new element is squeezed in between existing ones, the ones on the right are pushed to the right and the size is adjusted accordingly


        System.out.println(list);




        int element = list.get(0);
        System.out.println(element);

        list.remove(2);  // O(n)
        System.out.println(list);


        // set element at index

        list.set(2, 10);  //O(n)
        System.out.println(list);



        // contains element --> O(n)

        System.out.println(list.contains(1));
        System.out.println(list.contains(11));




        // System.out.println(list.size());

        // print arraylist
        for(int i = 0; i<list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();



        // //Print Reverse

        for (int i = list.size() -1 ; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();






    }
}

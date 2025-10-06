import java.util.ArrayList;
public class Maximum {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(6);
        list.add(8);


        int maxi = Integer.MIN_VALUE;
        for(int i = 0; i<list.size(); i++){
            // if(list.get(i) > maxi){
            //     maxi = list.get(i);
            // }

            maxi = Math.max((maxi), list.get(i));
        }

        System.out.println("Max element = " + maxi);

    }
    
}

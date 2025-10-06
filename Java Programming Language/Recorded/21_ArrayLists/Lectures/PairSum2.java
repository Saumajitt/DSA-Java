import java.util.ArrayList;


//sorted and rotated
public class PairSum2 {
   public static void main(String[] args) {
       ArrayList<Integer> list = new ArrayList<>();
       list.add(11);
       list.add(15);
       list.add(6);
       list.add(8);
       list.add(9);
       list.add(10);

       int target = 16;
       System.out.println(pairSum2(list, target));
       

   } 


   static boolean pairSum2(ArrayList<Integer> list, int target){
        int pivotPoint = -1;
        for(int i = 0; i<list.size(); i++){
           if(list.get(i) > list.get(i+1)){ //--> pivot or breakingpoint of the list
                pivotPoint = i;
                break;
           }
        }

        int lp = pivotPoint+1;  //smallest

        int rp = pivotPoint; // largest
        int n = list.size();

        while(lp!=rp){
            if(list.get(lp) + list.get(rp) == target){
                return true;
            }else if(list.get(lp) + list.get(rp) > target){
                rp = (n+rp-1)%n;
            }else{
                lp = (lp+1)%n;
            }
        }


        return false;
   }
}

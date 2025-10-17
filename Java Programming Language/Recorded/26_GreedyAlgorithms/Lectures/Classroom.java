import java.util.*;
public class Classroom {
    public static void main(String[] args) {
        int[] start = {1, 3, 0, 5, 8, 5};
        int[] end = {2, 4, 6, 7, 9, 9};  //this one is sorted but most questions will come where the array containing end times is not sorted 

        //the 2d array activities has 3 columns one for keeping track of the activity number , 2nd one is for start time of that particular activity and the third one is for end time of that particular activity
        int[][] activities = new int[start.length][3]; // 2d array for us to store each activity its index, start time and end time
        for(int i=0; i<start.length; i++){
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }

        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2])); //lambda expression 

        int maxActivities = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        //1st activity should always be taken as the first activity being selected as we have the activities sorted in order of end time
        // add the first activity which is stored in the 1st row of the 2d array we have created hence it is activities[0][0] -> 0th row and 0th column
        maxActivities = 1;
        ans.add(activities[0][0]);
        int lastEnd = activities[0][2]; //we need the end time of the last activity we had selected for implementing the core logic
        for(int i =1; i<start.length; i++){
            //selecting the activity -> core logic is based on the idea that we nedd to avoid overlap and get the disjoint activities , as one activity can be done at a time
            if(activities[i][1] >= lastEnd){
                maxActivities++;
                ans.add(activities[i][0]);
                lastEnd = activities[i][2];
            }
        }

        System.out.println("Max number of activities = " + maxActivities);
        // to print the activities we have selected according to our logic
        for(int i = 0; i<ans.size(); i++ ){
            System.out.println("Activity: " + i + " ");
            // System.out.println();
        }
    }
}

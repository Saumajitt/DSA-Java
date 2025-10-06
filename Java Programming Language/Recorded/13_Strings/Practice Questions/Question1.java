import java.util.*;
public class Question1 {
    public static void printLetters(String str){
        for(int i = 0; i<str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter String: ");
        // String str = sc.nextLine();
        // String fulln = "Mr." + str;
        // System.out.println(fulln);
        // System.out.println(str.length());
        String str = "NewDog";
        printLetters(str);
    }
}

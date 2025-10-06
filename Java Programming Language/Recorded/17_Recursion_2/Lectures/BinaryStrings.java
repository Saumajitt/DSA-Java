public class BinaryStrings {
    public static void main(String[] args) {
        printBinaryStrings(3, 0, "");
    }


    public static void printBinaryStrings(int n, int lastPlace, String str){

        //base case
        if(n==0){
            System.out.println(str);
            return;
        }

        // if(lastPlace == 0){
        //     printBinaryStrings(n-1, 0, str.append("0"));
        //     printBinaryStrings(n-1, 1, str.append("1"));
        // }else{
        //     printBinaryStrings(n - 1, 0, str.append("0"));
        // }

        //kaam
        printBinaryStrings(n - 1, 0, str+"0");
        if(lastPlace == 0){
            printBinaryStrings(n - 1, 1, str+"1");
        }
    }
}



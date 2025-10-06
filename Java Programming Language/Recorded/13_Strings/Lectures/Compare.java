public class Compare {
    public static void main(String[] args) {
        String s1 = "Tony";
        String s2 = "Tony";
        String s3 = new String("Tony");

        if(s1 == s2){
            System.out.println("String are equal");
        } else {
            System.out.println("Strings are not equal");
        }

        // if (s1 == s3) {
        //     System.out.println("String are equal");
        // } else {
        //     System.out.println("Strings are not equal");
        // }

        if(s1.equals(s3)){  //this time this functions just checks the value so it will print they are equal unlike the previous code logic
            System.out.println("String are equal");
        } else {
            System.out.println("Strings are not equal");
        }
    }   
}

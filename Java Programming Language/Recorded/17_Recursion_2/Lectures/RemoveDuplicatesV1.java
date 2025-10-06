public class RemoveDuplicatesV1 {
    public static void main(String[] args) {
        String str = "appnnacollege";
        boolean[] map = new boolean[26]; // to store the characters from 'a' to 'z'
        removeDuplicates1(str, 0, new StringBuilder(""), map);
    }

    // input characters are from 'a - 'z' only.
    // if we make it more complex like uppercase, special characters, unicode characters
    // then we can use HashSet to store the characters.
    // this is the easier version
    //output string will have unique characters only
    
    public static void removeDuplicates1(String str, int idx, StringBuilder newStr, boolean[] map) {
        
        //base case
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }


        // recursive case
        char currChar = str.charAt(idx);
        if(map[currChar-'a'] == true){
            // duplicate character found
            removeDuplicates1(str, idx+1, newStr, map);
        }else{
            // unique character found so add it to the new string use append method of StringBuilder
            map[currChar-'a'] = true;
            removeDuplicates1(str, idx+1, newStr.append(currChar), map);
        }
    }
}

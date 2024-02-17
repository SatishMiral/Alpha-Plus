import java.util.*;
public class IsAnagram {
    public static void main(String[] args) {
        String str1 = "earth";
        String str2 = "heare";
        
        //Converting to lowercase
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        //checking if the lengths are equal
        if(str1.length() == str2.length()){
            // converting to char arrray to check each letter is same or not
            char[] str1charArray = str1.toCharArray();
            char[] str2charArray = str2.toCharArray();

            //sorting the array
            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);

            //checking if equal
            boolean result = Arrays.equals(str1charArray, str2charArray);
            
            if(result){
                System.out.println("Both "+str1+ " and "+str2+ " are Anagrams.");
            }
            else{
                System.out.println("Both "+str1+ " and "+str2+ " are not Anagrams.");
            }
        }
        else{
            System.out.println("Both "+str1+ " and "+str2+ " are not Anagrams.");
        }
    }
}
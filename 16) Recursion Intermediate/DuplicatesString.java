public class DuplicatesString {
    public static StringBuilder removeDuplicate(String str, int i, boolean map[], StringBuilder newstr){
        if(i == str.length()){
            return newstr;
        }
        char currchar = str.charAt(i);
        if (map[currchar-'a'] == true){
            removeDuplicate(str, i+1, map, newstr);
        }
        else{
            map[currchar-'a'] = true;
            removeDuplicate(str, i+1, map, newstr.append(currchar));
        }

        return newstr;
    }
    public static void main(String[] args) {
        System.out.print(removeDuplicate("satishmiral", 0, new boolean[26], new StringBuilder("")));
    }
}

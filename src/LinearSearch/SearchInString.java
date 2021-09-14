package LinearSearch;
public class SearchInString {

    public static void main(String[] args) {
        String s = "Rahul";
        char find = 's';
        boolean isPresent = Search(s, find);
        System.out.println(isPresent);
    }

    public static boolean Search(String s, char find) {
        if (s.length() == 0) {
            return false;
        } else {
            for(int i = 0; i < s.length(); ++i) {
                if (s.charAt(i) == find) {
                    return true;
                }
            }
            return false;
        }
    }
}
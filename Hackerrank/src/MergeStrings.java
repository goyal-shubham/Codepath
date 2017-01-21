/**
 * Created by shubham.goyal on 1/20/17.
 */
public class MergeStrings {

    static String mergeStrings(String a, String b) {

        if(a == null || a.length() == 0) {
            return b;
        }
        if(b == null || b.length() == 0) {
            return a;
        }

        StringBuilder sb = new StringBuilder();
        int i = 0;
        for(i = 0; i < a.length() && i < b.length(); i++) {
            sb.append(a.charAt(i)).append(b.charAt(i));
        }

        if(i != a.length()) {
            sb.append(a.substring(i, a.length()));
        }
        if(i != b.length()) {
            sb.append(b.substring(i, b.length()));
        }

        return sb.toString();

    }
}

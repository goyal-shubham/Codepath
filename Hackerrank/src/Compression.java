/**
 * Created by shubham.goyal on 1/20/17.
 */
public class Compression {

    static String compress(String str) {

        if(str == null || str.length() <= 1) {
            return str;
        }

        char[] data = str.toCharArray();
        char current = data[0];
        int count = 1;

        StringBuilder sb = new StringBuilder();

        for(int i = 1; i < data.length; i++) {
            char c = data[i];
            if(c == current) {
                count++;
            }
            else {
                if(count > 1) {
                    sb.append(current).append(count);
                }
                else{
                    sb.append(current);
                }
                count = 1;
                current = c;
            }
        }

        if(count == 1) {
            sb.append(current);
        }
        else if(count > 1){
            sb.append(current).append(count);
        }

        return sb.toString();
    }


    public static void main(String[] args) {
        System.out.println(compress("aaavaac"));
    }
}

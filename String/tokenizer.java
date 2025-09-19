package string;
import java.util.StringTokenizer;
public class tokenizer {
    public static void main(String[] args) {
        String string = "Kunal Yadav";
        StringTokenizer st = new StringTokenizer(string);
        System.out.println(st.nextToken());
        System.out.println(st.nextToken());
    }
}

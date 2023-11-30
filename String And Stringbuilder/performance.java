import java.util.*;

public class performance {
    public static void main(String[] args) {
        String series = "";
        String series1 = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a'+i);
            System.out.println(ch);
            series1 = series1 + ch;
        }
        System.out.println(series1);
    }
}

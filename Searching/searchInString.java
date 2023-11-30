// import java.util.*;

public class searchInString {
    public static void main(String[] args) {
        
        String name = "Aditya";
        char target = 't';
        System.out.println(search(name, target));

        //System.out.println(Arrays.toString(name.toCharArray()));
    }

    static int search (String str, char target)
    {
        if(str.length() == 0) {
            return -1;
        }

        // for (char ch: str.toCharArray())  {
        //     if (ch == target) {
        //         return true;
        //     }
        // }

        for (int i =0; i < str.length(); i++)
        {
            if (target == str.charAt(i)) {
                return i;
            }
        }
        return -1;
    }
}

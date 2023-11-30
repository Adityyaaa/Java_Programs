import java.util.Scanner;

public class Substring_Comparisions {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        String [] st = new String [s.length()-(k-1)];
        for(int i = 0; i < s.length()-(k-1); i++) {
            String h = "";
            for (int j = i; j < i+k; j++) {
                h+= s.charAt(j);
            }
            st[i] = h;
        }
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        smallest = st[0];
        largest = st[0];
        for(int i = 0; i < s.length()-(k-1); i++) {
            if(st[i].compareTo(smallest)<0)
            smallest = st[i];
            
            if(st[i].compareTo(largest)>0)
            largest = st[i];
        }
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
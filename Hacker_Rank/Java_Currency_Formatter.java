import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Locale locale;
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        Locale india = new Locale("en", "IN");
        Currency currency = Currency.getInstance(locale);
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);
        System.out.println(currency.getDisplayName() + ": " + numberFormat.format(n)); 

    }
}






Scanner scanner = new Scanner(System.in);
        double pay = scanner.nextDouble();
        scanner.close();
   
        String us = NumberFormat.getCurrencyInstance(Locale.US).format(pay);
        Locale IND = new Locale("en","IN");
        String india = NumberFormat.getCurrencyInstance(IND).format(pay);
        String fr = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(pay);
        String ch = NumberFormat.getCurrencyInstance(Locale.CHINA).format(pay);
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + ch);
        System.out.println("France: " + fr); 

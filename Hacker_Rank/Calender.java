import java.util.*;

public class Calender {

    public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter ");
    int day = sc.nextInt();
    int month = sc.nextInt();
    int year = sc.nextInt();
    
    if(month==1 || month==2) {
        year--; month=month+12;
    }
 
     int F=day+2*month+(3*(month+1)/5)+year+(year/4)-(year/100)+(year/400)+2;

     if(F%7== 0) {
     System.out.println("SATURDAY"); }

     if(F%7== 1) {
     System.out.println("SUNDAY"); }

     if(F%7== 2) {
     System.out.println("MONDAY"); }

     if(F%7== 3) {
     System.out.println("TUESDAY"); }

     if(F%7== 4) {
     System.out.println("WEDNESDAY"); }

     if(F%7== 5) {
     System.out.println("THURSDAY"); }

     if(F%7== 6) {
     System.out.println("FRIDAY"); }
    }
}

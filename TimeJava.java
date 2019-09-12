
package timejava;

import java.util.Scanner;

public class TimeJava {

        public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        
        System.out.println("Enter the time in seconds");
        int sec =s.nextInt();
        int restSec = sec% 60;
        int min = sec/60;
        int restMin = min%60;
        int hour = min/60;
        
        
        System.out.println("The time is" + hour + "Hours" + restMin + "Minutes" + restSec + "Seconds");
        
        
        }
    
}

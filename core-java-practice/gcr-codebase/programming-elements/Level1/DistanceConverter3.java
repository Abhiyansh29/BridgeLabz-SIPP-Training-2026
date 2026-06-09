package Level1;

import java.util.Scanner;

public class DistanceConverter3 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int distanceInFeet=sc.nextInt();
        System.out.println("Distance in Feet is "+distanceInFeet+" in yards is "+distanceInFeet/3+" in miles is "+(distanceInFeet/3)/1760);
    }
    
}

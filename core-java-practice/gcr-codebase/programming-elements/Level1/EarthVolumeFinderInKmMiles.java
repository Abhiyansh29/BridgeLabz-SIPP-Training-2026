package Level1;

public class EarthVolumeFinderInKmMiles {
    public static void main(String[] args) {
        int radius=6378; //in km
        double radius2=6378*1.6; //in miles

        System.out.print("The volume of earth in cubic kilometers is "+((4/3)*3.14*radius*radius*radius)+" and cubic miles is "+((4/3)*3.14*radius2*radius2*radius2));
    }
}

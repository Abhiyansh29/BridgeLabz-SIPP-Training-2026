package Level1;

public class UniversityFeesDiscounter {
    public static void main(String[] args) {
        int fee=125000;
        int discountPercent=10;

        double discount=125000*0.1;
        System.out.print("The discount amount is INR "+discount+" and final discounted fee is INR "+(fee-discount));

    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class RavisCoffeeCafe{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
           final double GST_RATE = 0.18;
        
        int c=0;

         while (true) {

            System.out.println("Hey Welcome to Ravi's Cafe!");
            int sum=0;
            int quan=0;
            ArrayList<Integer> in=new ArrayList<Integer>();
            ArrayList<Integer> qn=new ArrayList<>();
            
            while(true){
            System.out.println("\nAvailable Coffees:");
            System.out.println("1. Espresso - ₹120");
            System.out.println("2. Cappuccino - ₹150");
            System.out.println("3. Latte - ₹180");
            System.out.println("4. Mocha - ₹200");
            System.out.print("Enter coffee type number (or type 'exit' to quit): ");

            String input = sc.next();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Thank you for visiting Ravi's Cafe!");
                c++;
                break;
            }

            int choice = Integer.parseInt(input);

            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();

            double price = 0;

            switch (choice) {
                case 1:
                    price = 120;
                in.add(1);
                qn.add(quantity);
                    break;

                case 2:
                    in.add(2);
                    qn.add(quantity);
                    price = 150;
                    break;

                case 3:
                    in.add(3);
                    qn.add(quantity);
                    price = 180;
                    break;

                case 4:
                    price = 200;
                    qn.add(quantity);
                    in.add(4);
                    break;

                default:
                    System.out.println("Invalid Coffee Choice!");
                    c++;
                    continue;
            }
            sum+=price*quantity;
            quan+=quantity;
        }
        

            double totalBill = sum;
            double gst = totalBill * GST_RATE;
            double finalBill = totalBill + gst;

            System.out.println("\n--------- BILL ----------");
            System.out.println();
            System.out.println();
                    System.out.println("Coffee Type       Price     Quantity         Total:");
            System.out.println();
            for(int i=0;i<in.size();i++ ){
                if(in.get(i)==1){
                    System.out.println("Espresso             120     "+qn.get(i)+"         "+qn.get(i)*120);
                }
                else if(in.get(i)==2){
                    System.out.println("Cappuccino           150     "+qn.get(i)+"         "+qn.get(i)*150);
                }
                else if(in.get(i)==3){
                    System.out.println("Latte                180     "+qn.get(i)+"         "+qn.get(i)*180);
                }
                else if(in.get(i)==4){
                    System.out.println("Mocha                200     "+qn.get(i)+"         "+qn.get(i)*200);
                }
            }
            
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("Total Quantity   : " + quan);
            System.out.println("Subtotal         : ₹" + totalBill);
            System.out.println("GST (18%)        : ₹" + gst);
            System.out.println("Final Bill       : ₹" + finalBill);
            System.out.println("----------------");

            if(c>0){
                break;
            }
        }

    }
}
import java.util.*;
public class MayaBMITracker {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    ArrayList<String> client_Name=new ArrayList<>();
    ArrayList<Integer> client_Height=new ArrayList<>();
    ArrayList<Integer> client_Weight=new ArrayList<>();
    while(true){
        System.out.println("Enter Client Details");

        System.out.println();
        System.out.println();
        System.out.println("Enter your name:");
        String name=sc.next();
        client_Name.add(name);
        System.out.println("Enter your Height in cm:");
        int height=sc.nextInt();
        client_Height.add(height);
        System.out.println("Enter your Weight in kg:");
        int Weight=sc.nextInt();
        client_Weight.add(Weight);


        System.out.println();
        System.out.println();
        System.out.println("Is there any other client left \n1.Yes  \n 2.No");
        String input=sc.next();
        if (input.equalsIgnoreCase("No")) {
                
                break;
            }
        

    }
    System.out.println("-----------BMI Fitness Tracker ----------");
    System.out.println();
    System.out.println("Name                Height    Weight     BMI      Category");
    System.out.println();
    for(int i=0;i<client_Name.size();i++){
        float BMI=client_Weight.get(i)/(client_Height.get(i)*client_Height.get(i));
        String s="";
        if(BMI<18.5){
            s="Underweight";
        }
        else if(BMI>=18.5 || BMI<=24.9 ){
            s="Normal";
        }
        else if(BMI>=25 || BMI<=29.9 ){
            s="Overweight";
        }
        else if(BMI>=30 || BMI<=34.9 ){
            s="Obese";
        }
        else{
            s="Exteremely Obese";
        }

            System.out.println(client_Name.get(i)+"          "+client_Height.get(i)+"   "+client_Weight.get(i)+"     "+BMI+"      "+s);
    }
}    
}

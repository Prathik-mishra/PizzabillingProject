import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.print("Welcome to Cyber Pizza hub \n");
        System.out.print("Do you want to Enjoy our Pizza. \nif Yes press 1 or press 0 for No");
        Scanner sc = new Scanner(System.in);
        int Option = sc.nextInt();
        if(Option==0){
            System.out.println("Thank you for visiting  us, Please Come Again");
        }else{
            System.out.println("How many Pizza you want to order");
            int NumberOfPizza = sc.nextInt();
            ArrayList<pizza> ob1 = new ArrayList<>();
            for(int i=0;i<NumberOfPizza;i++){
                int orderNo = i+1;
                if(i>0) System.out.println("Select your Preferences for pizza "+orderNo);
                System.out.println("Which Type of pizza would you like to choose? Press Non-Veg:0 or veg:1 ");
                int isVeg = sc.nextInt();
                Boolean veg = false;
                if(isVeg == 0){
                    veg = true;
                }
                System.out.println("What size would you like to prefer? Press \nSmall:0 \nMedium:1 \nLarge:2" );
                int size = sc.nextInt();

                pizza piz = new pizza(veg,size);
                System.out.println("Do you want to Add ExtraToppings? Press Yes:1 or No:0");
                int extraToppings = sc.nextInt();
                if(extraToppings==1){
                    piz.addExtraToppings();
                }
                System.out.println("Do you want to Add ExtraCheese? Press yes:1 or No:0");
                int extraCheese = sc.nextInt();
                if(extraCheese == 1){
                    piz.addExtraCheese();
                }
                System.out.println("Do you want to Takeaway bag? Press Yes:1 or No:0");
                int bag = sc.nextInt();
                if(bag==1){
                    piz.addTakeAway();
                }
               ob1.add(piz);
            }
            String TotalBill="";
            int Total=0;
            for(int i=0;i<NumberOfPizza;i++){
                pizza localpizza = ob1.get(i);
                TotalBill+=localpizza.getBill();
                Total+=localpizza.getTotal();
            }
            TotalBill+="Grand Total for your order is "+Total+"/-"+"\n";
            System.out.println(TotalBill);
            System.out.println("Your order have been placed successfully \nWe hope you would like the pizza \nThankyou");
        }


    }
}

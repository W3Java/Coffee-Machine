import java.util.*;
public class CoffeeMachine {
    
    public static int water=400;
    public static int milk=540;
    public static int coffeeBean=120;
    public static int money=550;
    public static int disposable_cups=9;
    public static Scanner scan=new Scanner(System.in);
    
    
    public static int checkInt(String data){
        try{
           int ii= Integer.parseInt(data);
            return ii;
        }catch(Exception e){
            return 421;
        }
    }
    
    public static void buyAction(){
        System.out.println();
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String chh=scan.nextLine();
        int aa=checkInt(chh);
        int ch=0;
        if(aa==421){
            //break;
        }else{
            ch=aa;
        
        
        
        if(ch==1){
            if(water>=250){
                if(coffeeBean>=16){
                    if(disposable_cups>=1){
                       water=water-250 ;
                       coffeeBean=coffeeBean-16;
                       money=money+4;
                       disposable_cups=disposable_cups-1;
                       System.out.println("I have enough resources, making you a coffee!");
                       System.out.println();
                       
                    }else{
                         System.out.println("Sorry, not enough disposable cup!");
                         System.out.println();
                    }
                }else{
                    System.out.println("Sorry, not enough coffee beens!");
                    System.out.println();
                }
            }else{
                System.out.println("Sorry, not enough water!");
                System.out.println();
            }
        }else if(ch==2){
            if(water>=350){
                if(milk>=75){
                    if(coffeeBean>=20){
                        if(disposable_cups>=1){
                            water=water-350 ;
                            coffeeBean=coffeeBean-20;
                            money=money+7;
                            milk=milk-75;
                            disposable_cups=disposable_cups-1;
                            System.out.println("I have enough resources, making you a coffee!");
                            System.out.println();
                        }else{
                            System.out.println("Sorry, not enough disposable cups!");
                            System.out.println();
                        }
                    }else{
                        System.out.println("Sorry, not enough coffee beans!");
                        System.out.println();
                    }
                }else{
                    System.out.println("Sorry, not enough milk!");
                    System.out.println();
                }
            }else{
                System.out.println("Sorry, not enough water!");
                System.out.println();
            }
        }else if(ch==3){
            if(water>=200){
                if(milk>=100){
                    if(coffeeBean>=12){
                        if(disposable_cups>=1){
                            water=water-200 ;
                            milk=milk-100;
                            coffeeBean=coffeeBean-12;
                            money=money+6;
                            disposable_cups=disposable_cups-1;
                            System.out.println("I have enough resources, making you a coffee!");
                            System.out.println();
                        }else{
                            System.out.println("Sorry, not enough disposable cups!");
                            System.out.println();
                        }
                    }else{
                        System.out.println("Sorry, not enough coffee beans!");
                        System.out.println();
                    }
                }else{
                    System.out.println("Sorry, not enough milk!");
                    System.out.println();
                }
            }else{
                System.out.println("Sorry, not enough water!");
                System.out.println();
            }
        }
       
        }
        
    }
    public static void fillAction(){
        System.out.println();
        
        System.out.println("Write how many ml of water do you want to add: ");
        int i=scan.nextInt();
        water=water+i;
        System.out.println("Write how many ml of milk do you want to add: ");
        int j=scan.nextInt();
        milk=milk+j;
        System.out.println("Write how many grams of coffee beans do you want to add: ");
        int k=scan.nextInt();
        coffeeBean=coffeeBean+k;
        System.out.println("Write how many disposable cups of coffee do you want to add: ");
        int l=scan.nextInt();
        disposable_cups=disposable_cups+l;
        System.out.println();
       

    }
    public static void takeAction(){
        System.out.println();
        System.out.println("I gave you $"+money);
        money=0;
        System.out.println();
      
        
    }
    public static void display(){
        System.out.println();
        System.out.println("The coffee machine has: ");
        System.out.println(water+" of water");
        System.out.println(milk+" of milk");
        System.out.println(coffeeBean+" of coffee beans");
        System.out.println(disposable_cups+" of disposable cups");
        System.out.println("$"+money+" of money");
        System.out.println();
    }
    
    
    public static void main(String[] args) {
        System.out.println("Starting to make a coffee\nGrinding coffee beans\nBoiling water\nMixing boiled water with crushed coffee beans\nPouring coffee into the cup\nPouring some milk into the cup\nCoffee is ready!");        
     
     while(true){
         
        System.out.println("Write action (buy, fill, take, remaining, exit): ");
        String action=scan.nextLine();
      
        if(action.equals("buy")){
            buyAction();
        }else if(action.equals("fill")){
            fillAction();
        }else if(action.equals("take")){
            takeAction();
        }else if(action.equals("remaining")){
            display();
        }else if(action.equals("exit")){
            System.exit(0);
        }
     
     } 
         
    }
    
}

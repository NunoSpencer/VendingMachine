import java.util.*;
//import java.math.RoundingMode;    no need to round
//import java.text.DecimalFormat;
//import java.util.Formatter;

public class VendingMachine 
{
    static Scanner scan = new Scanner(System.in);
    static ArrayList<Product> stock = new ArrayList<Product>();
    //static final Formatter decimalFormater = new Formatter();  //decimal formatting object from Java package java.text.DecimalFormat
    static double currentSelectedPrice = 0.0;                  //formatted to 2 decimal places
    static double usercashBalance = 0.00;


    public static void main(String[] args) throws Exception 
    {
        selectProductMessage();
        addproductStock(); //HELPER FUNCTION
        currentproductStock();
        selection();
        cashInput();
        //dispensing();
    }

    public static void selectProductMessage()
    {
        System.out.println("Welcome to Vending Machine!");
        System.out.println("Available balance = " + usercashBalance);
        System.out.println("");
        System.out.println("Available Items:");
    }

    public static void addproductStock()     //adds products vending machine
    {
        stock.add(new Product("Doritos","FD1", 2.19));
        stock.add(new Product("Lays Chips","FL1", 2.39));
        stock.add(new Product("Edamame","FE1", 2.99));
        stock.add(new Product("Turkey Sandwich","FS1", 3.49));
        stock.add(new Product("Ham Sandwich","FS2", 3.49));
        stock.add(new Product("Gum","FG1", 0.99));
        stock.add(new Product("Mints","FM1", 0.49));
        stock.add(new Product("Ruffles Chips","FR1", 2.39));
        stock.add(new Product("Coke Soda 25ml","BC1", 1.29));
        stock.add(new Product("Pespsi Soda 25ml","BP1", 1.39));
        stock.add(new Product("Fanta Soda 25ml","BF1", 1.29));
        stock.add(new Product("GingerAle Soda 25ml","BG1", 1.19));
        stock.add(new Product("Spring Water Bottle 50ml","BSW1", 1.69));
        System.out.println("");
    }

    public static void currentproductStock()     //print current stock of products on the vending machine.. but first checks for duplicate IDs
    {
    
        for(int i=0; i<stock.size(); i++)
        {
            System.out.println(stock.get(i).toString());                    //print current stock
        }
        System.out.println("");

    }

    public static void selection()
    {
        System.out.println("SELECT PRODUCT using ID");
        String IDselection = scan.nextLine();

        for(int i=0; i<stock.size(); i++)
        {
            if(stock.get(i).getproductID().equals(IDselection))
            {
                currentSelectedPrice = stock.get(i).getproductPrice();
                System.out.println("You've selected: " + stock.get(i).toString());
                System.out.println("Please pay $" + stock.get(i).getproductPrice() + " using coins or bills. When done type DONE"); //user enters coins (oneCent, fiveCent, etc) or bills ($1, $5, $10, $20)
            }
            // else
            // {
            //     System.out.println("Enter valid product ID!"); //user enters coins (oneCent, fiveCent, etc) or bills ($1, $5, $10, $20)
            // }
        }
    }

    public static void cashInput()          //needs formatting output of price and balance result of their operations
    {
        while(true)
        {
            String cashInput = scan.nextLine();

            if(cashInput.equals("oneCent"))
            {
                usercashBalance += 0.01;
                System.out.println("Current balance: " + usercashBalance);
                if(usercashBalance < currentSelectedPrice)                          //if cashInput is LESS than product price
                {
                    System.out.println("Remaing: $" + (currentSelectedPrice - usercashBalance));
                    continue;
                }else if(usercashBalance >= currentSelectedPrice)                   //if cashInput is EXACT or GREATER amount of product price. Dispence CHANGE
                {
                    System.out.println("Dispensing...");
                    System.out.println("Your change: $" + (usercashBalance - currentSelectedPrice));
                }
            }
            else if(cashInput.equals("fiveCent"))
            {
                usercashBalance += 0.05;
                System.out.println("Current balance: " + usercashBalance);
                if(usercashBalance < currentSelectedPrice)
                {
                    System.out.println("Remaing: $" + (currentSelectedPrice - usercashBalance));
                    continue;
                }else if(usercashBalance >=  currentSelectedPrice)
                {
                    System.out.println("THANK YOU! => Dispensing =>");
                    System.out.println("Your change: $" + (usercashBalance - currentSelectedPrice));
                }
            }
            else if(cashInput.equals("tenCent"))
            {
                usercashBalance += 0.10;
                System.out.println("Current balance: " + usercashBalance);
                if(usercashBalance < currentSelectedPrice)
                {
                    System.out.println("Remaing: $" + (currentSelectedPrice - usercashBalance));
                    continue;
                }else if(usercashBalance >=  currentSelectedPrice)
                {
                    System.out.println("Dispensing...");
                    System.out.println("Your change: $" + (usercashBalance - currentSelectedPrice));
                }
            }
            else if(cashInput.equals("quarter"))
            {
                usercashBalance += 0.25;
                System.out.println("Current balance: " + usercashBalance);
                if(usercashBalance < currentSelectedPrice)
                {
                    System.out.println("Remaing: $" + (currentSelectedPrice - usercashBalance));
                    continue;
                }else if(usercashBalance >=  currentSelectedPrice)
                {
                    System.out.println("Dispensing...");
                    System.out.println("Your change: $" + (usercashBalance - currentSelectedPrice));
                }
            }
            else if(cashInput.equals("$1"))
            {
                usercashBalance += 1.0;
                System.out.println("Current balance: " + usercashBalance);
                if(usercashBalance < currentSelectedPrice)
                {
                    System.out.println("Remaing: $" + (currentSelectedPrice - usercashBalance));
                    continue;
                }else if(usercashBalance >=  currentSelectedPrice)
                {
                    System.out.println("Dispensing...");
                    System.out.println("Your change: $" + (usercashBalance - currentSelectedPrice));
                }
            }
            else if(cashInput.equals("$5"))
            {
                usercashBalance += 5.0;
                System.out.println("Current balance: " + usercashBalance);
                if(usercashBalance < currentSelectedPrice)
                {
                    System.out.println("Remaing: $" + (currentSelectedPrice - usercashBalance));
                    continue;
                }else if(usercashBalance >=  currentSelectedPrice)
                {
                    System.out.println("Dispensing...");
                    System.out.println("Your change: $" + (usercashBalance - currentSelectedPrice));
                }
            }
            else if(cashInput.equals("$10"))
            {
                usercashBalance += 10.0;
                System.out.println("Current balance: " + usercashBalance);
                if(usercashBalance < currentSelectedPrice)
                {
                    System.out.println("Remaing: $" + (currentSelectedPrice - usercashBalance));
                    continue;
                }else if(usercashBalance >=  currentSelectedPrice)
                {
                    System.out.println("Dispensing...");
                    System.out.println("Your change: $" + (usercashBalance - currentSelectedPrice));
                }
            }
            else if(cashInput.equals("$20"))
            {
                usercashBalance += 20.0;
                System.out.println("Current balance: " + usercashBalance);
                if(usercashBalance < currentSelectedPrice)
                {
                    System.out.println("Remaing: $" + (currentSelectedPrice - usercashBalance));
                    continue;
                }else if(usercashBalance >=  currentSelectedPrice)
                {
                    System.out.println("Dispensing...");
                    System.out.println("Your change: $" + (usercashBalance - currentSelectedPrice));
                }
            }
            else if(cashInput.equals("DONE"))
            {
                break;
            }
            break; 
        }
    }
}


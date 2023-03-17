import java.util.ArrayList;  
import java.util.List;  
import java.util.Scanner;  
class Product   
    {  
         
        private String id;  
        private String pname;  
        private int qty;  
        private double price;  
        private double totalPrice;  
           
         
        Product(String id, String pname, int qty, double price, double totalPrice)   
        {  
            this.id=id;  
            this.pname = pname;  
            this.qty = qty;  
            this.price = price;  
            this.totalPrice = totalPrice;  
        }  
             
            public String getId()   
                {  
                    return id;  
                }  
                public String getPname()   
                {  
                    return pname;  
                }  
                public int getQty()   
                {  
                    return qty;  
                }  
                public double getPrice()   
                {  
                    return price;  
                }  
                public double getTotalPrice()   
                {  
                    return totalPrice;  
                }  
                //displayFormat  
                public static void displayFormat()   
                {  
                    System.out.print("\nProduct ID \t\tName\t\tQuantity\tRate \tTotal Price\n");  
                }  
                   
                // display  
                public void display()   
                {  
                    System.out.format("   %-9s             %-9s      %5d               %9.2f                       %14.2f\n" ,id, pname, qty, price, totalPrice);  
                }  
    }  
public class shoppingBill   
    {  
        /**
         * @param args
         */
        public static void main(String args[])   
            {  
                // variables  
                String id = null;  
                String productName = null;  
                int quantity = 0;  
                double price = 0.0;  
                double totalPrice = 0.0;
                double overallPrice = 0.0;  
                char choice = '\0';  
                Scanner scan = new Scanner(System.in);  
                System.out.print("Enter Customer Name: ");  
                String customername=scan.nextLine();  
                 
                List<Product> product = new ArrayList<Product>();  
                do   
                    {  
                        
                        System.out.println("Enter the product details: ");  
                        System.out.print("Product ID: ");  
                        id = scan.nextLine();  
                        System.out.print("Product Name: ");  
                        productName = scan.nextLine();  
                        System.out.print("Quantity: ");  
                        quantity = scan.nextInt();  
                        System.out.print("Price (per unit): ");  
                        price = scan.nextDouble();  
                        
                        totalPrice = price * quantity; 
                                                  
                        overallPrice = overallPrice + totalPrice;  
                       
                        product.add( new Product(id, productName, quantity, price, totalPrice) );  
                         
                        System.out.print("Do you want to add more items? (y or n): ");  
                         
                        choice = scan.next().charAt(0);  
                          
                        scan.nextLine();  
                    }   
                while (choice == 'y' || choice == 'Y');  
              
                Product.displayFormat();  
                for (Product p : product)   
                {  
                    p.display();  
                }  
            
                System.out.println("\n\t\t\t\t\t\t\t\t\t\tTotal Amount (Rs.) " +overallPrice);  
               
                System.out.println("\n\t\t\t\t\t\t\t\t\t\t     Invoice Total " +overallPrice);  
               
                scan.close();  
            }     
    }  
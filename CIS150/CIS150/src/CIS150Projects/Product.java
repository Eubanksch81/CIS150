package CIS150Projects;
import java.util.Scanner; //Could use Scanner to change values according to user input

public class Product {
   // TODO: Build Product class with private fields and methods listed above
   String codeName = "";
   double codePrice = 0.0;
   int codeCount = 0;
   
   public Product(String code, double price, int count){
      codeName = code;
      codePrice = price;
      codeCount = count;
   }
   
   public void setCode(String nameOfProduct){
      codeName = nameOfProduct;
   }
   
   public String getCode(){
      return codeName;
   }
   
   public void setPrice(double priceOfProduct){
      codePrice = priceOfProduct;
   }
   
   public double getPrice(){
      return codePrice;
   }
   
   public void setCount(int numberOfProduct){
      codeCount = numberOfProduct;
   }
   
   public int getCount(){
      return codeCount;
   }
   
   public void addInventory(int amountOfProduct){
      codeCount = codeCount + amountOfProduct;
   }
   
   public void sellInventory(int amountOfProduct){
      codeCount = codeCount - amountOfProduct;
   }
   
   // main
   public static void main(String args[]) {
      String name = "Apple";
      double price = 0.40;
      int num = 3;
      Product prod = new Product(name, price, num);

      // Test 1 - Are instance variables set/returned properly?
      System.out.println("Name: " + prod.getCode()); 
      System.out.printf("Price: %.2f\n", prod.getPrice()); 
      System.out.println("Count: " + prod.getCount());
      System.out.println();

      // Test 2 - Are instance variables set/returned properly after adding and selling?
      num = 10;
      prod.addInventory(num);
      num = 5;
      prod.sellInventory(num);
      System.out.println("Name: " + prod.getCode()); 
      System.out.printf("Price: %.2f\n", prod.getPrice());
      System.out.println("Count: " + prod.getCount());
      System.out.println();
      
      // Test 3 - Do setters work properly?
      name = "Golden Delicious";
      prod.setCode(name);
	   price = 0.55;
      prod.setPrice(price);
      num = 4;
      prod.setCount(num);
      System.out.println("Name: " + prod.getCode()); 
      System.out.printf("Price: %.2f\n", prod.getPrice()); 
      System.out.println("Count: " + prod.getCount()); 
      
   }
}
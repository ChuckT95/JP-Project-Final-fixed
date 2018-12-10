package src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

public abstract class Product implements Item, Comparator {

  public static ArrayList<Product> products = new ArrayList();

  private static int currentProductionNumber = 1;
  final String manufacturer = "OracleProduction";
  int productionNumber;
  int serialNumber;
  String productName;
  public final Comparator<Product> productNameComparator =
      (a1, b2) -> a1.productName.compareTo(b2.productName);
  //here, I have created a value for the date
  Date manufacturedOn;

  //the constructor is declared in "Watchamacallit",
  //which is a full class that can be used to make objects,
  //and extends this abstract class
  public Product(String name) {   //note that CheckStyle says there are no comments here
    //the constructor is declared in "Watchamacallit",
    //which is a full class that can be used to make objects,
    //and extends this abstract class
    productName = name;
    serialNumber = currentProductionNumber++;
    this.manufacturedOn = new Date();
    products.add(this);
    sortProducts(products);
  }

  //Generic constructor
  public Product() { //Generic constructor
    //Generic constructor
    productName = "Generic";
    serialNumber = currentProductionNumber++;
    this.manufacturedOn = new Date();
    products.add(this);
    sortProducts(products);
  }

  //tester for Product collections
  public static void print() {  //tester for Product collections
    //tester for Product collections
    for (Product product1 : products) {
      System.out.println(product1.toString());
    }
  }

  //attempt to print Product collections based on type
  public static void printType(Product type) {//attempt to print Product collections based on type
    //attempt to print Product collections based on type

    for (Product product1 : products) {
      if (product1.getClass() == type.getClass()) {
        System.out.println(product1.toString());
      }
    }


  }

  //allows the user to visit the date
  public Date getManufactureDate() {
    return manufacturedOn;
  }

  // allows the production number to be changed
  public void setProductionNumber(int productionNumber) {
    this.productionNumber = productionNumber;
  }

  public String getName() {
    return productName;
  }

  //a get and set for the name
  public void setName(String name) {
    this.productName = name;
  }

  //a get for the serial number, which is set when the object is made
  public int getSerialNumber() {
    return serialNumber;
  }

  //the override for the toString() method
  public String toString() {
    return "Manufacturer : " + manufacturer + "\n"
        + "Serial Number : " + serialNumber + "\n"
        + "Manufactured on :  " + manufacturedOn + "\n"
        + "Product Name :  " + productName + "\n";
  }

  //required for importing collections
  public int compare(Object o1, Object o2) {
    Product a1 = (Product) o1;
    Product b2 = (Product) o2;
    int result = a1.productName.compareTo(b2.productName);
    return result;
  }

  static void sortProducts(ArrayList<Product> products) {
    Collections.sort(products, new Comparator<Product>() {
      public int compare(Product a1, Product b2) {
        int result =  a1.productName.compareTo(b2.productName);
        return result;
      }
    });
  }
}
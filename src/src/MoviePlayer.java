package src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MoviePlayer extends Product implements MultimediaControl {

  Screen screenType;
  MonitorType monitorType;

  //Constructor for MoviePlayer
  public MoviePlayer(String name, Screen screenType, MonitorType monitorType) {
    super(name);
    this.monitorType = monitorType;
    this.screenType = screenType;
  }

  //unused default movieplayer constructor
  public MoviePlayer() {
    super();
    this.screenType = new Screen();
    this.monitorType = null;
  }

  @Override
  public void play() {
    System.out.println("Playing movie");
  }

  @Override
  public void stop() {
    System.out.println("Stopped movie");
  }

  @Override
  public void previous() {
    System.out.println("Previous movie");
  }

  @Override
  public void next() {
    System.out.println("Next Movie");
  }

  @Override
  public String toString() {
    return super.toString() + screenType.toString()
        + "Monitor Type : " + monitorType + "\n";
  }

  //required for importing collections
  public int compare(Object o1, Object o2) { //required for importing collections
    //required for importing collections
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

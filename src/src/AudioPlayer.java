package src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class AudioPlayer extends Product implements MultimediaControl {

  public final Comparator<Product> productNameComparator =
      (a1, b2) -> a1.productName.compareTo(b2.productName);
  String audioSpecification;
  ItemType mediaType;

  //constructor for AudioPlayer
  public AudioPlayer(String name, String audioSpecification, ItemType mediaType) {
    //constructor for AudioPlayer
    super(name);
    this.audioSpecification = audioSpecification;
    this.mediaType = mediaType;

  }

  //constructor for AudioPlayer
  public AudioPlayer(String name, String audioSpecification) {
    //constructor for AudioPlayer
    super(name);
    this.audioSpecification = audioSpecification;
    this.mediaType = ItemType.AUDIO;
  }

  public AudioPlayer() {
    super();
    this.audioSpecification = "Generic";
  }

  public void play() {
    System.out.println("Playing");
  }

  public void stop() {
    System.out.println("Stopped");
  }

  public void previous() {
    System.out.println("Previous");
  }

  public void next() {
    System.out.println("Next");
  }

  @Override
  public String toString() {

    return super.toString()
        + "Audio Spec : " + audioSpecification + "\n"
        + "Type : " + mediaType + "\n";
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

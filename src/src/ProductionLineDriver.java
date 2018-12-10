package src;

public class ProductionLineDriver {

  public static void main(String args[]) {
    // this is a tester for MoviePlayer, AudioPlayer, and EmployeeCode
    MoviePlayerDriver.testMoviePlayer();
    PlayerDriver.testPlayer();
    Product.print();
    EmployeeInfo employee = new EmployeeInfo();
    System.out.println(employee.getCode());
  }
}

package src;

import java.util.Date;

public interface Item {
  // the initial interface with a list of promises to create certain methods, and a final string
  final String Manufacturor = "OracleProduction";

  void setProductionNumber(int productionNumber);

  String getName();

  void setName(String name);

  Date getManufactureDate();

  int getSerialNumber();

}

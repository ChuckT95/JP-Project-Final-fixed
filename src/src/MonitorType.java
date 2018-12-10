package src;

public enum MonitorType {
  LCD("LCD"),
  LED("LED");

  String typeName;

  MonitorType(String name) {
    this.typeName = name;
  }
}
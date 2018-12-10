package src;

public enum ItemType {

  //ItemType AUDIO = new ItemType("AU");

  AUDIO("AU"),
  VISUAL("VI"),
  AAUDIOMOBILE("AM"),
  VISUALMOBILE("VM");
  String typeName;

  ItemType(String name) {
    this.typeName = name;
  }
}
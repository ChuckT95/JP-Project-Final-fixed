package src;

public class Screen implements ScreenSpec {

  String resolution;
  int refreshRate;
  int responseTime;

  // this
  public Screen(String resolution, int refreshRate, int responseTime) {
    this.resolution = resolution;
    this.refreshRate = refreshRate;
    this.responseTime = responseTime;
  }

  public Screen() {
    this.resolution = "Generic";
    this.refreshRate = 0;
    this.responseTime = 0;
  }

  @Override
  public String getResolution() {
    return resolution;
  }

  public int getRefreshRate() {
    return refreshRate;
  }

  public int getResponseTime() {
    return responseTime;
  }

  @Override
  public String toString() {
    return
        "Resolution : " + resolution + "\n"
            + "RefreshRate : " + refreshRate + "\n"
            + "ResponseTime : " + responseTime + "\n";
  }
}

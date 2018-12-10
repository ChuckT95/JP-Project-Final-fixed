package src;

public class PlayerDriver {
  //Driver made for MoviePlayer and AudioPlayer
  public static void main(String args[]) {
    MoviePlayerDriver.testMoviePlayer();
    testPlayer();
  }

  static void testPlayer() {
    AudioPlayer audioPlayer2 = new AudioPlayer("Sony", "Name2", ItemType.AUDIO);
    System.out.println(audioPlayer2.toString());
    audioPlayer2.play();
    audioPlayer2.stop();
    audioPlayer2.previous();
    audioPlayer2.next();
    MoviePlayer moviePlayer2 = new MoviePlayer("Apple", new Screen(), MonitorType.LED);
    System.out.println(moviePlayer2.toString());
    moviePlayer2.play();
    moviePlayer2.stop();
    moviePlayer2.previous();
    moviePlayer2.next();
  }
}
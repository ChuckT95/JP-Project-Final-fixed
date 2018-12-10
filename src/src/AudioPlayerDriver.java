package src;

public class AudioPlayerDriver {

  void testAudioPlayer() {
    AudioPlayer audioPlayer2 = new AudioPlayer("Name1", "Name2", ItemType.AUDIO);
    System.out.println(audioPlayer2.toString());
    audioPlayer2.play();
    audioPlayer2.stop();
    audioPlayer2.previous();
    audioPlayer2.next();
  }
}

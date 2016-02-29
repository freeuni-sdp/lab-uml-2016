package ge.edu.freeuni.patterns.state;

public class TestVideoPlayer {
	public static void main(String[] arg) {
		VideoPlayerContext videoPlayer = new VideoPlayerContext();

		videoPlayer.play();
		System.out.println(videoPlayer.getCurrentMode());

		videoPlayer.stop();
		System.out.println(videoPlayer.getCurrentMode());

		videoPlayer.play();
		System.out.println(videoPlayer.getCurrentMode());

		videoPlayer.stop();
		System.out.println(videoPlayer.getCurrentMode());

		videoPlayer.play();
		System.out.println(videoPlayer.getCurrentMode());

		videoPlayer.stop();
		System.out.println(videoPlayer.getCurrentMode());

		videoPlayer.stop();
		System.out.println(videoPlayer.getCurrentMode());

		videoPlayer.play();
		System.out.println(videoPlayer.getCurrentMode());
	}
}

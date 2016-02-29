package ge.edu.freeuni.patterns.state;

public class VideoPlayerPlayingState implements VideoPlayerState {
	@Override
	public void play(VideoPlayerContext context) {
		context.changeState(this);
	}

	@Override
	public void stop(VideoPlayerContext context) {
		context.changeState(new VideoPlayerStoppedState());
	}

	@Override
	public VideoPlayerMode getMode() {
		return VideoPlayerMode.PLAYING;
	}
}
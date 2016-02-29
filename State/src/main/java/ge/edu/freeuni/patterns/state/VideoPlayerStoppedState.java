package ge.edu.freeuni.patterns.state;

public class VideoPlayerStoppedState implements VideoPlayerState {
	@Override
	public void play(VideoPlayerContext context) {
		context.changeState(new VideoPlayerPlayingState());
	}

	@Override
	public void stop(VideoPlayerContext context) {
		context.changeState(this);
	}

	@Override
	public VideoPlayerMode getMode() {
		return VideoPlayerMode.STOPPED;
	}
}
package ge.edu.freeuni.patterns.state;

public class VideoPlayerContext {
	private VideoPlayerState internalState;

	public VideoPlayerContext() {
		this.internalState = new VideoPlayerStoppedState();
	}

	public void play() {
		internalState.play(this);
	}

	public void stop() {
		internalState.stop(this);
	}

	public VideoPlayerMode getCurrentMode() {
		return internalState.getMode();
	}

	void changeState(VideoPlayerState state) {
		this.internalState = state;
	}
}
package ge.edu.freeuni.patterns.state;

public interface VideoPlayerState {
	void play(VideoPlayerContext context);
	void stop(VideoPlayerContext context);
	VideoPlayerMode getMode();
}
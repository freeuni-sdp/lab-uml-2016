package ge.edu.freeuni.patterns.strategy;

import java.io.File;
import java.net.URI;
import java.util.List;

public class FTPFileTransmissionStrategy
		extends AbstractFileTransmissionStrategy {

	public FTPFileTransmissionStrategy(URI destination) {
		super(destination);
	}

	public void transmit(List<File> files) {
		log(files);
	}
}

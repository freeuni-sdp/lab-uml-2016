package ge.edu.freeuni.patterns.strategy;

import java.io.File;
import java.net.URI;
import java.util.List;

public class HDDFileTransmissionStrategy
		extends AbstractFileTransmissionStrategy {

	public HDDFileTransmissionStrategy(URI destination) {
		super(destination);
	}

	
	public void transmit(List<File> files) {
		log(files);
	}
}

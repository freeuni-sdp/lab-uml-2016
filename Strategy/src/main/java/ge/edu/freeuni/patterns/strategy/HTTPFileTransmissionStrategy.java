package ge.edu.freeuni.patterns.strategy;

import java.io.File;
import java.net.URI;
import java.util.List;

public class HTTPFileTransmissionStrategy
		extends AbstractFileTransmissionStrategy{

	public HTTPFileTransmissionStrategy(URI destination) {
		super(destination);
	}

	
	public void transmit(List<File> files) {
		log(files);
	}
}

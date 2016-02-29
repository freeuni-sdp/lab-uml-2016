package ge.edu.freeuni.patterns.strategy;

import java.io.File;
import java.util.List;

public class FileTransmissionContext {
	private FileTransmissionStrategy fileTransmissionStrategy;

	public FileTransmissionContext(FileTransmissionStrategy fileTransmissionStrategy) {
		this.fileTransmissionStrategy = fileTransmissionStrategy;
	}

	public void transmit(List<File> files) {
		fileTransmissionStrategy.transmit(files);
	}
}

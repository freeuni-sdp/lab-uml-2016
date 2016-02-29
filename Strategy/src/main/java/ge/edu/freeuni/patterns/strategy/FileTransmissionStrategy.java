package ge.edu.freeuni.patterns.strategy;

import java.io.File;
import java.util.List;

public interface FileTransmissionStrategy {
	void transmit(List<File> files);
}

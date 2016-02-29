package ge.edu.freeuni.patterns.strategy;

import java.io.File;
import java.net.URI;
import java.util.List;

public abstract class AbstractFileTransmissionStrategy
		implements FileTransmissionStrategy {

	protected URI destination;

	AbstractFileTransmissionStrategy(URI destination) {
		this.destination = destination;
	}

	void log(List<File> files) {
		System.out.println(String.format("Transmitting files to[%s]: ", destination));

		for (File file : files) {
			System.out.println("\t" + file.getName());
		}

		System.out.println();
	}
}

package ge.edu.freeuni.patterns.strategy;

import java.io.File;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

public class TestFileTransmissionStrategy {
	@SuppressWarnings("serial")
	public static void main(String[] args) {
		List<File> files = new ArrayList<File>() {{
			add(new File("/path/to/file1.txt"));
			add(new File("/path/to/file2.txt"));
			add(new File("/path/to/file3.txt"));
		}};

		// HDD File Transmission Strategy
		URI hddDestination = URI.create("file:///path/to/local/drive");
		FileTransmissionStrategy hddFileTransmissionStrategy = new HDDFileTransmissionStrategy(hddDestination);
		FileTransmissionContext hddFileTransmissionContext = new FileTransmissionContext(hddFileTransmissionStrategy);

		hddFileTransmissionContext.transmit(files);

		// FTP File Transmission Strategy
		URI ftpDestination = URI.create("ftp://127.0.0.1/path/to/ftp/drive");
		FileTransmissionStrategy ftpFileTransmissionStrategy = new FTPFileTransmissionStrategy(ftpDestination);
		FileTransmissionContext ftpFileTransmissionContext = new FileTransmissionContext(ftpFileTransmissionStrategy);

		ftpFileTransmissionContext.transmit(files);

		// HTTP File Transmission Strategy
		URI httpDestination = URI.create("http://domain.org/path/");
		FileTransmissionStrategy httpFileTransmissionStrategy = new HTTPFileTransmissionStrategy(httpDestination);
		FileTransmissionContext httpFileTransmissionContext = new FileTransmissionContext(httpFileTransmissionStrategy);

		httpFileTransmissionContext.transmit(files);
	}
}

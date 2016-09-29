package greenbean.configuration;

import java.util.List;

public class ReadWriter {

	private Source source;

	private List<Destination> destinations;

	public ReadWriter(Source source, List<Destination> destinations) {
		this.source = source;
		this.destinations = destinations;
	}
}

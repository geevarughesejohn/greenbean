package greenbean;

import java.util.List;

public class DataBaseInputReader implements InputReader {

	public DataBaseInputReader(
			DataBaseInputReaderConfiguration baseInputReaderConfiguration) {
	}

	@Override
	public boolean isCompleted() {
		return false;
	}

	@Override
	public List<Row> read() {
		return null;
	}

}

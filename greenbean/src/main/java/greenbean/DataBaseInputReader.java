package greenbean;

import java.util.List;

public class DataBaseInputReader implements InputReader {

	public DataBaseInputReader(
			DataBaseRWConfiguration baseInputReaderConfiguration) {
	}

	@Override
	public boolean isCompleted() {
		return false;
	}

	@Override
	public List<Data> read() {
		return null;
	}

}

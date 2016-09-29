package greenbean.configuration;

import greenbean.InputReader;
import greenbean.OutputWriter;

import java.util.List;

public interface RWRegister {

	Source getSource();

	InputReader getReader();

	List<Destination> getdDestinations();

	OutputWriter getOutputWriter();

}

package greenbean;

import java.util.List;

public interface Processor {

	List<Data> process(List<Data> rows);

}

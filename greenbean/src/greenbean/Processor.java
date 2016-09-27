package greenbean;

import java.util.List;

public interface Processor {

	List<Row> process(List<Row> rows);

}

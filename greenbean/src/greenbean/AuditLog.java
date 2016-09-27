package greenbean;

import java.util.List;

public interface AuditLog {

	void log(List<Row> rows);

}

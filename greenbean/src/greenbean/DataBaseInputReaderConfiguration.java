package greenbean;

import java.util.List;
import java.util.SortedSet;

public class DataBaseInputReaderConfiguration {

	private String dataSourceName;

	private SortedSet<Table> table;
	
	

}

class Table implements Comparable<Table> {

	private int exeOrder;

	private String tableName;

	private List<String> columnName;

	private String sqlWhereCondtion;

	public int getExeOrder() {
		return exeOrder;
	}

	@Override
	public int compareTo(Table o) {
		return this.getExeOrder() - o.getExeOrder();
	}
}

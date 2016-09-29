package greenbean;

import java.util.List;

public class DataBaseRWConfiguration {

	private DataConfig reader;

	private DataConfig writer;

	public DataConfig getReader() {
		return reader;
	}

	public void setReader(DataConfig reader) {
		this.reader = reader;
	}

	public DataConfig getWriter() {
		return writer;
	}

	public void setWriter(DataConfig writer) {
		this.writer = writer;
	}

	public void validate() throws InvalidDataBaseRWConfiguration {
		reader.validate();
		writer.validate();

		if (writer.getTable().getColumnName().size() != 0) {
			throw new InvalidDataBaseRWConfiguration(
					"Do not configure column names in writer");
		}

	}
}

class DataConfig {

	private String dataSourceName;

	private Table table;

	public String getDataSourceName() {
		return dataSourceName;
	}

	public void setDataSourceName(String dataSourceName) {

		this.dataSourceName = dataSourceName;
	}

	public Table getTable() {
		return table;
	}

	public void setTable(Table table) {
		this.table = table;
	}

	public void validate() throws InvalidDataBaseRWConfiguration {
		if (this.dataSourceName == null || this.dataSourceName.trim() == "") {
			throw new InvalidDataBaseRWConfiguration(
					"Datasource name shouldnot be empty");
		}
		this.dataSourceName = this.dataSourceName.trim();
		if (table == null) {
			throw new InvalidDataBaseRWConfiguration(
					"Should configure the table");
		}
	}
}

class Table implements Comparable<Table> {

	private int exeOrder;

	private String tableName;

	private List<String> columnName;

	private String sqlWhereCondtion;

	public int getExeOrder() {
		return exeOrder;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public List<String> getColumnName() {
		return columnName;
	}

	public void setColumnName(List<String> columnName) {
		this.columnName = columnName;
	}

	public String getSqlWhereCondtion() {
		return sqlWhereCondtion;
	}

	public void setSqlWhereCondtion(String sqlWhereCondtion) {
		this.sqlWhereCondtion = sqlWhereCondtion;
	}

	public void setExeOrder(int exeOrder) {
		this.exeOrder = exeOrder;
	}

	public void validate() {
		// TODO Auto-generated method stub

	}

	@Override
	public int compareTo(Table o) {
		return this.getExeOrder() - o.getExeOrder();
	}
}

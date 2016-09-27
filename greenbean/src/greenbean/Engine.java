package greenbean;

import java.util.List;

public class Engine {

	private InputReader inputReader;

	private OutputWriter outputWriter;

	private List<Processor> processors;
	
	private AuditLog auditLog;

	public void execute() {

		while (inputReader.isCompleted()) {
			List<Row> rows = inputReader.read();
			for (Processor processor : processors) {
				rows = processor.process(rows);
			}
			outputWriter.write(rows);
			auditLog.log(rows);
		}

	}
	
	public static void main(String[] args) {
		
		
		
	}
}

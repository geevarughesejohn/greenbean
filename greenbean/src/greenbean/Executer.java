package greenbean;

import java.util.List;

public class Executer {

	private InputReader inputReader;

	private OutputWriter outputWriter;

	private List<Processor> processors;

	private AuditLog auditLog;

	public Executer(ExecuterConfiguration configuration) {
		this.inputReader = configuration.getInputReader();
		this.outputWriter = configuration.getOutputWriter();
		this.processors = configuration.getProcessors();
		this.auditLog = configuration.getAuditLog();
	}

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

	
}

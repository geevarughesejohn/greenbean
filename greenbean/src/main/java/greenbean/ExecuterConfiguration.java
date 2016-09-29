package greenbean;

import java.util.List;

public class ExecuterConfiguration {

	private String executerKey;

	private InputReader inputReader;

	private OutputWriter outputWriter;

	private List<Processor> processors;

	private AuditLog auditLog;

	public String getExecuterKey() {
		return executerKey;
	}

	public void setExecuterKey(String executerKey) {
		this.executerKey = executerKey;
	}

	public InputReader getInputReader() {
		return inputReader;
	}

	public void setInputReader(InputReader inputReader) {
		this.inputReader = inputReader;
	}

	public OutputWriter getOutputWriter() {
		return outputWriter;
	}

	public void setOutputWriter(OutputWriter outputWriter) {
		this.outputWriter = outputWriter;
	}

	public List<Processor> getProcessors() {
		return processors;
	}

	public void setProcessors(List<Processor> processors) {
		this.processors = processors;
	}

	public AuditLog getAuditLog() {
		return auditLog;
	}

	public void setAuditLog(AuditLog auditLog) {
		this.auditLog = auditLog;
	}

}

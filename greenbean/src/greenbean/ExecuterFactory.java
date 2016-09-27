package greenbean;

public class ExecuterFactory {

	public Executer createExecuter(ExecuterConfiguration configuration) {
		Executer executer = new Executer(configuration);
		return executer;
	}

	public void init() {

	}

}

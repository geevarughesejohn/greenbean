package greenbean;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class EngineMain {

	private ExecuterFactory executerFactory;

	public EngineMain() {
		executerFactory = new ExecuterFactory();
	}

	public static void main(String[] args) {
		EngineMain engine = new EngineMain();
		engine.run();
	}

	private void run() {

		executerFactory.init();
		List<Path> paths = new ArrayList<Path>();
		for (Path path : paths) {
			ExecuterConfiguration configuration = ConfigurationReader
					.read(path);
			Executer executer = executerFactory.createExecuter(configuration);
			executer.execute();
		}
	}

}

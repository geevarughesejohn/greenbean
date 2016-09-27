package greenbean;

public class DatabaseReadWriterTest {

	// @Test
	public void testName() throws Exception {
		ExecuterConfiguration configuration = new ExecuterConfiguration();
		InputReader inputReader = new DataBaseInputReader(baseInputReaderConfiguration);
		configuration.setInputReader(inputReader );
		configuration.setOutputWriter(outputWriter);
		Executer executer = new Executer(configuration);
		executer.execute();
	}
}

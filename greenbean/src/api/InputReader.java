package api;

import configuration.Source;

public interface InputReader<S extends Source, R> {

	public S getInputConfiguration();

	public R read(S sourceConfiguration);

}

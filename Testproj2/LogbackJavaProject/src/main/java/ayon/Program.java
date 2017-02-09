package ayon;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Program {

	//No static, else log.name.IS_UNDEFINED.log
	private final Logger logger = LoggerFactory.getLogger(Program.class);

	public static void main(String[] args) {

		//Set this before the logger start.
		System.setProperty("log.name", "abcdefg");

		Program obj = new Program();
		obj.start();

	}

	private void start() {

		logger.warn("------ Starting Gradle------");
		//...
	}
}

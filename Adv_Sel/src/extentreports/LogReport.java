package extentreports;

import org.apache.log4j.BasicConfigurator;
import org.testng.annotations.Test;

import freemarker.log.Logger;

public class LogReport {
	@Test
	public void console()
	{
		BasicConfigurator.configure();
		Logger log=Logger.getLogger(this.getClass().getName());
		log.warn("warning message");
		log.warn("error message");
		log.info("tc info");
	}

}

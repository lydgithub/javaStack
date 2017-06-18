package crunchify.com.tutorial;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;

public class CrunchifyUpdateConfig {

	public static void main(String[] args) throws ConfigurationException {

		// You have to create config.properties file under resources folder or
		// anywhere you want :)
		// Here I'm updating file which is already exist under /Documents
		PropertiesConfiguration config = new PropertiesConfiguration(
				"config.properties");
		System.out.println("path is "+config.getBasePath());
		
		config.setProperty("company1", "Crunchify");
		config.setProperty("company2", "Google");
		config.setProperty("Crunchify_Address", "NYC, US");
		config.setProperty("Google_Address", "Mountain View, CA, US");
		config.save();

		System.out.println("Config Property Successfully Updated..");
	}
}

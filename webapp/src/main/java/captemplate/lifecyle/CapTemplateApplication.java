package captemplate.lifecyle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages={"captemplate.service", "captemplate.*"})
public class CapTemplateApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(CapTemplateApplication.class, args);
	}
}

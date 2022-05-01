package ch.tekh.javasignal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * {@link Application}
 *
 * @author thomas pauli | tekh.ch
 */
@EnableAsync
@EnableScheduling
@EnableJpaRepositories
@EntityScan(basePackages = Application.ENTITY_LOCATION)
@SpringBootApplication(scanBasePackages = Application.BASE_PACKAGE_LOCATION)
public class Application {

	public static final String BASE_PACKAGE_LOCATION = "ch.tekh.javasignal";
	public static final String ENTITY_LOCATION = "ch.tekh.javasignal.persistence.entity";

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}


package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import beans.Parrot;

@Configuration
@ComponentScan("beans")
public class ProjectConfig {
	@Bean
	Parrot parrot1() {
		var par = new Parrot();
		par.setName("미키");
		return par;
	}
	@Bean
	Parrot parrot2() {
		var par = new Parrot();
		par.setName("차키");
		return par;
	}
}

package main;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.io.PrintStream;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import beans.Person;
import config.ProjectConfig;

public class Main {

	public static void main(String[] args) {
		var ctx = new AnnotationConfigApplicationContext(ProjectConfig.class);
		var person = (Person)ctx.getBean(Person.class);
		var ps = new PrintStream(System.out, true, UTF_8);
		ps.println(person);
	}

}

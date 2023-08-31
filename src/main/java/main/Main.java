package main;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.io.PrintStream;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import beans.Parrot;
import config.ProjectConfig;

public class Main {

	public static void main(String[] args) {
		var ctx = new AnnotationConfigApplicationContext(ProjectConfig.class);
		var parrot1 = (Parrot)ctx.getBean("parrot1", Parrot.class);
		var ps = new PrintStream(System.out, true, UTF_8);
		ps.println(parrot1);
	}

}

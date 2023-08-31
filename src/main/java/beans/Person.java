package beans;

import org.springframework.stereotype.Component;

import lombok.ToString;

@Component
@ToString
public class Person {
	private String name = "진수";
	private Parrot parrot;
	
	public Person(Parrot parrot2) {
		this.parrot = parrot2;
	}
}

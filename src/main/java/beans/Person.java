package beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import lombok.ToString;

@Component
@ToString
public class Person {
	private String name = "진수";
	private Parrot parrot;
	
	public Person(@Qualifier("parrot1") Parrot parrot) {
		this.parrot = parrot;
	}
}

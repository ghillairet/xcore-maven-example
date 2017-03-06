package sample;

import sample.model.ModelFactory;
import sample.model.User;

public class Main {

	public static void main(String... args) {
		User paul = ModelFactory.eINSTANCE.createUser();
		paul.setName("Paul Doe");

		User jack = ModelFactory.eINSTANCE.createUser();
		jack.setName("Jack Black");

		System.out.println(paul.sayHello(jack));
	}

}

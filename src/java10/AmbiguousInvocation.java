package java10;

public class AmbiguousInvocation {

	public void consume(Parent parent) {

	}

	public void consume(Child childOne) {

	}

	public void myMethod() {
		Parent gc = new Child();
		consume(gc);
	}

	class Parent {

	}

	class Child extends Parent {

	}
}

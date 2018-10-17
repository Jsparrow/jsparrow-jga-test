package java10;

import java.io.IOException;

public class AnonymousClasses {

	public void myMethod() {
		MyAbstractClass myAc = new MyAbstractClass() {
			@Override
			void read() {
			}

		};

		try {
			myAc.read();
		} catch (IOException e) {

		}
	}

	abstract class MyAbstractClass {
		abstract void read() throws IOException;
	}

}

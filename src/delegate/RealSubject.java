package delegate;

public class RealSubject implements Subject{
	public void doSomething() {
		System.out.println("I am the realSubject!");
	}
}

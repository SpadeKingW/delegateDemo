package delegate;

public class ProxySubject implements Subject {
	private Subject subject ;
	public ProxySubject(Subject subject) {
		this.subject = subject ;
	}
	
	public void doSomething(){
		System.out.println("before...");
		subject.doSomething();
		System.out.println("after...");
	}
}

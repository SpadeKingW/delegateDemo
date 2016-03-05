package delegate;

public class Main {
	public static void main(String args[]){
		Subject subject = new RealSubject() ;
		ProxySubject proxySubject = new ProxySubject(subject) ;
		proxySubject.doSomething();
	}
}

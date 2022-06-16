import src.main.java.Counter;

public class Driver {

	public static void main(String[] args) {
		
		Counter counter = new Counter();
		
		System.out.println("Current count:" + counter.getCount());
		
		counter.increment();
		
		System.out.println("Current count:" + counter.getCount());
		
		counter.decrement();
		
		System.out.println("Current count:" + counter.getCount());
		
		counter.incrementBy(3);
		
		System.out.println("Current count:" + counter.getCount());
		
		counter.decrementBy(2);
		
		System.out.println("Current count:" + counter.getCount());

		counter.multiplyBy(12);
		
		System.out.println("Current count:" + counter.getCount());
	}

}

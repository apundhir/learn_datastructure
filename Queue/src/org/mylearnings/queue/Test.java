package org.mylearnings.queue;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Queue Test
		QueueWithList q = new QueueWithList();
		q.enque("Ajay");
		q.enque("Ajay2");
		System.out.println(q.deque());
		System.out.println(q.deque());
		//System.out.println(q.deque());
		
		QueueWithTwoStacks q2 = new QueueWithTwoStacks(2);
		System.out.println(q2.isEmpty());
		q2.enque("1");
		q2.enque("2");
		q2.enque("3");
		q2.enque("4");
		q2.enque("5");
		System.out.println(q2.deque());
		System.out.println(q2.deque());
		System.out.println(q2.deque());
		System.out.println(q2.deque());
		System.out.println(q2.deque());
		
		QueueWithArray q3 = new QueueWithArray(5);
		System.out.println("Q3: queue with arrays");
		System.out.println(q3.isEmpty());
		try {
			q3.enque("ajay1");
			q3.enque("ajay2");
			q3.enque("ajay3");
			q3.enque("ajay4");
			q3.enque("ajay5");
			q3.enque("ajay6");
		} catch (MyExceptions e) {
			e.getMessage();
		}
		try {
			System.out.println(q3.deque());
			System.out.println(q3.deque());
			System.out.println(q3.deque());
			System.out.println(q3.deque());
			System.out.println(q3.deque());
			System.out.println(q3.deque());
			System.out.println(q3.deque());
		} catch (MyExceptions e) {
			e.getMessage();
		}
		
	}
}

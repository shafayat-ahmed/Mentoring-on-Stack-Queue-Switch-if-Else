import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;
public class StackQueueMentoring {

	public static void main(String[] args) {
		Stack<Integer> s= new Stack();
		Queue q = new LinkedList<Integer>();
		
	int a=5;
	int b=10;
	int c=15;
	
	s.push(a);
	s.push(b);
	s.push(c);
	System.out.println("Stacks in the list=" +s);
	System.out.println("\n Peek in the line to see who will get out first=" +(s.peek()));
	
	q.offer(a);
	q.offer(b);
	q.offer(c);
	
	System.out.println("\n Queues in the list=" +s);
	System.out.println("\n Peek in the line to see who will get out first=" +(q.peek()));
	
	System.out.println("Stacklist after popping=");
		while (!s.isEmpty()) {
			System.out.println(s.pop());
		}
		
	System.out.println("Queuelist after polling=");
		while (!q.isEmpty()) {
			System.out.println(q.poll());
		}
			
	}

}

import java.io.*;
import java.util.*;

class Today {
	static void solve() throws IOException {
		int n = nextInt(), k = nextInt(), a[] = nextIntArray(n);
		Deque<Integer> dq = new LinkedList<>();
		int i;
		for(i = 0; i < k; ++i) {
			while(!dq.isEmpty() && a[i] >= a[dq.peekLast()])
				dq.removeLast();
			dq.addLast(i);
		}
		for(; i < n; ++i) {
			out.print(a[dq.peek()] + " ");
			while(!dq.isEmpty() && dq.peek() <= (i - k))
				dq.removeFirst();
			while(!dq.isEmpty() && a[i] >= a[dq.peekLast()])
				dq.removeLast();
			dq.addLast(i);
		}
		out.println(a[dq.peek()]);
	}
}

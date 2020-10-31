class Stack {
	int stck[];
	int tos;
	Stack(int size) {
		stck = new int[size];
		tos = -1;
	}
	void push(int item) {
		if (tos == stck.length - 1)
			System.out.println("Stack is full");
		else
			stck[++tos] = item;
	}
	int pop() {
		if (tos < 0) {
			System.out.println("Stack underflow");
			return 0;
		} else {
			return stck[tos--];
		}
	}
}
class Queue {
	int que[];
	int front;
	int rear;
	int capacity;
	Queue(int size) {
		capacity = size;
		que = new int[capacity];
		front = rear = 0;
	}
	void insert(int data) {
		if (capacity == rear)
			System.out.println("Queue is full");
		else {
			que[rear] = data;
			rear++;
		}
	}
	void delete() {
		if (front == rear)
			System.out.printf("Queue is empty");
		else {
			for (int i = 0; i < rear - 1; i++) {
				que[i] = que[i + 1];
			}
			if (rear < capacity)
				que[rear] = 0;
			rear--;
		}
	}
	void display() {
		int i;
		if (front == rear)
			System.out.printf("Queue is Empty");
		for (i = front; i < rear; i++) {
			System.out.println(que[i]);
		}
	}
}
class StacknQueue {
	public static void main(String ar[]) {
		Stack ss = new Stack(5);
		Queue qq = new Queue(5);
		for (int i = 0; i < 5; i++)
			ss.push(i);
		for (int i = 0; i < 5; i++)
			System.out.println(ss.pop());
		qq.insert(100);
		qq.insert(150);
		qq.insert(300);
		qq.insert(500);
		qq.display();
		qq.delete();
		qq.display();
    }
}
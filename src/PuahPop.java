
import java.util.Scanner;

public class PuahPop {
	// main method

	public static void main(String[] args) {
		// scanner for input
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the Size of the stack");
		int size = scanner.nextInt();
		// new object creation
		FixedStack fixedStack = new FixedStack(size);
		VariableStack stack = new VariableStack(size);
		// while loop
		while (true) {
			System.out.println("Enter A to implement FixedStack and B to implement VariableStack");
			char ch = scanner.next().toCharArray()[0];
			switch (ch) {
			case 'A':
				while (true) {
					System.out.println("Enter 1 to push");
					System.out.println("Enter 2 to pop");
					System.out.println("Enter 3 to close");
					System.out.println("Please Enter your choice");
					int choice = scanner.nextInt();

					switch (choice) {
					case 1:
						System.out.println("Please enter a integer to push into stack");
						int push = scanner.nextInt();
						fixedStack.push(push);
						break;
					case 2:
						int item = fixedStack.pop();
						System.out.println("popped item is :" + item);
						break;

					case 3:
						scanner.close();

					}
				}
			case 'B':
				while (true) {
					System.out.println("Enter 1 to push");
					System.out.println("Enter 2 to pop");
					System.out.println("Enter 3 to close");
					System.out.println("Please Enter your choice");
					int choice = scanner.nextInt();

					switch (choice) {
					case 1:
						System.out.println("Please enter a integer to push into stack");
						int push = scanner.nextInt();
						stack.push(push);

						break;
					case 2:
						int item = stack.pop();
						System.out.println("popped item is :" + item);
						break;

					case 3:
						scanner.close();

					}
				}
			default:
				scanner.close();

			}
		}
	}

}

interface Stack {

	void push(int i);

	int pop();
}

class FixedStack implements Stack {

	int top = -1;
	static int size;

	int[] stackItems;

	public FixedStack(int size) {
		// TODO Auto-generated constructor stub
		FixedStack.size = size;
		stackItems = new int[size];
	}

	@Override
	public void push(int i) {
		// TODO Auto-generated method stub
		if (top < size) {

			top = top + 1;
			stackItems[top] = i;
			System.out.println("top value" + top);
			System.out.println("size value" + size);
			System.out.println("Item saved " + stackItems[top] + "\n");
		} else {
			System.out.println("STACK OVERFLOW" + "\n");

		}

	}

	@Override
	public int pop() {
		// TODO Auto-generated method stub

		int item;
		if (top < 0) {
			System.out.println("There is no item to be popped out" + "\n");
			return 0;

		} else {

			item = stackItems[top];
			top = top - 1;
			return item;
		}

	}

}

class VariableStack implements Stack {

	int top = -1;
	static int size;

	int[] stackItems;

	public VariableStack(int size) {
		// TODO Auto-generated constructor stub
		this.size = size;
		stackItems = new int[size];
	}

	@Override
	public void push(int i) {
		// TODO Auto-generated method stub

		if (top < size) {

			top = top + 1;
			stackItems[top] = i;
			System.out.println("top value" + top);
			System.out.println("size value" + size);
			System.out.println("Item saved " + stackItems[top] + "\n");
		} else if (top >= size) {

			stackItems = new int[size * 2];
			top = top + 1;
			stackItems[top] = i;
			System.out.println("top value" + top);
			System.out.println("size value" + size);
			System.out.println("Item saved " + stackItems[top] + "\n");

		}

	}

	@Override
	public int pop() {
		// TODO Auto-generated method stub

		int item;
		if (top < 0) {
			System.out.println("There is no item to be popped out" + "\n");
			return 0;

		} else {

			item = stackItems[top];
			top = top - 1;
			return item;
		}

	}

}

package KI307.Bazhulin.Lab6;

/**
 * @author Bazhulin Serhiy KI-307
 * @version 1.0
 * @since version 1.0
 * @param <T>
 */
class Node<T extends Comparable<T>>
{
	T data;
	Node<T> next;
	public Node(T data)
	{
		this.data = data;
		this.next = null;
	}
}

/**
 * Class MyList realisation
 * @author Bazhulin Serhiy KI-307
 * @version 1.0
 * @since version 1.0
 * @param <T>
 */
class MyList<T extends Comparable<T>>
{
	Node<T> head;
	
	public MyList()
	{
		this.head = null;
	}
	
	//Adding an element
	public void add(T data)
	{
		Node<T> newNode = new Node<>(data);

        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
	}
	
	//Removing element
	public void remove(T data)
	{
		 if (head == null) {
	            return;
	        }

	        if (head.data.equals(data)) {
	            head = head.next;
	            return;
	        }

	        Node<T> current = head;
	        while (current.next != null && !current.next.data.equals(data)) {
	            current = current.next;
	        }

	        if (current.next != null) {
	            current.next = current.next.next;
	        }
	}
	
	//This method is finding a minimal value of list
	public T findMin()
	{
		if (head == null) {
            return null;
        }

        T min = head.data;
        Node<T> current = head.next;
        while (current != null) {
            if (current.data.compareTo(min) < 0) {
                min = current.data;
            }
            current = current.next;
        }
        return min;
	}
	
	//This method is displaying a list
	public void display()
	{
		Node<T> current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
	}
	
}
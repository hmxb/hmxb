package sample;
// 제네릭을 사용한 단일 연결 리스트의 노드 클래스
class Node<T> {
    private T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }

    public char[] getData() {
        return null;
    }

    public Node<Integer> getNext() {
        return null;
    }

    // 필요한 getter와 setter 메서드 등을 구현할 수 있습니다.
}

// 제네릭을 사용한 단일 연결 리스트 클래스
class LinkedList<T> {
    private Node<T> head;

    public LinkedList() {
        this.head = null;
    }

    public void add(T data) {
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

    public Node<Integer> getHead() {
        return null;
    }

    // 필요한 메서드들을 구현할 수 있습니다.
}

// 제네릭을 활용한 단일 연결 리스트의 사용 예시
public class generic {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        // 단일 연결 리스트에서 값을 출력해보겠습니다.
        Node<Integer> current = list.getHead();
        while (current != null) {
            System.out.println(current.getData());
            current = current.getNext();
        }
    }
}

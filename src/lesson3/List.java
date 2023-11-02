package lesson3;

public class List {
    public static void main(String[] args) {
        MyList myList = new MyList();

        for (int i = 0; i <= 10; i++) {
            myList.addLast(i);
        }
        System.out.println(myList);
        myList.removeFirst();
        System.out.println(myList);
        myList.removeLast();
        System.out.println(myList);
    }
}

class MyList {
//    1.Реализуем простой односвязный список.
//    2.Пишем только структуру, никаких методов не требуется.

//    1.Реализуем метод добавления новых элементов в начало списка и удаление
//    первого элемента связного списка.
//    2.Односвязный список всегда имеет ссылку на первый элемент
//    последовательности, потому именно с реализации методов для первого
//    элемента последовательности стоит начать

//    1.Реализуем метод поиска элемента в односвязном списке для проверки наличия
//    элемента внутри списка.
//    2.Для корректной работы со связным список необходимо понимать, как именно
//    можно обходить все значения внутри связного списка.
//    3.Для нашего примера проще всего будет написать метод поиска значения в
//    связном списке и возвращения из метода информации о наличии искомого
//    внутри списка.

//    Реализуем метод добавления новых элементов в конец списка и удаление
//    последнего элемента связного списка.

//    Расширяем структуру связного списка до двухсвязного.

    //    Обновляем методы согласно новой структуре.
    private Node head;
    private Node tail;

    private class Node {
        private int value;
        private Node next;
        private Node previous;

        public Node(int value) {
            this.value = value;
        }
    }

    public boolean addFirst(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
            return true;
        }

        //create double connected nodes
        head.previous = node;
        node.next = head;
        head = node;
        return true;
    }

    public Node search(int value) {
        if (head == null) return null;
        for (Node temp = head; temp != null; temp = temp.next) {
            if (temp.value == value) return temp;
        }
        return null;
    }

    public Integer removeFirst() {
        if (head == null) return null;
        int temp = head.value;
        head = head.next;
        if (head != null) head.previous = null;
        return temp;
    }

    public Integer removeLast() {
        if (tail == null) return null;
        int res = tail.value;
        tail.previous.next = null;
        tail = tail.previous;
        return res;
    }

    public void addLast(int value) {
        if (head == null) {
            addFirst(value);
            return;
        }
        if (tail == null) {
            tail = new Node(value);
            return;
        }
        tail.next = new Node(value);
        tail.next.previous = tail;
        tail = tail.next;
    }

    @Override
    public String toString() {
        String string = "{ ";
        for (Node temp = tail; temp != null; temp = temp.previous) {
            string += String.valueOf(temp.value) + " ";
        }
        return string + "}";
    }
}

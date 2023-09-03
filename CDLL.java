public class CDLL {
    Node last;

    public class Node {
        int item;
        Node next;
        Node prev;

        public int getItem() {
            return item;
        }

        public Node getNext() {
            return next;
        }

        public void setItem(int data) {
            item = data;
        }

        public void setNext(Node n) {
            next = n;
        }

        public Node getPrev() {
            return prev;
        }

        public void setPrev(Node n) {
            prev = n;
        }
    }

    public void checkEmpty() {
        if (last == null) {
            System.out.println("The list is empty");
        } else {
            System.out.println("The list is not empty");
        }
    }

    public void insertEleBeginning(int data) {
        Node n = new Node();
        n.item = data;
        if (last == null) {
            last = n;
            last.prev = n;
            last.next = n;
        } else {
            n.next = last.next;
            n.prev = last;
            last.next.prev = n;
            last.next = n;
        }
    }

    public void insertEnd(int data) {
        Node n = new Node();
        n.item = data;
        if (last == null) {
            last = n;
            last.prev = n;
            last.next = n;
        } else {
            n.next = last.next;
            n.prev = last;
            last.next = n;
            n.next.prev = n;
            last = n;
        }
    }

    public void searchEle(int data) {
        Node temp = last.next;
        int flag = 0;
        do {
            if (temp.item == data) {
                flag = 1;
                break;
            } else {
                flag = 0;
            }
            temp = temp.next;
        } while (temp != last.next);

        if (flag == 1) {
            System.out.println("Element exists in the list");
        } else {
            System.out.println("Element does not exist in the list");
        }
    }

    public void insertEleBetween(int data, int newData) {
        Node n = new Node();
        n.item = newData;
        Node temp = last.next;
        int flag = 0;

        do {
            if (temp.item == data) {
                flag = 1;
                break;
            } else {
                flag = 0;
            }
            temp = temp.next;
        } while (temp != last.next);

        if (flag == 1) {
            n.next = temp.next;
            n.prev = temp;
            temp.next.prev = n;
            temp.next = n;
        } else {
            System.out.println("Element cannot be inserted at the desired place");
        }
    }

    public void deleteBeginning() {
        if (last == null) {
            System.out.println("No element to delete");
        } else if (last.next == last) {
            last = null;
        } else {
            last.next = last.next.next;
            last.next.prev = last;
        }
    }

    public void deleteEnd() {
        if (last == null) {
            System.out.println("No element to delete");
        } else if (last.next == last) {
            last = null;
        } else {
            Node temp = last.next;
            do {
                temp = temp.next;
            } while (temp.next != last);
            temp.next = last.next;
            last.next.prev = temp;
            last = temp;
        }
    }

    public void deleteBetween(int data) {
        Node temp = last.next;
        int flag = 0;
        if (last.item == data) {
            while (temp.next != last) {
                temp = temp.next;
            }
            last = temp;
            last.next = last.next.next;
            last.next.next.prev = last;
        } else {
            while (temp.next != last) {
                if (temp.next.item == data) {
                    flag = 1;
                    break;
                } else {
                    flag = 0;
                }
                temp = temp.next;
            }
        }
        if (flag == 1) {
            temp.next = temp.next.next;
            temp.next.next.prev = temp;
        } else {
            System.out.println("Element cannot be inserted at the desired place");
        }
    }

    public void printElements() {
        Node temp = last;
        do {
            System.out.println(temp.next.item);
            temp = temp.next;
        } while (temp != last);
    }

    public static void main(String args[]) {
        CDLL c = new CDLL();
        System.out.println("Checking if the list is empty");
        c.checkEmpty();
        System.out.println("-----*-----*-----*-----");
        System.out.println("Inserting elements in the beginning");
        c.insertEleBeginning(1);
        c.insertEleBeginning(2);
        System.out.println("-----*-----*-----*-----");
        System.out.println("Printing the elements");

        c.printElements();
        System.out.println("-----*-----*-----*-----");
        System.out.println("Inserting at the end");
        c.insertEnd(3);
        c.insertEnd(4);
        System.out.println("-----*-----*-----*-----");
        System.out.println("Printing the elements");
        c.printElements();
        System.out.println("-----*-----*-----*-----");
        System.out.println("Searching element");
        c.searchEle(3);
        System.out.println("-----*-----*-----*-----");
        System.out.println("Putting element in between");
        c.insertEleBetween(1, 5);
        System.out.println("-----*-----*-----*-----");
        System.out.println("Printing the elements");
        c.printElements();
        System.out.println("-----*-----*-----*-----");
        System.out.println("Deleting element from beginning");
        c.deleteBeginning();
        System.out.println("Printing the elements");
        c.printElements();
        System.out.println("-----*-----*-----*-----");
        System.out.println("Deleting element from end");
        c.deleteEnd();
        System.out.println("Printing the elements");
        c.printElements();
        System.out.println("-----*-----*-----*-----");
        System.out.println("Deleting element from between");
        c.deleteBetween(5);
        System.out.println("Printing the elements");
        c.printElements();
        System.out.println("-----*-----*-----*-----");
    }
}

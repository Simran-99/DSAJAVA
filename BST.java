public class BST {
    private Node root;

    class Node {
        int item;
        Node left;
        Node right;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void insertElement(int data) {
        Node newNode = new Node();
        newNode.item = data;
        newNode.left = null;
        newNode.right = null;

        if (isEmpty()) {
            root = newNode;
        } else {
            Node temp = root;
            while (true) {
                if (data == temp.item) {
                    // Handle duplicate values (if needed)
                    break;
                } else if (data < temp.item) {
                    if (temp.left == null) {
                        temp.left = newNode;
                        break;
                    } else {
                        temp = temp.left;
                    }
                } else {
                    if (temp.right == null) {
                        temp.right = newNode;
                        break;
                    } else {
                        temp = temp.right;
                    }
                }
            }
        }
    }

    public void preorderTraverse(Node temp) {
        if (temp == null) {
            return;
        }
        System.out.println(temp.item);
        preorderTraverse(temp.left);
        preorderTraverse(temp.right);
    }

    public void inorderTraverse(Node temp) {
        if (temp == null) {
            return;
        }
        inorderTraverse(temp.left);
        System.out.println(temp.item);
        inorderTraverse(temp.right);
    }

    public void postorderTraverse(Node temp) {
        if (temp == null) {
            return;
        }
        postorderTraverse(temp.left);
        postorderTraverse(temp.right);
        System.out.println(temp.item);
    }

    public Node deleteFunction(int data, Node temp) {
        if (temp == null) {
            return null;
        }
        if (data < temp.item) {
            temp.left = deleteFunction(data, temp.left);
        } else if (data > temp.item) {
            temp.right = deleteFunction(data, temp.right);
        } else {
            if (temp.left == null && temp.right == null) {
                return null;
            } else if (temp.left == null || temp.right == null) {
                Node child = (temp.left != null) ? temp.left : temp.right;
                return child;
            } else {
                Node pred = temp.left;
                Node ppred = temp;
                while (pred.right != null) {
                    ppred = pred;
                    pred = pred.right;
                }
                temp.item = pred.item;
                if (ppred.right == pred) {
                    ppred.right = deleteFunction(pred.item, ppred.right);
                } else if (ppred.left == pred) {
                    ppred.left = deleteFunction(pred.item, ppred.left);
                }
            }
        }
        return temp;
    }

    public void delete(int data) {
        root = deleteFunction(data, root);
    }

    public void search(int data) {
        Node temp = root;
        while (temp != null) {
            if (temp.item == data) {
                System.out.println("Found the data");
                break;
            } else if (temp.item < data) {
                temp = temp.right;
            } else {
                temp = temp.left;
            }
        }
    }

    public static void main(String args[]) {
        BST b = new BST();
        b.insertElement(8);
        b.insertElement(6);
        b.insertElement(20);

        System.out.println("Preorder traversal");
        b.preorderTraverse(b.root);

        System.out.println("Inorder traversal");
        b.inorderTraverse(b.root);

        System.out.println("Postorder traversal");
        b.postorderTraverse(b.root);
    }
}

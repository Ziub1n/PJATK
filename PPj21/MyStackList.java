package PPJ.PPj21;


    class MyStackList {
        private static class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        private Node head;
        private int size;

        public MyStackList() {
            this.head = null;
            this.size = 0;
        }

        public void push(int element) {
            Node newNode = new Node(element);
            newNode.next = this.head;
            this.head = newNode;
            this.size++;
        }

        public int pop() {
            if (this.head == null) {
                System.out.println("Stos jest pusty");
                return -1;
            }
            int data = this.head.data;
            this.head = this.head.next;
            this.size--;
            return data;
        }
    }



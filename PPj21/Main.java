package PPJ.PPj21;

class Main {
    public static void main(String[] args) {

        MyStack stack = new MyStack(3);

        stack.push(1);
        stack.push(2);
        stack.push(3);


        stack.push(4);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println(stack.pop());


        //sprawdzanie poprawnośći implementacji stosu z wykorzystaniem listy jednokierunkowej

        MyStack stackList = new MyStack(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println(stack.pop());



    }
}


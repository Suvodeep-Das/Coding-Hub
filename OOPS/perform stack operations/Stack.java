import java.util.Scanner;

class Stack 
{
    public static void main(String[] args) {
        int type_of_op; 
        Mystack ob1 = new Mystack(); 

        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.println("Enter your choice");
            System.out.println("Enter 1 for push a numer");
            System.out.println("Enter 2 for pop a number");
            System.out.println("Enter 3 for printing a stack elements");
            System.out.println("Enter 4 for exit");
            type_of_op = s.nextInt();
            switch (type_of_op) {
                case 1:
                    System.out.println("Enter your element which you want to push");
                    ob1.push(s.nextInt()); 
                    break;

                case 2:
                    System.out.println("Element  you want to pop is " + ob1.pop());
                    break;

                case 3:
                    System.out.println("stack element is ");
                    ob1.print();
                    break;
                default:
                    System.out.println("You have entered the wrong choice");
                    return;

            }

        }

    }
}

class Mystack {
    int st_elements[] = new int[10];
    int tos;

    Mystack() {
        tos = -1; 
    }

    public void push(int item) 
    {
        if (tos == 10) {
            System.out.println("stack is full");
            return;
        } else {
            st_elements[++tos] = item;
        }
    }

    public int pop()
    {
        if (tos < 0) {
            System.out.println("stack underflow");
            return 0;
        } else
            return st_elements[tos--];
    }

    public boolean empty_stack() 
    {
        if (tos == -1)
            return true;
        else
            return false;
    }

    public void print() 
    {
        int temp = 0;

        if (!empty_stack()) {
            temp = pop();
            System.out.println(temp);
            print();
        }
        push(temp);
    }

};
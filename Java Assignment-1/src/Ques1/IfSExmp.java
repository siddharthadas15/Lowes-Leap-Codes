package Ques1;

public class IfSExmp {
    public static void main(String[] args) {
        //if statment
        int x = 10;
        int y = 12;
        if(x+y > 10) {
            System.out.println("x + y is greater than 10");
        }
        // if -else statment
        if(x+y < 20) {
            System.out.println("x + y is less than 20");
        }   else {
            System.out.println("x + y is greater than 30");
        }
        //if-else-if
        if(x+y>30)
        {
            System.out.println("x + y is greater than 30");
        }
        else if(x+y>20)
        {
            System.out.println("x + y is greater than 20");
        }
        else {
            System.out.println("x + y is greater than 0");
        }

    }
}

import java.util.Scanner;

public class EmployeeDetailsQ4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter EId- ");
        int eId= sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Employee name: ");
        String eName= sc.nextLine();
        System.out.print("Enter Basic Pay- ");
        int basic= sc.nextInt();
        double hra = (12.0*basic)/100.0;
        double ta= (8.0*basic)/100.0;
        double da =(9.0*basic)/100.0;
        double gross = (basic) + (hra) + (ta) + (da);
        System.out.println("EId- "+eId);
        System.out.println("Employee Name- "+eName);
        System.out.println("Basic Pay "+basic);
        System.out.println("The Employee's gross salary is "+gross);
        if(gross>=25000)
        System.out.println("The Employee is grade A");
        else if(gross>=10000)
            System.out.println("The Employee is grade B");
            else
            System.out.println("The Employee is grade C");
    }
}

import java.util.*;
public class AttendanceManagementSystemQ5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter SId- ");
        int sId= sc.nextInt();
        sc.nextLine();
        System.out.print("Enter student name: ");
        String sName= sc.nextLine();
        System.out.print("Enter marks of Subject 1- ");
        int m1= sc.nextInt();
        System.out.print("Enter marks of Subject 2- ");
        int m2= sc.nextInt();
        System.out.print("Enter marks of Subject 3- ");
        int m3= sc.nextInt();
        double totalOpenDays=280;
        System.out.print("Enter number of days present- ");
        int np= sc.nextInt();
        double perOfPresent=(np/(totalOpenDays))*100;
        System.out.println("SId- "+sId);
        System.out.println("Student Name- "+sName);
        System.out.println("Regularity "+perOfPresent+" %");
        int total=m1+m2+m3;
        int ave=(total)/3;
        System.out.println("Total Marks Obtained in 3 subjects "+total);
        System.out.println("Average of 3 subjects "+ave);


    }
}

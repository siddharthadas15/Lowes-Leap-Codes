import java.util.Scanner;

public class ProductCatalogueQ3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter PId- ");
        int pId= sc.nextInt();
        sc.nextLine();
        System.out.print("Enter product name: ");
        String pName= sc.nextLine();
        System.out.print("Enter stk- ");
        int stk= sc.nextInt();
        System.out.print("Enter Unit Price- ");
        int up= sc.nextInt();
        System.out.print("Enter qty- ");
        int qty= sc.nextInt();
        System.out.println("PId- "+pId);
        System.out.println("Product Name- "+pName);
        System.out.println("Stock- "+stk);
        System.out.println("Unit Price "+up);
        System.out.println("Quantity demanded- "+qty);
        if(qty>stk)
        {
            System.out.println("Out of Stock");
        }
        else {
            int tc=qty*up;
            int ri=stk-qty;
            System.out.println("Total cost "+tc);
            System.out.println("Items remaining "+ri);
        }

    }
}

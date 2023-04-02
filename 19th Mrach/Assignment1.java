import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class Assignment1 {
    public static void main(String[] args) {
        System.out.println("Hashset Example: ");
        HashSet<String> set = new HashSet<String>();
        set.add("Car");
        set.add("Bus");
        set.add("Train");
        set.add("Bike");
        set.add("Rickshaw");
        System.out.println(set);
        boolean containsCar = set.contains("Car");
        boolean containsTruck = set.contains("Truck");
        System.out.println("Contains Car: " + containsCar);
        System.out.println("Contains Truck: " + containsTruck);
        set.remove("Train");
        System.out.println(set);


        System.out.println("TreeSet Example: ");
        TreeSet<String> set2 = new TreeSet<String>();
        set2.add("Car");
        set2.add("Bus");
        set2.add("Train");
        set2.add("Bike");
        set2.add("Rickshaw");
        System.out.println(set2);
        String firstVehicle = set2.first();
        String lastVehicle = set2.last();
        System.out.println("First vechile is " + firstVehicle + " & Last vehicle is " + lastVehicle );
        System.out.println(set2);
        TreeSet<String> headSet = (TreeSet<String>) set2.headSet("Car");
        TreeSet<String> tailSet = (TreeSet<String>) set2.tailSet("Car");
        System.out.println(headSet);
        System.out.println(tailSet);

        System.out.println("ArrayList Example: ");
        ArrayList<String> list = new ArrayList<String>();
        list.add("Car");
        list.add("Bus");
        list.add("Train");
        list.add("Bike");
        list.add("Rickshaw");
        System.out.println(list);
        String VehicleAtIndex2 = list.get(2);
        System.out.println("Vehicle at index 2 is " + VehicleAtIndex2);
        list.remove(3);
        System.out.println("After removing Vehicle at index 3");
        System.out.println(list);


        System.out.println("TreeMap Example: ");
        TreeMap<String, Integer> map = new TreeMap<String, Double>();
        map.put("Car", 1);
        map.put("Bus", 11);
        map.put("Train", 2);
        map.put("Bike", 3);
        map.put("Rickshaw", 5);
        System.out.println(map);
    }
}
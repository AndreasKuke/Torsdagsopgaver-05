import java.util.ArrayList;

public class Main {

    public static void main(String[] args){

        Room room1 = new Room(4,2);
        Room room2 = new Room(8,10);
        Room room3 = new Room(50,50);



        ArrayList<Room> rooms = new ArrayList<>();
        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);

        Building building1 = new Building(rooms, 3); // Has three floors

        //Testing for normal building.
        System.out.println("Normal building");

        int totalLamps = countLampsInBuilding(building1);
        System.out.println("There are "+totalLamps+" lamps.");

        int totalWindows = countWindowsInBuilding(building1);
        System.out.println("There are "+totalWindows+" windows.");

        int totalRooms = countRoomsInBuilding(building1);
        System.out.println("There are "+totalRooms+" rooms.");

        System.out.println("Is this building normal?: "+isNormal(building1));
//////////////////////////////////////////////////////////////////////////////////////

        ArrayList<Room> abnormalRooms = new ArrayList<>();
        Room room4 = new Room(7,2);
        Room room5 = new Room(2,1);
        Room room6 = new Room(0,0);

        Building abnormalbuilding = new Building(abnormalRooms,2); //Has two floors
        abnormalRooms.add(room4);
        abnormalRooms.add(room5);
        abnormalRooms.add(room6);

        //Testing for abnormal building.
        System.out.println("\nAbnormal building");

        System.out.println("There are "+countLampsInBuilding(abnormalbuilding)+" lamps");
        System.out.println("There are "+countWindowsInBuilding(abnormalbuilding)+" windows");
        System.out.println("There are "+countRoomsInBuilding(abnormalbuilding)+" rooms");
        System.out.println("Is this building normal?: "+isNormal(abnormalbuilding));
    }
    public static int countLampsInBuilding(Building building1){
        int totalLamps = 0;

        for(Room room : building1.getRooms()){
             totalLamps += room.getNumberOfLamps();
        }
        return totalLamps;
    }
    public static int countWindowsInBuilding(Building building1){
        int totalWindows = 0;

        for(Room room : building1.getRooms()){
            totalWindows += room.getNumberOfWindows();
        }
        return totalWindows;
    }
    public static int countRoomsInBuilding(Building building1){
        return building1.getRooms().size();
    }
    public static boolean isNormal(Building building){
        return building.getNumberOfFloors() >= building.getRooms().size();
    }
}

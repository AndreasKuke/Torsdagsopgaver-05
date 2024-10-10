import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {



   private ArrayList<String> coffeeMenu;

   public Cafe(){
       coffeeMenu = new ArrayList<>();
   }

    public ArrayList<String> getCoffeeMenu() {
        return coffeeMenu;
    }
    public void loadMenuData(){
        try{
            File file = new File("coffee.txt");
            Scanner scan = new Scanner(file);
        while(scan.hasNextLine()){
            String coffee = scan.nextLine();
            coffeeMenu.add(coffee);
        }
            scan.close();
        }catch(FileNotFoundException fnfe){
            System.out.println("File not found. Remember to check path!");
        }
    }
}

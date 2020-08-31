package drone;
import java.util.Random;
import java.util.Scanner;
/**
 * @author Carla Intriago
 * Date: 8/26/2020
 * Program Name: Intriago_Drone
 * Purpose: Simulation using button, drone movement in x, y,z location
 */
public class Intriago_Drone {
	public static void main(String[] args) {
		int choice;
		  Scanner input = new Scanner(System.in);
		  do {
	        // Display the menu
	        System.out.println("1 - Move up");
	        System.out.println("2 - Move down");
	        System.out.println("3 - Move forward");
	        System.out.println("4 - Move backward");
	        System.out.println("5 - Turn left");
	        System.out.println("6 - Turn right");
	        System.out.println("7 - Display position");
	        System.out.println("8 - Exit navigation");

	        System.out.println("Which direction would you like to move the drone?");
	        
	        //Get user's choice
	        choice=input.nextInt();
	        
	        while(choice < 1 || choice > 8);
	        
	        //Display the title of the chosen module
	        switch (choice) {
	            case 1: System.out.println(">>You have moved up"); 
	            		break;
	            case 2: System.out.println(">>You have moved down");
	                    break;
	            case 3: System.out.println(">>You have moved forward"); 
	                    break;
	            case 4: System.out.println(">>You have moved backward"); 
	                     break;
	            case 5: System.out.println(">>You have turned left"); 
                		break;
	            case 6: System.out.println(">>You have turned right"); 
                		break;
	            case 7: Random r = new Random();
			    		int x = r.nextInt(101); //generate a value between 0 and 100
			    		int y = r.nextInt(101); 
			    		int z = r.nextInt(101);
			    		System.out.println(">>Drone Location[x_pos=" + x + ", " + "y_pos=" + y + ", " + "z_pos=" + z + "]"); 
                		break;
	            case 8: System.out.println(">>Thank you for using the Drone Navigator!");
                		break;
	            default: System.out.println(">>Invalid choice");  
	        }//end of switch  
	        } while(choice !=8);
	   }//end of the main method
	}//end of class	

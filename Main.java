//imports
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
   
    //values
    boolean running = true;

    System.out.println("Hello welcome to the personality test.");
    Scanner program_loop_scan = new Scanner(System.in);
    while (running = true){
      System.out.println("Please enter '1' if you are wanting to create a new profile. \n Please enter '2' if you are wanting to edit an existing profile. \n Please enter '3' if you want to view a test result. \n Please enter 4, if you want to end the program.");
      String response = program_loop_scan.nextLine();
      if (response.charAt(0) == '1'){
        // profile creation
      }
      else if(response.charAt(0) == '2'){
        // setter methods
      }
      else if(response.charAt(0) == '3'){
        // getter methods
      }
      else if(response.charAt(0) == '4'){
        // break
        break;
      }
      else{
        // invalid response
      }

    }
  }
}
//imports
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
   
    //values
    boolean running = true;

    System.out.println("Hello welcome to the personality test.");
    Scanner program_loop_scan = new Scanner(System.in);
    while (running = true){
      // 1 - new profile
      // 2 - edit profile
      // 3 - view results
      // 4 - update profile w/ test
      // 5 - terminate while loop
      System.out.println("Please enter '1' if you are wanting to create a new profile. \n Please enter '2' if you are wanting to edit an existing profile. \n Please enter '3' if you want to view a test result. \n Please enter 4 if you want to take a test to update your results. \n Please enter 5, if you want to end the program.");
      String response_first = program_loop_scan.nextLine();
      if (response_first.charAt(0) == '1'){
        // profile creation
        System.out.println("What is the name of this profile which you want to create?")
        String profile_name = program_loop_scan.nextLine();
        
        // 1 - both tests
        // 2 - MBTI only
        // 3 - rice pure test 
        // 4 - neither
        // 4 - break while loop
        System.out.println("Do you have results for both the Meyers Brigs Personality Test and results for the Rice Purity test? If so enter '1'. \n If you only have results for the Meyers Brigs Personality Test, then enter '2'. \n If you only have results for the Rice Purity test, enter '3'. \n If you dont have any results yet, enter '4'. \n If you want to exit this program, enter '5'.");
        String response_second = program_loop_scan.nextLine();

        if (response_second.charAt(0) == '1'){
          // both results

          // data
          System.out.println("What is your MBTI result?");
          String profile_mbti_result = program_loop_scan.nextLine();
          System.out.println("What is your Rice Pure result?");
          int profile_rice_result = program_loop_scan.nextInt();

          // command
          profile_name.score(profile_mbti_result, profile_rice_result, profile_name);
        }

        else if(response_second.charAt(0) == '2'){
          // only MBTI

          //data
          System.out.println("What is your MBTI result?");
          String profile_mbti_result = program_loop_scan.nextLine();
          
          // command
          profile_name.score(profile_mbti_result, null, profile_name);
        }

        else if(response_second.charAt(0) == '3'){
          // only rice

          //data
          System.out.println("What is your Rice Pure result?");
          int profile_rice_result = program_loop_scan.nextInt();

          //command
          profile_name.score(null, profile_rice_result, profile_name);

        }

        else if(response_second.charAt(0) == '4'){
          // neither
          profile_name.score(null, null, profile_name);
        }

        else if(response_second.charAt(0) == '5'){
          // break
          break;
        }

        else{
          // invalid response
          System.out.println("Invalid response recieved.")
        }
        
      }
      else if(response_first.charAt(0) == '2'){
        // setter methods

        // editing profile
        System.out.println("What profile would you like to edit?");
        String profile_name = program_loop_scan.nextLine();

        System.out.println("What test would you like to edit? Enter '1' for MBTI, '2' for rice purity");
        int test_edit = program_loop_scan.nextInt();
        
        // determine which test is being editted
        if (test_edit == 1){
          // edit mbti
          System.out.println("What is your new MBTI result?");
          String mbti_result = program_loop_scan.nextLine();
          
          profile_name.updateMBTI(mbti_result);
        }
        else if (test_edit == 2){
          // edit ricepure
          System.out.println("What is your new score?");
          int rice_score = program_loop_scan.nextLine();
          
          profile_name.updateRice(rice_score);
        }
        else{
          System.out.println("Invalid response recieved");
        }
      }
      else if(response_first.charAt(0) == '3'){
        // getter methods

        System.out.println("What profile do you want to view?")
        String user_profile = program_loop_scan.nextLine();

        System.out.println("What data do you want to access? \n Enter '1' for MBTI results. \n Enter '2' for Rice Purity Results. \n Enter '3' to exit the loop.");
        String response_second = program_loop_scan.nextLine();

        if (response_second.charAt(0) == '1'){
          System.out.println(user_profile.getMBTI());
        }
        else if (response_second.charAt(0) == '2'){
          System.out.println(user_profile.getRice());
        }
        else if (response_second.charAt(0) == '3'){
          break;
        }
        else{
          System.out.print("Invalid response recieved");
        }
      }
      else if(response_first.charAt(0) == '4'){
        // take test method

        System.out.println("What test do you want to take? Enter '1' to take the MBTI test. \n Enter '2' to take the rice purity test. \n Enter '3' to exit the loop.");
        String response_second = program_loop_scan.nextLine();

        
      }
      else if(response_first.charAt(0) == '5'){
        // break
        break;
      }
      else{
        // invalid response
      }

    }
  }
}
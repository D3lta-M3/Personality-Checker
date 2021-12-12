import java.util.Scanner;

public class ricepure{
  private int ricepure_score;

  public void ricepure_test(string user){
    Scanner yesOrNo = new Scanner(System.in);
    
    ricepure_score = 100;

    System.out.println("Have you ever went on a date with someone? \n y/n");
    String q1 = yesOrNo.nextLine();

    if (q1.charAt(0) == 'y'){
      ricepure_score = ricepure_score - 5;

      System.out.println("Have you ever dated someone? \n y/n");
      String q1a = yesOrNo.nextLine();
      if (q1a.charAt(0) == 'y'){
        ricepure_score = ricepure_score - 5;
      }
      else if(q1a.charAt(0) == 'n'){}
      else{
        System.out.println("Invalid response recieved");
        ricepure_score = 5000;
      }
    }
    else if(q1.charAt(0) == 'n'){}
    else{
      System.out.println("Invalid response recieved");
      ricepure_score = 5000;
    }

    System.out.println("Have you ever commited any form of crime? \n y/n");
    String q2 = yesOrNo.nextLine();

    if(q2.charAt(0) == 'y'){
      ricepure_score = ricepure_score - 5;

      System.out.println("Have you ever been arrested for a crime? \n y/n");
      String q2a = yesOrNo.nextLine();

      if(q2a.charAt(0) == 'y'){
        ricepure_score = ricepure_score - 5;

        System.out.println("Have you been in jail? \n y/n");
        String q2b = yesOrNo.nextLine();

        if (q2b.charAt(0) == 'y'){
          ricepure_score = ricepure_score - 5;
        }
        else if(q2b.charAt(0) == 'n'){}
        else{
          System.out.println("Invalid response recieved");
          ricepure_score = 5000;
        }
      }
      else if(q2a.charAt(0) == 'n'){}
      else{
        System.out.println("Invalid response recieved");
        ricepure_score = 5000;
      }
    else if(q2.charAt(0) == 'n'){}
    else{
      System.out.println("Invalid response recieved");
      ricepure_score = 5000;
    }

    profile.updaterice(ricepure_score);
  }
}
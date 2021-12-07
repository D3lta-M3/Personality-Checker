import java.util.Scanner; // should imports be in main

public class mbti{
  // doubles for implementation of question based stuff
  private double mbti_1;
  private double mbti_2;
  private double mbti_3;
  private double mbti_4;

  public void mbtiTest(){
    Scanner obj = new Scanner(System.in);
    System.out.println("Are you introverted or extroverted? Please respond with either /'i' or /'e'.");
    String iOrE = obj.nextLine();
    if (iOrE.charAt(0) = 'i'){
      mbti_1 = 75;
    }
    else if (iOrE.charAt(0) = 'e'){
      mbti_1 = 25;
    }
    else{
      mbti_1 = null;
      System.out.println("Please dont break me. :(")
    }

  }
}
import java.util.Scanner; // should imports be in main

public class mbti{
  // doubles for implementation of question based stuff
  private double mbti_1; //higher is i
  private double mbti_2; // higher is n
  private double mbti_3; // higher is t
  private double mbti_4; // higher is j

  public void mbtiTest(){
    Scanner yesOrNo_scanner = new Scanner(System.in);
    System.out.println("Have you taken the Meyers Briggs Personality Test? 'y' or 'n'.");
    String yesOrNo = yesOrNo_scanner.nextLine();
    if 

      Scanner mbti_scanner = new Scanner(System.in);
      System.out.println("Are you introverted or extroverted? Please respond with either 'i' for introverted or 'e' for extroverted.");
      String iOrE = mbti_scanner.nextLine();
      if (iOrE.charAt(0) = 'i'){
        mbti_1 = 75;
      }
      else if (iOrE.charAt(0) = 'e'){
        mbti_1 = 25;
      }
      else{
        mbti_1 = null;
        System.out.println("Please dont break me. :(");
      }
      
      System.out.println("Are you practical or imaginative? Please respond with 's' for practical and 'n' for imaginative.");
      String sOrN = mbti_scanner.nextLine();
      if (sOrN.charAt(1) = 'n'){
        mbti_2 = 75;
      }
      else if (sOrN.charAt(1) = 's'){
        mbti_2 = 25;
      }
      else{
        mbti_2 = null;
        System.out.println("Please dont break me. :(");
      }

      System.out.println("Are you logically based in your thinking? Or do you follow your heart? Put 't' for logically thinking and 'f' for following your heart");
      String tOrF = mbti_scanner.nextLine();
      if (tOrF.charAt(1) = 't'){
        mbti_3 = 75;
      }
      else if (tOrF.charAt(1) = 'f'){
        mbti_3 = 25;
      }
      else{
        mbti_3 = null;
        System.out.println("Please dont break me. :(");
      }

      System.out.println("Are you very rule orientied or do you prefer flexible rules?Please input 'j' for rule oriented and 'p' for prefering flexible rules");
      String jOrP = mbti_scanner.nextLine();
      if (jOrP.charAt(1) = 'j'){
        mbti_4 = 75;
      }
      else if (jOrP.charAt(1) = 'p'){
        mbti_4 = 25;
      }
      else{
        mbti_4 = null;
        System.out.println("Please dont break me. :(");
      }
  }
}
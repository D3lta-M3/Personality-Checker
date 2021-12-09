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
    
    if (yesOrNo.charAt(0) == 'n'){
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
        mbti_1 = 200;
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
        mbti_2 = 200;
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
        mbti_3 = 200;
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
        mbti_4 = 200;
        System.out.println("Please dont break me. :(");
      }
      if ((mbti_1 == 200 || mbti_1 > 100 || mbti_1 < 0) ||
      (mbti_2 == 200 || mbti_2 > 100 || mbti_2 < 0) ||
      (mbti_3 == 200 || mbti_3 > 100 || mbti_3 < 0) ||
      (mbti_4 == 200 || mbti_4 > 100 || mbti_4 < 0)){
        // data invalid
        System.out.println("Data was invalid, please try again");
      }

      else {
        // data valid
        if (mbti_1 > 50){
          // i _ _ _
          if (mbti_2 > 50){
            //i n _ _
            if (mbti_3 >50){
              //i n t _
              if (mbti_4 > 50){
                //i n t j
                updateMBTI("intj");
              }
              else {
                //i n t p
                updateMBTI("intp");
              }
            }
            else{
              //i n s _
              if (mbti_4 > 50){
                //i n s j
                updateMBTI("insj");
              }
              else {
                //i n s p
                updateMBTI("insp");
              }
            }

          }
          else{
            //i f _ _
            if (mbti_3 >50){
              //i f t _
              if (mbti_4 > 50){
                //i f t j
                updateMBTI("iftj");
              }
              else {
                //i f t p
                updateMBTI("iftp");
              }
            }
            else{
              //i f s _
              if (mbti_4 > 50){
                //i f s j
                updateMBTI("ifsj");
              }
              else {
                //i f s p
                updateMBTI("ifsp");
              }
            }

          }
        }
        else{
          // e _ _ _
          if (mbti_2 > 50){
            // e n _ _
            if (mbti_3 >50){
              // e n t _
              if (mbti_4 > 50){
                // e n t j
                updateMBTI("entj");
              }
              else {
                // e n t p
                updateMBTI("entp");
              }
            }
            else{
              // e n s _
              if (mbti_4 > 50){
                // e n s j
                updateMBTI("ensj");
              }
              else {
                // e n s p
                updateMBTI("ensp");
              }
            }

          }
          else{
            // e f _ _
            if (mbti_3 >50){
              // e f t _
              if (mbti_4 > 50){
                // e f t j
                updateMBTI("eftj");
              }
              else {
                // e f t p
                updateMBTI("eftp");
              }
            }
            else{
              // e f s _
              if (mbti_4 > 50){
                // e f s j
                updateMBTI("efsj");
              }
              else {
                // e f s p
                updateMBTI("efsp");
              }
            }
          }
        }
      }
    }

    else if (yesOrNo.charAt(0) == 'y'){
      Scanner mbti_result = new Scanner(System.in);
      System.out.println("What is your personality type? Please make sure that all 4 letters are lowercase and all together.");
      String mbti_result_string = mbti_result.nextLine();
      //stores data
      updateMBTI(mbti_result_string);
    }
  }
}
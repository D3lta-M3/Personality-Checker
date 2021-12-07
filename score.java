public class score{
  private String mbti;
  private int ricepure;

  public score(String m, int r){
    mbti = m;
    ricepure = r;
  }

  public void updateRice(int r){
    if (r > 100){
    }
    else if (r < 0){
    }
    else{
      ricepure = r;
    }
  }

  public int getRice(){
    return ricepure;
  }

  public void updateMBTI(String m){
    if (
    ((m.charAt(0) == 'i') || (m.charAt(0) == 'e')) && 
    ((m.charAt(1) == 'n') || (m.charAt(1) == 's')) &&
    ((m.charAt(2) == 't') || (m.charAt(2) == 'f')) &&
    ((m.charAt(3) == 'j') || (m.charAt(3) == 'p'))){
      // valid data input
      if (m.charAt(0) == 'i'){
        // i _ _ _
        if (m.charAt(1) == 'n'){
          // i n _ _
          if (m.charAt(2) == 't'){
            // i n t _
            if (m.charAt(3) == 'j'){
              // i n t j
              mbti = "intj";
            }
            else {
              // i n t p
              mbti = "intp";
            }
          }
          else{
            // i n f _
            if (m.charAt(3) == 'j'){
              // i n f j
              mbti = "infj";
            }
            else {
              // i n f p
              mbti = "infp";
            }
          }
        }
        else{
          // i s _ _
          if (m.charAt(2) == 't'){
            // i s t _
            if (m.charAt(3) == 'j'){
              // i s t j
              mbti = "istj";
            }
            else {
              // i s t p
              mbti = "istp";
            }
          }
          else{
            // i s f _
            if (m.charAt(3) == 'j'){
              // i s f j
              mbti = "isfj";
            }
            else {
              // i s f p
              mbti = "isfp";
            }
          }
        }
      }
      else{
        // e _ _ _
        if (m.charAt(1) == 'n'){
          // e n _ _
          if (m.charAt(2) == 't'){
            // e n t _
            if (m.charAt(3) == 'j'){
              // e n t j
              mbti = "entj";
            }
            else {
              // e n t p
              mbti = "entp";
            }
          }
          else{
            // e n f _
            if (m.charAt(3) == 'j'){
              // e n f j
              mbti = "enfj";
            }
            else {
              // e n f p
              mbti = "enfp";
            }
          }
        }
        else{
          // e s _ _
          if (m.charAt(2) == 't'){
            // e s t _
            if (m.charAt(3) == 'j'){
              // e s t j
              mbti = "estj";
            }
            else {
              // e s t p
              mbti = "estp";
            }
          }
          else{
            // e s f _
            if (m.charAt(3) == 'j'){
              // e s f j
              mbti = "esfj";
            }
            else {
              // e s f p
              mbti = "esfp";
            }
          }
        }
      }
    }
    else {
      // invalid data input
    }
  }
}
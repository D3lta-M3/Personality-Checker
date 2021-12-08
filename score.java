public class score{
  private String mbti;
  private int ricepure;

  public score(String m, int r){
    mbti = m;
    ricepure = r;
  }

  public void updateRice(int r){
    if (r > 100){
      System.out.println("Invalid data type");
    }
    else if (r < 0){
      System.out.println("Invalid data type");
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
    ((m.charAt(3) == 'j') || (m.charAt(3) == 'p')) &&
    (m.length() == 4)){
      // valid data input
      mbti = m;
    }
    else {
      // invalid data input
      System.out.println("Invalid data. Make sure to use lowercase");
    }
  }

  public String getMBTI(){
    return mbti;
  }
}
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
        if (m.charAt(1) == 'n'){

        }
        else{

        }
      }
      else {
        if (m.charAt(1) == 'n'){

        }
        else{
          
        }
      }
    }
    else {
      System.out.println("Please retry again and give the data in lowercase");
    }
  }
}
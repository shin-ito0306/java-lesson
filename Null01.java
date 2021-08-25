public class Null01 {
  public static void main(String[] args) {
    String str1;
    str1 = "あいう";
    System.out.println(str1 + "の文字数" + str1.length());
    
    str1 = "";
    System.out.println(str1 + "の文字数" + str1.length());
    
    str1 = null;
    System.out.println(str1 + "の文字数" + str1.length());
    
  }
}
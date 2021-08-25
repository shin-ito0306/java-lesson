public class Chapter08 {
  public static void main(String[] args) {
    int num = 1;
    while (num < 5) {
      System.out.println(num * num);
      num++;
    }
    
    int[] array = {10, 20, 30, 40};
    for (int for_num = 0; for_num < array.length; for_num++) {
      System.out.println(array[for_num]);
    }
    
    for (int number : array) {
      if (number % 2 == 0) {
        continue;
      } else {
        System.out.println(number);
      }
    }
    
  }
}
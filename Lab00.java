import static java.lang.Character.charCount;

public class Lab00
{
   public static void main(String[] args) {
      int x = 5;
      String y = "hello";
      double z = 9.8;

      System.out.println("x: " + x + " y: " + y + " z: " + z);

      //a list(make an array in java)
      int[] nums = {3, 6, -1, 2};
      for (int i = 0; i < nums.length; i++) {
         System.out.println(nums[i]);
      }

      //call a function
      int numFound = charCount(y, 'l');
      System.out.println("Found: " + numFound);

      //counting a loop
      for (int h = 1; h <= 11; h++){
         System.out.println(h + "\n");
      }
   }
      //function
      public static int charCount(String s, char c){
         int count = 0;
         for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == c){
               count += 1;
            }
         }
         return count;

      }

}

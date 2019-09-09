public class TestArray {

  public static void main(String[] args) {
    int[] numbers = new int[]{5,3,4,1,9};
    printArray(numbers);
    printArray(null);
    printArray(new int[0]);
  }

  private static void printArray(int[] nums) {
    if (nums == null) {
      System.out.println("null");
    } else {
      System.out.println("Length of parameter nums: " + nums.length);
      for (int i = 0; i < nums.length; i++) {
        System.out.println("nums[" + i + "]: " + nums[i]);
      }
    }
  }
}

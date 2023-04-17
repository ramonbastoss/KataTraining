public class LandPerimiter {

  public static String landPerimeter(String[] arr) {
    // this will be incremented
    int perimeter = 0;

    for (int j = 0; j < arr.length; j++) {
      for (int i = 0; i < arr[j].length(); i++) {
        if (arr[j].charAt(i) == 'X') {
          perimeter += 4;
          if (i > 0 && arr[j].charAt(i - 1) == 'X') {
            perimeter--;
          }
          if (i < arr[j].length() - 1 && arr[j].charAt(i + 1) == 'X') {
            perimeter--;
          }
          if (j > 0 && arr[j - 1].charAt(i) == 'X') {
            perimeter--;
          }
          if (j < arr.length - 1 && arr[j + 1].charAt(i) == 'X') {
            perimeter--;
          }
        }
      }
    }
    return "Total land perimeter: " + perimeter;
  }

  public static void main(String[] args) {
    String x = LandPerimiter.landPerimeter(new String[] {
        "OXOOOX",
        "OXOXOO",
    });
    System.out.println(x);
  }
}
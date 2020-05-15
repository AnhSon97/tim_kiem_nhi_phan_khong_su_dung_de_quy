 public class BinarySearch {
        static int[] list = {1, 2, 3, 6, 5, 4};

        static int SearchBinary(int key, int[] list) {
            int low = 0;
            int high = (list.length - 1);

            while (high >= low) {
                int mid = (high - low)/2;
                if (key > list[mid]) {
                    low = mid + 1;
                } else if (key == list[mid]) {
                    return mid;
                }
                high = mid - 1;
            }
            return -1;
        }

     public static void main(String[] args) {
         System.out.println("show index");
         System.out.println(SearchBinary(10,list));
     }
}


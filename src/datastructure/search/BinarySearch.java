package datastructure.search;

public class BinarySearch {

    public static boolean binarySearch(int a[], int n) {
        if (a == null || a.length == 0)
            return false;
        int low = 0;
        int high = a.length - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) >> 1;
            if (a[mid] < n)
                low = mid + 1;
            else if (a[mid] > n)
                high = mid - 1;
            else
                break;
        }
        if (a[mid] == n)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(binarySearch(a, 7));

        int b[] = {3,3,3,3,4,5};

        System.out.println(GetNumberOfK(b , 3));
    }

    public static int GetNumberOfK(int [] array , int k) {
        if(array.length == 0 || array == null)
            return 0;
        int high = array.length - 1;
        int low = 0;
        int mid = 0;
        int start = getStart(array, low, high, mid, k);
        int end = getEnd(array, low, high, mid, k);
        int result = end - start + 1;
        System.out.println(start);
        System.out.println(end);
        if(start < 0 || end < 0)
            return 0;
        else
            return result;
    }

    public static int getStart(int array[], int low, int high, int mid, int k){
        while(low <= high && low >= 0){
            mid = (low + high) >> 1;
            if(array[mid] > k)
                high = mid - 1;
            else if(array[mid] < k)
                low = mid + 1;
            else if(array[mid] == k && mid > 0 && array[mid - 1] < k)
                return mid;
            else
                high = mid - 1;
        }
        if(mid == 0 && array[mid] == k)
            return mid;
        else return -1;
    }
    public static int getEnd(int array[], int low, int high, int mid, int k){
        while(low <= high && low >= 0){
            mid = (low + high) >> 1;
            if(array[mid] > k)
                high = mid - 1;
            else if(array[mid] < k)
                low = mid + 1;
            else if(array[mid] == k && mid < array.length - 1 && array[mid + 1] > k)
                return mid;
            else
                low = mid + 1;
        }
        if(mid == array.length - 1 && array[mid] == k)
            return mid;
        else return -1;
    }
}

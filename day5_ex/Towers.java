public class Towers {

    public static int getMax(int[] arr) {
        int max = -9999;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int getMin(int[] arr) {
        int min = 9999;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int getDifference(int[] arr) {
        return getMax(arr) - getMin(arr);
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 15, 10};
        int k = 1;
        int mid = (getMax(arr)+getMin(arr))/2;
        int mindiff = getDifference(arr);
        int temp[] = arr.clone();
        while (true) {
            for (int i=0; i<temp.length; i++) {
                if (temp[i] >= mid) {
                    temp[i] -= k;
                }
                else {
                    temp[i] += k;
                }
            }
            int diff = getDifference(temp);
            if (diff < mindiff) {
                mindiff = diff;
                temp = arr.clone();
                k += 1;
            }
            else {
                k -= 1;
                break;
            }
        }
        System.out.println("k value: " + k);
    }
}

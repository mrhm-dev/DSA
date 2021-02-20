package dsa.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayRotation {
    /**
     * <h1>TempArrayRotation</h1>
     * <p>
     *     This method will use an temporary array to store rotated array.
     *     Then shift last elements and replace elements with temp array.
     *     <strong>Time Complexity: O(n)</strong>
     *     <strong>Auxiliary Space: O(d)</strong>
     * </p>
     * @param arr array to be rotate
     * @param n length of the given array
     * @param d rotate d amount of times
     */
    public static int[] tempArrayRotation(int [] arr, int n, int d) {
        /**
         * Fill the temporary array with rotate array elements
         */
        int [] temp = new int[d];
        for (int i=0; i<d; i++) {
            temp[i] = arr[i];
        }
        /**
         * Shift last elements to left
         */
        for (int i=d; i<n; i++) {
            arr[i-d] = arr[i];
        }
        /**
         * Restore the rotate elements from temp
         */
        int start = n-d;
        for (int i=start; i<n; i++) {
            arr[i] = temp[i-start];
        }
        return arr;
    }

    /**
     * <h1>TempArrayRotationRight</h1>
     * <p>
     *     This method will use an temporary array to store rotated array.
     *     Then shift last elements and replace elements right with temp array.
     *     <strong>Time Complexity: O(n)</strong>
     *     <strong>Auxiliary Space: O(d)</strong>
     * </p>
     * @param arr array to be rotate
     * @param n length of the given array
     * @param d rotate d amount of times
     * @return rotated array
     */
    public static int[] tempArrayRotationRight(int[] arr, int n, int d) {
        /**
         * Fill the temporary array with rotate array elements
         */
        int [] temp = new int[d];
        for (int i=n-1, j=0; i>=n-d; i--) {
            temp[j++] = arr[i];
        }
        /**
         * Shift first elements to Right
         */
        for (int i=n-d-1, j=n-1; i>=0; i--) {
            arr[j--] = arr[i];
        }
        /**
         * Restore the rotate elements from temp
         */
        for (int i=0; i<d; i++) {
            arr[i] = temp[i];
        }
        return arr;
    }

    /**
     * <h1>OneByOneRotation</h1>
     * <p>
     *     This method will rotate array for a given array, length and rotation amount
     *     Algorithm:
     *        leftRotate(arr[], d, n)
     *          start
     *          For i = 0 to i < d
     *              Left rotate all elements of arr[] by one
 *          end
     *      <strong>Time Complexity: O(n*d)</strong>
     *      <strong>Auxiliary Space: O(1)</strong>
     * </p>
     * @param arr array to be rotate
     * @param n length of the given array
     * @param d rotate d amount of times
     * @return rotated array
     */
    public static int[] oneByOneRotation(int [] arr, int n, int d) {
        for (int i=0; i<d; i++) {
            rotateByOne(arr, n);
        }
        return arr;
    }

    private static void rotateByOne(int [] arr, int n) {
        int temp = arr[0];
        for (int i=0; i<n-1; i++) {
            arr[i] = arr[i+1];
        }
        arr[n-1] = temp;
    }

    /**
     * <h1>JugglingRotation</h1>
     * <p>
     *     This method will rotate array for a given array, length and rotation amount
     *     Algorithm:
     *        Let arr[] be {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}
     *        a) Elements are first moved in first set – (See below diagram for this movement)
     *        arr[] after this step --> {4 2 3 7 5 6 10 8 9 1 11 12}
     *        b) Then in second set.
     *           arr[] after this step --> {4 5 3 7 8 6 10 11 9 1 2 12}
     *
     *        c) Finally in third set.
     *           arr[] after this step --> {4 5 6 7 8 9 10 11 12 1 2 3}
     *      <strong>Time Complexity: O(n)</strong>
     *      <strong>Auxiliary Space: O(1)</strong>
     * </p>
     * @param arr array to be rotate
     * @param n length of the given array
     * @param d rotate d amount of times
     * @return rotated array
     */
    private static int[] jugglingRotation(int arr[], int n, int d) {
        d = d%n;
        int i, j, k, temp;
        int gcdValue = gcd(d, n);

        for (i=0; i<gcdValue; i++) {
            temp = arr[i];
            j = i;
            while (true) {
                k = j+d;
                if (k >= n) {
                    k = k-n;
                }
                if (k==i) break;
                arr[j] = arr[k];
                j = k;
            }
            arr[j] = temp;
        }

        return arr;
    }

    private static int gcd(int a, int b) {
        if (b == a) {
            return a;
        }
        return gcd(b, a%b);
    }
}

import dsa.arrays.ArrayRotation;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main Method");

//        Array Rotation Left
        int [] arr = {1, 2, 3, 4, 5, 6, 7};
        ArrayRotation.tempArrayRotation(arr, arr.length, 2);
        System.out.println(Arrays.toString(arr));

//        Array Rotation Right
        int [] arr2 = {1, 2, 3, 4, 5, 6, 7};
        ArrayRotation.tempArrayRotationRight(arr2, arr2.length, 3);
        System.out.println(Arrays.toString(arr2));

//        One by One Array Rotation
        int [] arr3 = {1, 2, 3, 4, 5, 6, 7};
        ArrayRotation.oneByOneRotation(arr3, arr3.length, 2);
        System.out.println(Arrays.toString(arr3));

//        Juggling Array Rotation
        int [] arr4 = {1, 2, 3, 4, 5, 6, 7};
        ArrayRotation.oneByOneRotation(arr4, arr4.length, 2);
        System.out.println(Arrays.toString(arr4));
    }
}

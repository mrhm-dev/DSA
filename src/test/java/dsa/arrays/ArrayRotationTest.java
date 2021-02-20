package dsa.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayRotationTest {

    @Test
    void tempArrayRotation() {
        int [] arr = {1, 2, 3, 4};
        ArrayRotation.tempArrayRotation(arr, arr.length, 1);
        // Length test
        assertEquals(4, arr.length);
        // first element should be the last element
        assertEquals(1, arr[arr.length-1]);
        // last element should the first element
        assertEquals(4, arr[0]);
    }

    @Test
    void tempArrayRotationRight() {
        int [] arr = {1, 2, 3, 4};
        ArrayRotation.tempArrayRotationRight(arr, arr.length, 2);

//        assert array length
        assertEquals(4, arr.length);
//        assert first element
        assertEquals(4, arr[0]);
//        assert second element
        assertEquals(3, arr[1]);
//        assert last element
        assertEquals(2, arr[arr.length-1]);
//        assert second last element
        assertEquals(1, arr[arr.length-2]);
    }
}
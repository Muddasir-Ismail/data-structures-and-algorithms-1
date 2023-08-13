/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package array.binary.search;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void sendEmptyArray_binarySearch() {
        App sut = new App();
        int[] actual = {};
        assertEquals(-1,sut.binarySearch(actual,15));
    }
    @Test void sendDuplicatedValues_binarySearch_Return_middle() {
        App sut = new App();
        int [] actual = {1,1,1,1,1,1};
        assertEquals(2,sut.binarySearch(actual,1));
    }

    @Test void sendSortedArray_binarySearch_ReturnIndex() {
        App sut = new App();
        int [] sortedArray = {15,20,25,30,35,40,45,50};
        assertEquals(6,sut.binarySearch(sortedArray, 45));
    }
}
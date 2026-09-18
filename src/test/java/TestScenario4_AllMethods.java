import Scenario4_AllMethods.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestScenario4_AllMethods {

    /* GIVEN EXAMPLE – After adding two items, getCurrentSize() should return 2 */
    @Test
    public void testGetCurrentSizeAfterTwoAdds() {
        LinkedBag bag = new LinkedBag();
        bag.addNewEntry(new Building("1 High St", "Owner1"));
        bag.addNewEntry(new Building("2 High St", "Owner2"));
        assertEquals(2, bag.getCurrentSize());
    }

    /* Task 1 (similar) – Add three items, then verify getCurrentSize() returns 3 */
    @Test
    public void task1_GetCurrentSizeAfterThreeAdds() {
        // TODO: verify size is 3 using assertEquals
    }

    /* Task 2 – addNewEntry() should return true */
    @Test
    public void task2_AddNewEntryReturnsTrue() {
        // TODO: verify addNewEntry returns true using assertTrue
    }

    /* Task 3 – toString() should return a non-null String containing "Bag:" */
    @Test
    public void task3_ToStringNotNullAndContainsBagHeader() {
        // TODO: assertNotNull on the returned string
        // TODO: assertTrue that it contains "Bag:"
    }

    /* Task 4 – remove() should return null when the bag is empty */
    @Test
    public void task4_RemoveReturnsNullWhenEmpty() {
        // TODO: verify it returns null using assertNull
    }

    /* Task 5 – remove(anEntry) should return false when the entry is not present */
    @Test
    public void task5_RemoveSpecificReturnsFalseWhenNotFound() {
        // TODO: verify remove(anEntry) returns false using assertFalse
    }

    /* Task 6 – isEmpty() should return true for a new bag */
    @Test
    public void task6_IsEmptyTrueWhenNew() {
        // TODO: verify isEmpty() returns true using assertTrue
    }

    /* Task 7 – clear() should make the bag empty (size 0) */
    @Test
    public void task7_ClearEmptiesBag() {

        // TODO: verify size is 0 using assertEquals
    }

    /* Task 8 – getFrequencyOf() should count duplicates */
    @Test
    public void task8_GetFrequencyOfCountsDuplicates() {
        // TODO: verify getFrequencyOf returns 2 using assertEquals
    }

    /* Task 9 – contains() should return true when an entry exists */
    @Test
    public void task9_ContainsReturnsTrueWhenPresent() {
        // TODO: verify contains returns true using assertTrue
    }
}


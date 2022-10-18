import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LeapYearTest {
    //Test to check if LeapYear
    @Test
    public void TheYear_DividedBy4AndNot100_IsLeapYear(){
        assertTrue(LeapYear.isLeapYear(2024));
    }
    //Test to check if LeapYear
    @Test
    public void TheYear_DividedBy400_IsLeapYear(){
        assertTrue(LeapYear.isLeapYear(2000));
    }
    //Test to check if LeapYear
    @Test
    public void TheYear_DividedBy400ButNot4000_IsLeapYear(){
        assertTrue(LeapYear.isLeapYear(6000));
    }

    //Test to check if not LeapYear
    @Test
    public void TheYear_NotDividingBy4_NotLeapYear(){
    assertFalse(LeapYear.isLeapYear(1881));
    }
    //Test to check if not LeapYear
    @Test
    public void TheYear_DividedBy100ButNot400_NotLeapYear(){
        assertFalse(LeapYear.isLeapYear(1700));
    }
    //Test to check if not LeapYear
    @Test
    public void TheYear_DividedBy4000_NotLeapYear(){
        assertFalse(LeapYear.isLeapYear(8000));
    }

}
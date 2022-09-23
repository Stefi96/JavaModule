import main.SimpleCalc;
import main.Solution;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void count_letter() {
        System.out.println("Poceo test");
        Assertions.assertEquals(1, Solution.count_letter("stefan","a"));
    }

    @Test
    void testCalc() {
        System.out.println("Poceo test");
        Assertions.assertEquals(2, SimpleCalc.simpleCalcToTest(1,1));
    }

    @AfterEach
    void kraj() {
        System.out.println("Test gotov");
    }
}
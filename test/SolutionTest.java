import main.CalcTester;
import main.Solution;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.Result;
import org.junit.runner.JUnitCore;
import org.junit.runner.notification.Failure;

class SolutionTest {

    @Test
    void count_letter() {
        System.out.println("Poceo test brojanja slova");
        Assertions.assertEquals(1, Solution.count_letter("stefan","a"));
    }

//    @Test
//    void testCalcAdd() {
//        System.out.println("Poceo test kalkulatora (sabiranje)");
//        //Assertions.assertEquals(2, calcService.add(1,1));
//    }

    void testCalc(){
        System.out.println("Poceo test kalkulatora sa mock");

        Result result = JUnitCore.runClasses(CalcTester.class);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println(result.wasSuccessful());
    }

    @AfterEach
    void kraj() {
        System.out.println("Test gotov");
    }
}
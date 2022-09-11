import junit.framework.TestCase;
import org.junit.Test;

public class ExerciseTest extends TestCase  {

    /**
     * Tests if method extractUpperAndSpecial returns every Nth character from that text that is uppercase
     */
    @Test
    public void testExtractUpperAndSpecial(){

        Exercise exercise = new Exercise();

        assertEquals("!CL1N",exercise.extractUpperAndSpecial("!tCL1Nical", 1));


    }

}
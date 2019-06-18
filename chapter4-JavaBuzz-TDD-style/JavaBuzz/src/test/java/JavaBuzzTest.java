import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class JavaBuzzTest {
    @Test
    public void addsTwoNumbersTogether() {
        JavaBuzz example = new JavaBuzz();
        int answer = example.add(2,3);
        assertEquals(answer, 5);
    }
}

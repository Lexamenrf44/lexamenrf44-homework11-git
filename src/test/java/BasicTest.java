import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BasicTest {

    @Test
    @DisplayName("Тестирование 3 > 2")
    public void test1() {
        Assertions.assertTrue(3 > 2);

    }

    @Test
    @DisplayName("Тестирование 4 > 2")
    public void test2() {
        Assertions.assertTrue(4 > 2);

    }

    @Test
    @DisplayName("Тестирование 5 > 2")
    public void test3() {
        Assertions.assertTrue(5 > 2);

    }

    @Test
    @DisplayName("Тестирование 6 > 3")
    public void test4() {
        Assertions.assertTrue(5 > 2);

    }
    // comment here
}

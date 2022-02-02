import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BasicTest {

    @Test
    @DisplayName("Тестирование 2 > 1")
    public void test1() {
        Assertions.assertTrue(2 > 1);

    }

    @Test
    @DisplayName("Тестирование 3 > 1")
    public void test2() {
        Assertions.assertTrue(3 > 1);

    }

    @Test
    @DisplayName("Тестирование 4 > 1")
    public void test3() {
        Assertions.assertTrue(4 > 1);

    }

    @Test
    @DisplayName("Тестирование 5 > 1")
    public void test4() {
        Assertions.assertTrue(5 > 1);

    }

}

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BasicTest {

    @Test
    @DisplayName("Тестирование 3 > 2")
    public void test() {
        Assertions.assertTrue(3 > 2);

    }

}

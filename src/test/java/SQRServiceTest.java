import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.sqr.SQRService;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/sqr.csv")
    //@CsvSource({"3, 200, 300", "2, 100, 121", "0, 101, 120", "9, 100, 350"})
    public void testSQR(int expected, int start, int finish) {
        SQRService service = new SQRService();

        int actual = service.calculate(start, finish);

        assertEquals(expected, actual);
    }

    // вариант непараметризованного теста
    // @Test

    //void ShouldCalculateCount () {
    // SQRService service = new SQRService();

    //int expected = 3;
    // int start = 200;
    //int finish = 300;
    // int actual = service.calculate(start, finish);

    // assertEquals(expected, actual);
    // }

}

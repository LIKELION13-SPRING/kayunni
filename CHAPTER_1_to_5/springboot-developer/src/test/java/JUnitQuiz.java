import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class JUnitQuiz {
    @DisplayName("이름 비교")
    @Test
    public void junitQuiz1() {
        String name1 = "홍길동";
        String name2 = "홍길동";
        String name3 = "홍길은";

        assertThat(name1).isNotNull();
        assertThat(name2).isNotNull();
        assertThat(name3).isNotNull();

        assertThat(name1).isEqualTo(name2);
        assertThat(name1).isEqualTo(name3);
    }

    @DisplayName("숫자 비교")
    @Test
    public void junitQuiz2() {
        int num1 = 15;
        int num2 = 0;
        int num3 = -5;
        assertThat(num1).isPositive();
        assertThat(num2).isEqualTo(0);
        assertThat(num3).isNegative();
        assertThat(num1).isGreaterThan(num2);
        assertThat(num3).isLessThan(num2);
    }

    @BeforeEach
    public void before() {
        System.out.println("Hello!");
    }
    @Test
    public void junitQuiz3() {
        System.out.println("This is first test");
    }
    @Test
    public void junitQuiz4() {
        System.out.println("This is second test");
    }
    @AfterAll
    public static void afterAll() {
        System.out.println("Bye!");
    }

}

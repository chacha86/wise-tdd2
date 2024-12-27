import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AppTest {

    @Test
    @DisplayName("== 명언 앱 ==")
    void t1() {
        String out = MockApp.run("""
                """);

        assertThat(out).isEqualTo("""
                == 명언 앱 ==
                """);
    }

    @Test
    @DisplayName("== 종료 ==")
    void t2() {
        String out = MockApp.run("""
                종료
                """);
        assertThat(out).isEqualTo("""
                == 명언 앱 ==
                명언앱을 종료합니다.
                """);
    }

    @Test
    @DisplayName("== 등록 ==")
    void t3() {
        String out = MockApp.run("""
                종료
                """);
        assertThat(out).isEqualTo("""
                == 명언 앱 ==
                명언앱을 종료합니다.
                """);
    }
}

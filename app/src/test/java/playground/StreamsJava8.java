package playground;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsJava8 {

    @Test
    void map() {
        List<Integer> squares = Stream.of(1, 2, 4)
                .map(integer -> integer * integer)
                .collect(Collectors.toList());
        assertThat(squares).containsExactly(1, 4, 16);

    }
}

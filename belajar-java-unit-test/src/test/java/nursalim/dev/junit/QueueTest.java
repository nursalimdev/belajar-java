package nursalim.dev.junit;

import org.junit.jupiter.api.*;

import java.util.LinkedList;
import java.util.Queue;

@DisplayName("A queue")
public class QueueTest {
    private Queue<String> queue;

    @Nested
    @DisplayName("When new")
    public class WhenNew {
        @BeforeEach
        void setUp() {
            queue = new LinkedList<>();
        }

        @Test
        @DisplayName("When offer, size must be 1")
        public void offerNewData() {
            queue.offer("Nursalim");
            Assertions.assertEquals(1, queue.size());
        }

        @Test
        @DisplayName("When offer 2, size must be 2")
        public void offerMoreData() {
            queue.offer("Ziah");
            queue.offer("Naura");

            Assertions.assertEquals(2, queue.size());
        }
    }
}

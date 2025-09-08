import deque.ArrayDeque61B;

import jh61b.utils.Reflection;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.util.List;

import static com.google.common.truth.Truth.assertThat;
import static com.google.common.truth.Truth.assertWithMessage;

public class ArrayDeque61BTest {

     @Test
     @DisplayName("ArrayDeque61B has no fields besides backing array and primitives")
     void noNonTrivialFields() {
         List<Field> badFields = Reflection.getFields(ArrayDeque61B.class)
                 .filter(f -> !(f.getType().isPrimitive() || f.getType().equals(Object[].class) || f.isSynthetic()))
                 .toList();

         assertWithMessage("Found fields that are not array or primitives").that(badFields).isEmpty();
     }

     @Test
     void testAddFirstAndAddLastAndGet(){
         ArrayDeque61B<String> deque = new ArrayDeque61B<>();

        deque.addLast("a");  // [a]
        deque.addLast("b");  // [a, b]
        deque.addFirst("c"); // [a, b, c]
        deque.addLast("d");  // [a, b, d, c]

        int count = deque.count;
        assertThat(count).isEqualTo(4);

        deque.addLast("e");  // [a, b, d, e, c]
        deque.addFirst("f"); // [a, b, d, e, f, c]
        deque.addLast("g");  // [a, b, d, e, g, f, c]
        deque.addLast("h");  // [a, b, d, e, g, h, f, c]

         String item = deque.get(7); //c
         assertThat(item).isEqualTo("c");

         int size = deque.size();//8
         assertThat(size).isEqualTo(8);

    }

}

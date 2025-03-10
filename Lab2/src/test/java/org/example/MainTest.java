package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import com.google.common.collect.Lists;

public class MainTest {

    @Test
    void testListNotEmpty() {
        List<String> items = Lists.newArrayList("Ferrari", "Mustang", "Lamborghini");
        assertFalse(items.isEmpty(), "List should not be empty");
    }

    @Test
    void testListSize() {
        List<String> items = Lists.newArrayList("Ferrari", "Mustang", "Lamborghini");
        assertEquals(3, items.size(), "List should contain 3 items");
    }
}

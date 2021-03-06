package com.jsoniter;

import com.jsoniter.annotation.JsonIgnore;
import junit.framework.TestCase;

import java.io.IOException;

public class TestAnnotationJsonIgnore  extends TestCase {

    public static class TestObject1 {
        @JsonIgnore
        public int field2;
    }

    public void test_ignore() throws IOException {
        JsonIterator iter = JsonIterator.parse("{'field2': 100}".replace('\'', '"'));
        TestObject1 obj = iter.read(TestObject1.class);
        assertEquals(0, obj.field2);
    }
}

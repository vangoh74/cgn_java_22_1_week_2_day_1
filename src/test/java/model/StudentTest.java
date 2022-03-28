package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    Student pedro = new Student("Pedro", 123);
    Student ana = new Student("Ana", 12);
    Student alan = pedro;
    @Test
    void testEquals_whenPedroEqualsAnaThan_ShouldReturnFalse() {
        assertFalse(pedro.equals(ana));
    }
    @Test
    void testEquals_whenPedroEqualsAlanThan_ShouldReturnTrue() {
        assertTrue(alan.equals(pedro));
    }
}
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RemoveAFromStringTest {
/*
 * Remove ‘A’ if it is present in first 2 characters of the string.
    if ‘A’ is present after 2 characters, it should not be removed.
    Ex: 1.“ABCD” => “BCD”
        2.“AACD” => “CD” 
        3.“BACD” => “BCD”
        4.“BBAA” => “BBAA”       
        5.“AABAA” => “BAA”
 */
    RemoveAFromString remove;
    @BeforeEach
    void before() {
     remove=new RemoveAFromString();
    }
    @Test
    void test1()
    {
        assertEquals("BCD", remove.removeA("ABCD"));
    }
    
    void test2()
    {
        assertEquals("CD", remove.removeA("AACD"));
    }
    
    @Test
    void test3()
    {
        assertEquals("BCD", remove.removeA("BACD"));
    }
    @Test
    void testNull()
    {
        assertEquals("BBAA", remove.removeA("BBAA"));
    }
    @Test
    void test4()
    {
        assertEquals("BAA", remove.removeA("AABAA"));
    }
    
}

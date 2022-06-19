package com.wiryaimd.codechallenge;

import com.wiryaimd.codechallenge.leetcode.LengthLastWord;
import com.wiryaimd.codechallenge.leetcode.LengthOfLongestSubstring;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.DisabledIf;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @BeforeAll
    public static void beforeAll(){
        System.out.println("awokawoa kon");
    }

    @BeforeEach
    public void beforeE(){
        System.out.println("ngewong dulu ngap");
    }

    @AfterEach
    public void afterE(){
        System.out.println("hiyaaa hayuu");
    }

//    @CsvSource()
    @Test
    public void test(){
        LengthOfLongestSubstring lols = new LengthOfLongestSubstring();

        assertEquals(lols.lengthOfLongestSubstring("abcabcbb"), 3);
        assertEquals(lols.lengthOfLongestSubstring("bbbbb"), 1);
        assertEquals(lols.lengthOfLongestSubstring("dvdff"), 3, "iyah");

    }

//    @Disabled // ignore test
//    @DisabledIf()
    @Test
    public void test2(){
        LengthLastWord lengthLastWord = new LengthLastWord();

        assertEquals(lengthLastWord.lengthLastWord("jadi gini le kont aowkawokwa hiyaa"), 5);
        assertEquals(lengthLastWord.lengthLastWord("menganjae ngap"), 4);
        assertEquals(lengthLastWord.lengthLastWord("menganjae palpaleee"), 9);
        assertEquals(lengthLastWord.lengthLastWord("menganjae palpaleee"), 1);
    }

}

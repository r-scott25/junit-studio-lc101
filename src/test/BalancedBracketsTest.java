package test;

import org.junit.Test;

import static org.junit.Assert.*;

import main.BalancedBrackets;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void stringInBracketsRetrunsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void splitStringBracektsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }
    @Test
    public void bracketAndStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    @Test
    public void balanceBracketWithNoBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test hasTwoBalancedBracketsReturnsTrue() {
    assertTrue(BalancedBrackets.hasBalancdedBrackets("[]LaunchCode[]"))
    }
}
    @Test
    public void oneOpeningBracketBeforeStringButNoClosingBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }
    @Test
    public void stringClosingBracketStringOpeningBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }
    @Test
    public void justOneOpenBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }
    @Test
    public void closeThenOpenBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
}

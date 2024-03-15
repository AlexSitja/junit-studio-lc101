package test;

import org.junit.Test;
import static org.junit.Assert.*;

public class BalancedBracketsTest {

    // Test per a una cadena amb claudàtors emparellats correctament
    @Test
    public void testBalancedBrackets() {
        assertTrue(BalancedBrackets.isBalanced("(){}[]"));
    }

    // Test per a claudàtors imbricats
    @Test
    public void testNestedBrackets() {
        assertTrue(BalancedBrackets.isBalanced("{[()]}"));
    }

    // Test per a claudàtors amb ordre incorrecte
    @Test
    public void testIncorrectBracketOrder() {
        assertFalse(BalancedBrackets.isBalanced("{[)}"));
    }

    // Test per a altres caràcters que no afecten l'avaluació
    @Test
    public void testOtherCharactersNotAffectEvaluation() {
        assertTrue(BalancedBrackets.isBalanced("abc(def)ghi[jkl]mno"));
    }

    // Test per a una cadena buida
    @Test
    public void testEmptyString() {
        assertTrue(BalancedBrackets.isBalanced(""));
    }

    // Test per a una cadena sense claudàtors
    @Test
    public void testNoBrackets() {
        assertTrue(BalancedBrackets.isBalanced("abcdefghi"));
    }

    // Test per a claudàtors incomplets
    @Test
    public void testIncompleteBrackets() {
        assertFalse(BalancedBrackets.isBalanced("{[(])}"));
    }

    // Test per a múltiples claudàtors
    @Test
    public void testMultipleBrackets() {
        assertTrue(BalancedBrackets.isBalanced("{[()]}"));
    }

    // Test per a claudàtors desequilibrats al principi
    @Test
    public void testUnbalancedBracketsAtStart() {
        assertFalse(BalancedBrackets.isBalanced("}{[]()}"));
    }

    // Test per a claudàtors desequilibrats al final
    @Test
    public void testUnbalancedBracketsAtEnd() {
        assertFalse(BalancedBrackets.isBalanced("{[()]}"));
    }

    // Test per a claudàtors desequilibrats al mig
    @Test
    public void testUnbalancedBracketsInMiddle() {
        assertFalse(BalancedBrackets.isBalanced("{[()]}{}"));
    }
}


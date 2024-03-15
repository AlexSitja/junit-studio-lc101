package test;

import org.junit.Test;
import main.BalancedBrackets;
import static org.junit.Assert.*;

public class BalancedBracketsTest {

    // Test per a una cadena amb claudàtors emparellats correctament
    @Test
    public void testBalancedBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("(){}[]"));
    }

    // Test per a claudàtors imbricats
    @Test
    public void testNestedBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("{[()]}"));
    }

    // Test per a claudàtors amb ordre incorrecte
    @Test
    public void testIncorrectBracketOrder() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("{[)}"));
    }

    // Test per a altres caràcters que no afecten l'avaluació
    @Test
    public void testOtherCharactersNotAffectEvaluation() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("abc(def)ghi[jkl]mno"));
    }

    // Test per a una cadena buida
    @Test
    public void testEmptyString() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(("")));
    }

    // Test per a una cadena sense claudàtors
    @Test
    public void testNoBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(("abcdefghi")));
    }

    // Test per a claudàtors incomplets
    @Test
    public void testIncompleteBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("{[(])}"));
    }

    // Test per a múltiples claudàtors
    @Test
    public void testMultipleBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("{[()]}"));
    }

    // Test per a claudàtors desequilibrats al principi
    @Test
    public void testUnbalancedBracketsAtStart() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("}{[]()}"));
    }

    // Test per a claudàtors desequilibrats al final
    @Test
    public void testUnbalancedBracketsAtEnd() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("{[()]}"));
    }

    // Test per a claudàtors desequilibrats al mig
    @Test
    public void testUnbalancedBracketsInMiddle() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("{[()]}{}"));
    }
}


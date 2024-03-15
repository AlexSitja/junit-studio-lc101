# Pla de Proves per a la Classe BalancedBrackets

A continuació, es detallen els casos de prova per a la classe `BalancedBrackets`.

1. Només els claudàtors tornen veritables
   - **Entrada:** "(){}[]"
   - **Sortida Esperada:** Cert
   - **Observació:** Tots els claudàtors estan emparellats adequadament.

2. Es permeten claudàtors imbricats
   - **Entrada:** "{[()]}"
   - **Sortida Esperada:** Cert
   - **Observació:** Els claudàtors estan imbricats correctament.

3. Els claudàtors han de seguir l'ordre d'obertura de tancament
   - **Entrada:** "{[)}"
   - **Sortida Esperada:** Fals
   - **Observació:** Els claudàtors no segueixen l'ordre correcte d'obertura i tancament.

4. Els altres caràcters no afecten l'avaluació
   - **Entrada:** "abc(def)ghi[jkl]mno"
   - **Sortida Esperada:** Cert
   - **Observació:** Només es consideren els claudàtors per a l'avaluació.

5. S'avalua correctament una cadena buida
   - **Entrada:** ""
   - **Sortida Esperada:** Cert
   - **Observació:** No hi ha cap claudàtor, així que la cadena està equilibrada.

6. La falta de claudàtors també retorna veritat
   - **Entrada:** "abcdefghi"
   - **Sortida Esperada:** Cert
   - **Observació:** No hi ha claudàtors, de manera que es considera equilibrat.

7. Els claudàtors han de ser complets
   - **Entrada:** "{[(])}"
   - **Sortida Esperada:** Fals
   - **Observació:** El claudàtor corbat no està tancat correctament.

8. Proves amb múltiples claudàtors
   - **Entrada:** "{[()]}"
   - **Sortida Esperada:** Cert
   - **Observació:** Es tracta de diversos claudàtors emparellats correctament.

9. Prova amb claudàtors mal emparellats al principi
   - **Entrada:** "}{[]()}"
   - **Sortida Esperada:** Fals
   - **Observació:** Els claudàtors estan mal emparellats al principi de la cadena.

10. Prova amb claudàtors mal emparellats al final
   - **Entrada:** "{[()]}}"
   - **Sortida Esperada:** Fals
   - **Observació:** Els claudàtors estan mal emparellats al final de la cadena.

11. Prova amb claudàtors mal emparellats al mig
   - **Entrada:** "{[()]}}{"
   - **Sortida Esperada:** Fals
   - **Observació:** Els claudàtors estan mal emparellats al mig de la cadena.




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


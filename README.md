# FinideDeterministicAutomataChecker
a java program that checks wether a string would be accepted by an automata.

the test files should be in the following format:

#Number of states in the automaton<br />
#Number of final states<br />
#final states<br />
#Number of simbols<br />
#Symbols<br />
#Number of transitions<br />
#Transitions (current_state symbol next_state)<br />
#String to be tested<br />
<br />
here's an example of a working test file:<br />
<br />
5<br />
1<br />
1<br />
3<br />
2<br />
a b<br />
7<br />
0 a 0<br />
0 b 1<br />
1 a 2<br />
2 a 4<br />
2 b 1<br />
4 a 3<br />
4 b 4<br />
ababaabba



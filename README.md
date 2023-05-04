# FinideDeterministicAutomataChecker
a java program that checks wether a string would be accepted by an automata.

the test files should be in the following format:

#Number of states in the automaton
#Initial state
#Number of final states
#final states
#Number of simbols
#Symbols
#Number of transitions
#Transitions (current_state symbol next_state)
#String to be tested

Here's an example of a test file that would be accepted by the program:

5
1
1
3
2
a b
7
0 a 0
0 b 1
1 a 2
2 a 4
2 b 1
4 a 3
4 b 4
ababaabba

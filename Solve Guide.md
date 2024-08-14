CrackSeedChallenge.java is the script used to generate the number sequence, and thus the flag:

DREAM24{260_577_83_767_900}

CrackSeedChallengeSOLVE.java is the solve script, from where the seed is reversed, and five numbers are generated.

Here is a general explanation:
The Random class in java is used to generate a stream of pseudorandom numbers. The class uses a 48-bit seed, which is modified using a linear congruential formula.
If two instances of Random are created with the same seed, and the same sequence of method calls is made for each, they will generate and return identical sequences of numbers.

So to find the five numbers, first we need to reverse the seed. Generate random numbers and check them against the target sequence given in the challenge.
If the numbers match, then we have the seed. Now take the seed and generate 15 numbers, we should see that the first 10 are identical to the target sequence.
Now we know that the remaining 5 numbers are the ones needed for the flag.

See the solve script for an implementation of the steps needed to solve this challenge.
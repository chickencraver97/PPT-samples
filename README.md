Programming Proficiency Test
=========
**Example Questions**

Here are six example questions.

You will be assigned **two questions** (*no, not from these six*) during the test and will have **about two hours** to complete and submit your work.

## What is the Programming Proficiency Test for?

This test is to help you demonstrate that you can complete some simple tasks in a short amount of time. By doing so, you confirm that you:
* Understand the programming language used reasonably well (Java, in the case of CPEN 221 this year);
* Can think computationally and accomplish what may be building blocks for a larger software project;
* Are capable of using Git and Github for _elementary source code control_ tasks.

## The Programming Proficiency Test and CPEN 221

**All students will have to pass the programming proficiency test to pass CPEN 221.**

To pass the proficiency test:
* You must submit your work on time;
* Ideally, you must solve both questions completely, which means that your implementation should pass the public tests as well as additional tests that will be used to stress test the implementation.

**Compiler errors are easily caught; you will not receive any credit if your code does not compile.**

### Does one get a second chance?

Yes. If someone does not pass the test at the first opportunity then a second test will be offered later this term. A third test *may* be offered in January. The caveat is that the scores for subsequent attempts will be capped at 18/20.

## Question 1: Find the Fibonacci Numbers

Given an array of integers, find the elements in the array that are also Fibonacci numbers and return all such numbers as a list sorted in ascending order. If the array contains duplicates that are also Fibonacci numbers then the list returned should have only one entry for such numbers (i.e., the list should not contain duplicates).

The Fibonacci sequence is 1, 1, 2, 3, 5, 8, ... (0 is not part of the Fibonacci sequence.)

## Question 2: Fully Parenthesized Expressions

Let us define an expression to be any String. `Expression` is therefore a datatype with a String as its internal representation. A fully parenthesized expression is one where every opening parenthesis, '(', has a matching closing parenthesis, ')'. An expression that contains no parentheses is, trivially, a fully parenthesized expression. The datatype `FPExpression` is a subtype of `Expression` (and also has recursive structure). Implement the key methods for `FPExpression`.

Note that your implementation should support these different types of brackets/parentheses: `()`, `[]`, `{}`. The usual rules apply: `{` is closed by `}`, etc.

Responses to potential doubts:
+ Whitespace can be ignored irrespective of where it occurs.
+ An empty String "" is not a valid expression and hence not a valid fully parenthesized expression as well.

## Question 3: Prime Factorization

Given an integer `n`, this method returns a string that represents the prime factorization of `n`.

The prime numbers that are factors of n must appear in ascending order in the returned string.

#### Examples
1. **n = 8.** The returned string should be "2^3" where "^" refers to exponentiation.
1. **n = 12.** The returned string should be "2^2 * 3" where "*" represents multiplication.
1. **n = 7.** The returned string should be "7".
1. **n = 1764.** The returned string should be "2^2 * 3^2 * 7^2”.
1. **n = 210.** The returned string should be "2 * 3 * 5 * 7".
1. **n = 1.** The returned string should be "1". Note that 1 is a special case because 1 is not considered a prime number.

## Question 4: Zip Zap Zoom

Consider the following game: Given two integers M and N (N >= M), you start saying out the numbers except that if the number is divisible by 3 you say “zip”, if it is divisible by 5 you say “zap”. For a number that is divisible by 15, you would say “zipzap”.

A `Triple` is a datatype that contains three public integers, `a`, `b` and `c`.

You have to implement a method that takes integers A and B as input and returns a `Triple` where `a` corresponds to the number of times one would say “zip”, `b` corresponds to the number of times one would say “zap”, and `c` corresponds to the number of times one would say “zipzap”.

#### Examples

1. **m = 1, n = 4**. The `Triple` returned would have `a=1`, `b=0`, `c=0` because the game would result in the sequence 1, 2, zip, 4.
1. **m = 2, n = 6**. The `Triple` returned would have `a=2`, `b=1`, `c=0` because the game would result in the sequence 2, zip, 4, zap, zip.
1. **m = 150, n = 165**. The `Triple` returned would have `a=4`, `b=2`, `c=2`.
1. **m = 474747, n = 747474**. The `Triple` returned would have `a=72728`, `b=36363` and `c=18182`.

## Question 5: Zero-Sum Subsequences

> The skeleton source code for this question is in the package `zeroSumSubsequence`. You have to implement the method _getMaximumLength_ in the class _ZeroSumSubsequence_.

Given a list of integers, find the length of the longest subsequence that has a sum of 0. If there is no subsequence that has a sum of 0 then your algorithm would return 0.

#### Examples

+ [2, -2]
	+ Returns: 2
	+ The subsequence is 2, -2.

+ [3, 4, -2, -1]
	+ Returns: 3
	+ The subsequence is 3, -2, -1.

+ [-1, -1, 2, -1, -2, 4]
	+ Returns: 4
	+ The subsequence is -1, -1, -2, 4.

+ [1, 2, 0]
	+ Returns: 1
	+ The subsequence is 0.

+ [1, 1, 2]
	+ Returns: 0
	+ There is no 0-sum subsequence.

## Question 6: String Sums

> The skeleton source code for this question is in the package `stringsum`. You have to implement the method _getStringSum_ in the class _StringSum_.

Let us define the value of each alphabet as follows:
```
A = 1
B = 2
C = 3
...
Y = 25
Z = 26
```
The value is the same irrespective of whether the alphabet appears in lowercase or uppercase.

Given a string _s_, let `s[i]` be the i<sup>th</sup> character in the string. We define `f(s[i])` as the number of times an alphabet of value less than or equal to the value of `s[i]` appears in the string `s`. We can use `val(s[i])` to denote the value of the alphabet at position `i` in `s`.

The _string sum_ is then defined as the sum of `val(s[i]) * f(s[i])` for all valid `i`.

If `s[i]` is not an alphabet then it does not contribute to the string sum or to the computation of `f()` for other alphabets in the string.

Implement a method to compute the _string sum_ given a string.

#### Examples

+ bAbca
	+ Returns: 35
	+ The value of this string is `2*4 + 1*2 + 2*4 + 3*5 + 1*2 = 35`. We can get the value as follows. The first character is a 'b' which has value 2, and has 4 characters that are less than or equal to it in the string (i.e. the first, second, third and fifth character of the string). Thus, this first character contributes `2*4` to the sum. We can derive a similar expression for each of the other characters.

+ zz
	+ Returns: 104

+ y
	+ Returns: 25

+ y-
	+ Returns: 25

+ aaabbc!
	+ Returns: 47

+ TheQuickBrownFoxJumpsOverTheLazyDog
	+ Returns: 11187

+ zyxwvutsrqponmlkjihgfedcba
	+ Returns: 6201

## What Should You Implement / Guidelines

+ You should implement all the methods that are indicated with `TODO`.
+ Passing the provided tests is the minimum requirement. Use the tests to identify cases that need to be handled.
+ You can implement additional helper methods if you need to but you should keep these methods `private` to the appropriate classes.
+ You do not need to implement new classes.
+ You can use additional standard Java libraries by importing them.
+ Do not throw new exceptions unless the specification for the method permits exceptions.

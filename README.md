# Grade 11 Java Review Part 2

## Instructions
Program the solutions for each problem in a single `Utility.java` file in  `src/gr11review/part2 directory`.  You are required to:

### a) Code Solutions
* within a group of two or three, each of your coding to your own branch, code your solutions in VS Code.
* Each member must pick a problem from each section (Methods, FileIO, Array - One Dimensional 1 Loop, Array - One Dimensional 2 Loops, Two Dimensional Arrays)
* commit and push changes to appropriate development branches in github.
* merge tested and completed solutions to the main branch.
* use proper style conventions for variable names and comments.

### b) Test Solutions
* Create a test class `UtilityTest.java` in the `src/gr11review/part2` directory.
* With the concepts of the [Types of Tests](https://docs.google.com/document/d/1vkqcF0oocKygmTJXlBd0Izqau0to38rfG7u7gnBGw10/edit?usp=sharing), define test methods to thoroughly test the functionality of your solution methods. 
* Name your test methods using the name of the solution method + "Test" + test case #.  For example, if your solution method in `Utility.java` is called `abc()`, there should be corresponding test methods in `UtilityTest.java` called `abcTest1(), abcTest2(), abcTest3() ...` etc.
* tests methods should also be created by each member in their development branch and merged into the main branch.

## Problem Sets

### Methods


#### Methods 1

We'll say that a String is xy-balanced if for all the 'x' chars in the string, there exists a 'y' char somewhere later in the string. So "xxy" is balanced, but "xyx" is not. One 'y' can balance multiple 'x's. Return true if the given string is xy-balanced.
**Signature** `public static boolean xyBalance(String str) `

##### Examples
```
xyBalance("aaxbby") → true
xyBalance("aaxbb") → false
xyBalance("yaaxbb") → false
```

#### Methods 2
Given a string, return the sum of the numbers appearing in the string, ignoring all other characters. A number is a series of 1 or more digit chars in a row. (Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'. Integer.parseInt(string) converts a string to an int.)
**Signature** `public static int sumNumbers(String str)`

#### Examples
```
sumNumbers("abc123xyz") → 123
sumNumbers("aa11b33") → 44
sumNumbers("7 11") → 18
```

#### Methods 3
Given a string, does "xyz" appear in the middle of the string? To define middle, we'll say that the number of chars to the left and right of the "xyz" must differ by at most one.
**Signature** `public static boolean xyzMiddle(String str) `

#### Examples
```
xyzMiddle("AAxyzBB") → true
xyzMiddle("AxyzBB") → true
xyzMiddle("AxyzBBB") → false
```

### File IO

#### File IO - Read 1
Write a method `longestWord(String filenametxt)` such that given the name of a file `filenametxt` that contains a single word on each line,  returns the longest word in the file.  
**Signature** `public static String longestWord(String filenametxt)`

#### Example
words.txt contains:  
```
Lorem
ipsum
dolor
sit
amet
consectetur
adipiscing 
elit
```
`longestWord("words.txt")` --> `consectetur`

#### File IO - Read 2
Write a method `alphaWord(String filenametxt)` such that given the name of a file `filenametxt` that contains a single word on each line,  returns the word that is alphabetically first.  
**Signature** `public static String alphaWord(String filenametxt)`

##### Example
words.txt contains:  
```
Lorem
ipsum
dolor
sit
amet
consectetur
adipiscing 
elit
```
`alphaWord("words.txt")` --> `amet`

#### File IO - Read 3
Write a method `vowelCount(String filenametxt)` such that given the name of a file `filenametxt` that contains a single word on each line,  returns the word that has the highest count of vowels.  
**Signature** `public static String vowelCount(String filenametxt)`

##### Example
words.txt contains:  
```
Lorem
ipsum
dolor
sit
amet
consectetur
adipiscing 
elit
```
`vowelCount("words.txt")` --> `consectetur`



### Arrays - One Dimensional, 1 Loop

#### Array 1 - One Dimensional

Return a version of the given array where all the 10's have been removed. The remaining elements should shift left towards the start of the array as needed, and the empty spaces a the end of the array should be 0. So `{1, 10, 10, 2}` yields `{1, 2, 0, 0}`. You may modify and return the given array or make a new array. 
**Signature** `public static int[] withoutTen(int[] nums)`

##### Examples
```
withoutTen([1, 10, 10, 2]) → [1, 2, 0, 0]
withoutTen([10, 2, 10]) → [2, 0, 0]
withoutTen([1, 99, 10]) → [1, 99, 0]
```

#### Array 2 - One Dimensional
We'll say that an element in an array is "alone" if there are values before and after it, and those values are different from it. Return a version of the given array where every instance of the given value which is alone is replaced by whichever value to its left or right is larger.
public int[] notAlone(int[] nums, int val)  
**Signature** `public static int[] notAlone(int[] nums, int value)`

##### Examples
```
notAlone([1, 2, 3], 2) → [1, 3, 3]
notAlone([1, 2, 3, 2, 5, 2], 2) → [1, 3, 3, 5, 5, 2]
notAlone([3, 4], 3) → [3, 4]
```

#### Array 3 - One Dimensional

Return an array that contains the exact same numbers as the given array, but rearranged so that all the zeros are grouped at the start of the array. The order of the non-zero numbers does not matter. So `{1, 0, 0, 1}` becomes `{0 ,0, 1, 1}`. You may modify and return the given array or make a new array.  
**Signature**  `public static int[] zeroFront(int[] nums) `


##### Examples
```
zeroFront([1, 0, 0, 1]) → [0, 0, 1, 1]
zeroFront([0, 1, 1, 0, 1]) → [0, 0, 1, 1, 1]
zeroFront([1, 0]) → [0, 1]
```

### Arrays - One Dimensional, 2 Loops


#### Array 4 - One Dimensional - Two Loops
Given two arrays of ints sorted in increasing order, `outer` and `inner`, return true if all of the numbers in `inner` appear in `outer`. The best solution makes only a single "linear" pass of both arrays, taking advantage of the fact that both arrays are already in sorted order.  
**Signature** `public static boolean linearIn(int[] outer, int[] inner)`

##### Examples
```
linearIn([1, 2, 4, 6], [2, 4]) → true
linearIn([1, 2, 4, 6], [2, 3, 4]) → false
linearIn([1, 2, 4, 4, 6], [2, 4]) → true
```


#### Array 5 - One Dimensional - Two Loops
Given a non-empty array, return true if there is a place to split the array so that the sum of the numbers on one side is equal to the sum of the numbers on the other side.  
**Signature**  `public static boolean canBalance(int[] nums)`

##### Examples
```
canBalance([1, 1, 1, 2, 1]) → true
canBalance([2, 1, 1, 2, 1]) → false
canBalance([10, 10]) → true
```

#### Array 6 - One Dimensional - Two Loops
Given n>=0, create an array with the pattern `{1,    1, 2,    1, 2, 3,   ... 1, 2, 3 .. n}` (spaces added to show the grouping). Note that the length of the array will be 1 + 2 + 3 ... + n, which is known to sum to exactly n*(n + 1)/2.  
**Signature**  `public static int[] seriesUp(int n)`

##### Examples
```
seriesUp(3) → [1, 1, 2, 1, 2, 3]
seriesUp(4) → [1, 1, 2, 1, 2, 3, 1, 2, 3, 4]
seriesUp(2) → [1, 1, 2]
```

### Arrays - Two Dimensional

#### Array 7 - Two Dimensional
Write a method that takes a 2D array and reverses all of the content in the 2D array. The last value should be the first, and the first value should be the last.  

**Signature** `public static int[][] reverse(int[][] arr)`

##### Example
`reverse({{1,2,3},{4,5,6},{7,8,9}})` returns
```
[9,8,7]
[6,5,4]
[3,2,1]
```

#### Array 8 - Two Dimensional 
Write a method that returns a portion of a 2D array based on a specified row and col.  
**Signature** `public static int[][] split(int[][] arr, int row, int col)`  

##### Example
For example, the call `split({{1,2,3},{4,5,6},{7,8,9}}, 1, 1)` would return all elements up to that point in the 2D array: 
```
[1,2]
[4,5]
```

#### Array 9 - Two Dimensional 
Write a method that inverts a 2D array. Inverting a 2D array means that each row of the 2D array is now a column, and each column is now a row.  

**Signature** `public static int[][] invert(int[][] arr)`  

##### Example
If we were to invert the 2D array:
```
[1,1,1]
[2,2,2]
[3,3,3]
```

the result would be:
```
[1,2,3]
[1,2,3]
[1,2,3] 
```

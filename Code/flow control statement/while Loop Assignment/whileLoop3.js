//! Question 02.
//todo Print the even number only

/*
const n = 43705;

function printDigit(n) {
    while (n > 0) {
        let rem = parseInt(n % 10);

        if (rem % 2 == 0)
            console.log(rem);

        n = parseInt(n / 10);
    }
}

printDigit(n); */


//! Question 03.
//todo Print the odd number only

/*
const n = 43705;

function printDigit(n) {
    while (n > 0) {
        let rem = parseInt(n % 10);

        if (rem % 2 != 0)
            console.log(rem);

        n = parseInt(n / 10);
    }
}

printDigit(n); */



//! Question 04.
//todo Print the digit which is greater than and equal to 5

/*
const n = 43705;

function printDigitGreaterThanFive(n) {
    while (n > 0) {
        let rem = parseInt(n % 10);

        if (rem >= 5)
            console.log(rem);

        n = parseInt(n / 10);
    }
}

printDigitGreaterThanFive(n);
*/



//!      Question 05
//todo:  Find biggest digit from number


/*
function getBiggest(n) {
    let big = parseInt(n % 10);

    while (n > 0) {
        let rem = parseInt(n % 10);
        if (rem > big)
            big = rem;
        n = parseInt(n / 10);
    }
    return big;
}

let n = 39249;
console.log("Biggest Number is : ", getBiggest(n)); 
*/




//!      Question 05
//todo:  Print the difference of biggest and smallest digit.


/*
function getSmallest(n) {
    let small = parseInt(n % 10);

    while (n > 0) {
        let rem = n % 10;

        if (rem < small)
            small = rem;
        n = parseInt(n / 10);
    }
    return small;
}


function getBiggest(n) {
    let big = parseInt(n % 10);

    while (n > 0) {
        let rem = n % 10;

        if (rem > big)
            big = rem;
        n = parseInt(n / 10);
    }
    return big;
}

let n = 31249;
console.log("Difference in Biggest and smallest is : ", getBiggest(n) - getSmallest(n));
*/



//! Question 07.
//todo: count the total digit of a number

/*
const n = 43705;
let count = 0;

function printCount(n) {
    while (n > 0) {
        count++;
        n = parseInt(n / 10);
    }
    return count;
}

let countValue = printCount(n);
console.log("Total digit : ", countValue);
 */



//! Question 08.
//todo: Print digit from left to right


//! first approach
/*
let n = 385334;
let count = 0;
let num = n;

while (num > 0) {
    count++;
    num = parseInt(num / 10);
}

function chkNumberIncreasing(n) {
    while (count > 0) {
        let digit = (parseInt(n / (10 ** (count - 1)))) % 10;
        console.log(digit);
        count--;
    }
}

chkNumberIncreasing(n);
*/

//! 2nd approach

/*
let n = 45762;

function chkNumberIncreasing(n) {
    let numStr = n.toString();
    for (let i = 0; i < numStr.length; i++) {
        console.log(numStr[i]);
    }
}

chkNumberIncreasing(n);
*/

//! Question 10
//todo: Count how many zero in the given number

/*
function countZero(n) {
    while (n > 0) {
        let digit = n % 10;
        if (digit == 0)
            count++;
        n = parseInt(n / 10);
    }
    return count;
}

let count = 0;
let n = 23002;
console.log("In the number : ", n, " having ", countZero(n), " Zero.");
*/


//! Question 11
//todo: Count how many 3 in the given number

/*
function countThree(n) {
    while (n > 0) {
        let digit = n % 10;
        if (digit == 3)
            count++;
        n = parseInt(n / 10);
    }
    return count;
}

let count = 0;
let n = 23002;
console.log("In the number : ", n, " having ", countThree(n), " Three.");
*/



//! Question 12.
//todo Count the even digit in the given number.

/*

function countEvenDigit(n) {
    while (n > 0) {
        let rem = parseInt(n % 10);

        if (rem % 2 == 0)
            count++;

        n = parseInt(n / 10);
    }
    return count;
}

const n = 43705;
let count = 0;
console.log("Total Even digit in ", n, " is : ", countEvenDigit(n));
*/



//! Question 13.
//todo Count the odd digit in the given number.

/*

function checkAdjacentDigits(n) {
    while (n > 0) {
        let rem = parseInt(n % 10);

        if (rem % 2 != 0)
            count++;

        n = parseInt(n / 10);
    }
    return count;
}

const n = 43705;
let count = 0;
console.log("Total Odd digit in ", n, " is : ", checkAdjacentDigits(n));
*/


//! Question 14.
//todo count the digit which is greater than and equal to 5

/*

function countDigitLessThanFive(n) {
    while (n > 0) {
        let rem = n % 10;

        if (rem <= 5)
            count++;

        n = parseInt(n / 10);
    }
    return count;
}


let n = 43705;
let count = 0;
console.log("In the number : ", n, " having ", countDigitLessThanFive(n), " numbers less than or equal to 5.");
 */


//! Question 15.
//todo Print of sum of each digit of a number.

/*
function sumOfDigit(n) {
    while (n > 0) {
        let rem = n % 10;
        sum += rem;
        n = parseInt(n / 10);
    }
    return sum;
}

const n = 43705;
let sum = 0;
console.log("Total Odd digit in ", n, " is : ", sumOfDigit(n));
*/


//! Question 16.
//todo Print of sum of each even digit of a given number.

/*
function sumOfEvenDigit(n) {
    while (n > 0) {
        let rem = n % 10;
        if (rem % 2 == 0)
            sum += rem;
        n = parseInt(n / 10);
    }
    return sum;
}

const n = 43702;
let sum = 0;
console.log("Given number is : ", n);
console.log("Sum of even digit is ", sumOfEvenDigit(n));
*/


//! Question 17.
//todo Print of sum of each odd digit of a given number.

/*
function sumOfOddDigit(n) {
    while (n > 0) {
        let rem = n % 10;
        if (rem % 2 != 0)
            sum += rem;
        n = parseInt(n / 10);
    }
    return sum;
}

const n = 43702;
let sum = 0;
console.log("Given number is : ", n);
console.log("Sum of odd digit is ", sumOfOddDigit(n));
*/


//! Question 17.
//todo Print of sum of each odd digit of a given number.

/*
function sumOfOddDigit(n) {
    while (n > 0) {
        let rem = n % 10;
        if (rem % 2 != 0)
            sum += rem;
        n = parseInt(n / 10);
    }
    return sum;
}

const n = 43702;
let sum = 0;
console.log("Given number is : ", n);
console.log("Sum of odd digit is ", sumOfOddDigit(n));
*/


//! Question 19.
//todo Check the product of each number is even or odd.

/*
function productOfDigitEvenOrOdd(n) {
    while (n > 0) {
        let rem = n % 10;
        product *= rem;
        n = parseInt(n / 10);
    }
    console.log("Product is : ", product);
    if (product % 2 == 0)
        return "even";
    else
        return "odd";
}

const n = 33;
let product = 1;
console.log("Given number is : ", n);
console.log("product of digit is ", productOfDigitEvenOrOdd(n));
*/


//!     Question 21
//todo: return true if all the digit of a given number is in increasing order.

/*
let n = 23416;


if (chkNumberIncreasing(n))
    console.log("true");
else
    console.log("false");


function counter(num) {
    let count = 0;
    while (num > 0) {
        count++;
        num = parseInt(num / 10);
    }
    return count;
}



function chkNumberIncreasing(n) {
    let val = -1;
    let k = counter(n);
    let digit = 0;

    while (k > 0) {
        digit = (parseInt(n / (10 ** (k - 1)))) % 10;
        if (digit < val)
            return false;

        val = digit;
        k--;
    }
    return true;
}
*/



//!     Question 22
//todo: return true if all the digit of a given number is in decreasing order.

/*
let n = 1234;


if (chkNumberDecreasing(n))
    console.log("true");
else
    console.log("false");


function counter(num) {
    let count = 0;
    while (num > 0) {
        count++;
        num = parseInt(num / 10);
    }
    return count;
}



function chkNumberDecreasing(n) {
    let val = 10;
    let k = counter(n);
    let digit = 0;

    while (k > 0) {
        digit = (parseInt(n / (10 ** (k - 1)))) % 10;
        if (digit > val)
            return false;

        val = digit;
        k--;
    }
    return true;
}
*/



//!     Question 23.
//todo: return true if it has different adjacent digits.

/*

let n = 1234;
if (checkAdjacentDigits(n))
    console.log("true");
else
    console.log("false");


function counter(num) {
    let count = 0;
    while (num > 0) {
        count++;
        num = parseInt(num / 10);
    }
    return count;
}



function checkAdjacentDigits(n) {
    let val = 10;
    let k = counter(n);
    let digit = 0;

    while (k > 0) {
        digit = (parseInt(n / (10 ** (k - 1)))) % 10;
        if (digit == val)
            return false;

        val = digit;
        k--;
    }
    return true;
}

*/



//! Question 26
//todo Print factorial of each digits of a number
//todo check also entered number is strong or not.

/*
function factorial(rem) {
    let fact = 1;
    while (rem > 1) {
        fact *= rem;
        rem--;
    }
    sum += fact;
    return fact;
}


function getFactorialOfEachDigit(n) {
    while (n > 0) {
        let rem = n % 10;
        console.log("Factorial of ", rem, " is : ", factorial(rem));
        n = parseInt(n / 10);
    }
    console.log("Sum of all factorial : ", sum);
}


function isStrong(sum, n) {
    if (sum == n)
        console.log(n, " is a strong number");
    else
        console.log(n, " is a not strong number");
}



let sum = 0;
let n = 145;
console.log("Number is : ", n);
getFactorialOfEachDigit(n);
isStrong(sum, n);

*/



//todo:  reverse the given number

/*
function getReverse(n) {
    let rev = 0;
    while (n > 0) {
        let rem = n % 10;
        rev = 10 * rev + rem;
        n = parseInt(n / 10);
    }
    return rev;
}

let n = 3421;
console.log("Reverse of a ", n, " is : ", getReverse(n));

*/


//todo:  Check given number is palindrome or not

/*
function Palindrome(n) {
    let rev = 0;
    while (n > 0) {
        let rem = n % 10;
        rev = 10 * rev + rem;
        n = parseInt(n / 10);
    }
    return rev;
}

let n = 343;
let orignalNumber = n;
if (Palindrome(n) == orignalNumber)
    console.log("Yes palindrome..!!");
else
    console.log("Not palindrome..!");

*/


//todo: Chaeck given string is palindrome or not

/*
function stringReverse(str) {
    let rev = "";
    let i = 0;

    while (i < str.length) {
        rev = str.charAt(i) + rev;
        i++;
    }
    return str.equalsIgnoreCase(rev);
}

let str = "avi";
if (stringReverse(str))
    console.log("String is Palindrome");
else
    console.log("String is not palindrome");
*/

function stringPalindrome(str) {
    let start = 0;
}
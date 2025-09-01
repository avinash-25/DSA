//todo Question 01.
//! sum of natual numbers.

// Approach 01
/*
let n = 5;

console.log("Sum of ", n, " natural number is : ", n * (n + 1) / 2);
*/

// Approach 02

/*
let n = 4;
let i = 1;
let sum = 0;

while (i < n) {
    sum += i + n;
    i++;
    n--;
}

if (n == i)
    sum += i;

console.log("Sum of ", n, " natural number is : ", sum);
*/


//todo Question 02.
//! Sum Of all even numbers.
/*
let n = 4;
let sum = 0;

while (n > 0) {
    if (n % 2 == 0)
        sum += n;
    n--;
}

console.log("Sum : ", sum);
*/
//todo Question 01.
//! sum of natual numbers.

//! Approach 01
/*
let n = 5;

console.log("Sum of ", n, " natural number is : ", n * (n + 1) / 2);
*/

//! Approach 02

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

//! Approach 01
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


//! Approach 02

/*
let n = 8;
let i = 2;
let sum = 0;

if (n % 2 != 0)
    n--;

while (i < n) {
    sum += i + n;
    i += 2;
    n -= 2;
}

console.log("Sum : ", sum);
*/




//todo Question 03.
//! Sum Of all odd numbers.

//! Approach 01
/*
let n = 3;
let sum = 0;

while (n > 0) {
    if (n % 2 != 0)
        sum += n;
    n--;
}

console.log("Sum of odd numbers : ", sum);
*/


//! Approach 02

/*
let n = 3;
let i = 1;
let sum = 0;

if (n % 2 == 0)
    n--;

while (i < n) {
    sum += i + n;
    i += 2;
    n -= 2;
}

console.log("Sum of odd numners : ", sum);*/

//! Question 04.
//todo : Print the sum of squares of all natural numbers from 1 to 100

/*
let n = 3;
let i = 1;
let sum = 0;

while (i <= n) {
    sum += i * i;
    i++;
}

console.log("Sum of squares if 1 to ", n, " is ", sum);
*/


//! Question 05
//todo Sum of cubes


//! Approach 01

/*
let n = 3;
let i = 1;
let sum = 0;

while (i <= n) {
    sum += i * i * i;
    i++;
}

console.log("Sum of cubes if 1 to ", n, " is ", sum);
*/

//! Approach 2

/*
let n = 2;
let i = 1;
let sum = 0;

while (i < n) {
    sum += i * i * i;
    sum += n * n * n;
    i++;
    n--
    if (n == i)
        sum += i * i * i;
}

console.log("Sum of cubes if 1 to ", n, " is ", sum);
*/


//! Question 06
//todo 
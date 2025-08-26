// ! Question 06
// ! print numbers which is divide by 7 or ends with 7
/*
let i = 7;

while (i < 100) {
    if (i % 7 == 0 || i % 10 == 7)
        console.log(i);
    i++;
}
*/

// ! Question 07
// ! print numbers which is divide by 7 and ends with 7

/*
let i = 7;
let count = 0;

while (i < 1000) {
    if (i % 7 == 0 && i % 10 == 7) {
        console.log(i);
        count++
    }
    i++;
}

console.log("Total such numbers are : ", count);
*/

//! Quetion 08
//! Print all the factors of a number(number itself included)


/* Logic 1

let num = 35;
let temp = num - 1;
while (temp >= 1) {
    if (num % temp == 0)
        console.log(temp);
    temp--;
}
console.log(num);
*/

//Logic 2

/* 
let num = 28;
let i = 1;

while (i <= num / 2) {
    if (num % i == 0)
        console.log(i);
    i++;
}
console.log(num);
*/


// Logic 3

/*
if 203 is divisible by 7.
Last digit = 3
Double it = 6
Remaining number = 20
Subtract→ 20− 6 = 14

let num = 203;

let lastDigit = num % 10;
let double = lastDigit * 2;
let rem = num / 10;
let n = rem - double;
if (n % 7 == 0)
    console.log("divisible");
else
    console.log("Not divisible");
*/

// Logic 4
//! Best Logic

/* 

let num = 28;
let i = 1;
// let i = parseInt(Math.sqrt(45));
//!       OR
// let i = Math.floor(Math.sqrt(num));

while (i * i <= num) {
    if (num % i == 0) {
        if (i == num / i)
            console.log(i);
        else {
            console.log(num / i);
            console.log(i);
        }
    }
    i++;
}

*/

//! Print all factor excuding self number.

// let num = 28;
// let i = 2;
// console.log("1");
// while (i * i <= num) {
//     if (num % i == 0) {
//         if (i == num / i)
//             console.log(i);
//         else {
//             console.log(num / i);
//             console.log(i);
//         }
//     }
//     i++;
// }

//! Only count the factor of a number

/*
let num = 25;
let count = 1;
let i = 2;
while (i * i <= num) {
    if (num % i == 0) {
        if (i == num / i)
            count++;
        else
            count += 2;
    }
    i++;
}
console.log("NUmber of factors are : ", count);
*/

//! Question 09
//! Count the total factors of the given number.

/*
let num = 35;
let temp = num - 1;
let count = 0;
console.log("Number is : ", num);
console.log();
while (temp >= 1) {
    if (num % temp == 0) {
        console.log("Factor are : ", temp);
        count++;
    }
    temp--;
}
console.log();
console.log("Total Factor of ", num, " is ", count);
*/

//! Question 11
//! check prime number or not

/*
let a = 8;
let b = a - 1;
let check = false;
while (b >= 2) {
    if (a % b == 0)
        check = true;
    b--;
}

if (check == false)
    console.log(a, " is Prime");
else
    console.log(a, " is not Prime");
*/

// ! Question 12
// ! Print fibonacci number

// let num = 7;
// let a = 0
// let b = 1;
// let i = 2;

// console.log(a);
// console.log(b);

// while (i <= num) {
//     c = a + b;
//     console.log(c);
//     a = b;
//     b = c;
//     i++;
// }

//! Question 13
//! Print the nth term of the fibobacci

// let num = 7;
// let a = 0
// let b = 1;
// let i = 2;

// while (i <= num) {
//     c = a + b;
//     a = b;
//     b = c;
//     i++;
// }
// console.log("Last term is : ", c);
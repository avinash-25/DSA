// ! Big among two numbers

// let a = 30;
// let b = 50;

// if (a > b)
//     console.log(a, " is bigger");
// else
//     console.log(b, " is bigger");

// ! print all equal if all have same value or print biggest of three numbers using if else statement

// let a = 45;
// let b = 40;
// let c = 49;

// if (a == b && b == c)
//     console.log("All values are same");
// else if (a > b && a > c)
//     console.log(a, " is biggest");
// else if (b > c)
//     console.log(b, " is biggest");
// else
//     console.log(c, " is biggest");


// ! take CP and SP from user and print %profti or % loss in the transaction.

// let cp = 550;
// let sp = 605;
// let profit = 0;
// let loss = 0;

// if (sp > cp) {
//     profit = sp - cp;
//     let proPercent = profit * (100 / cp);
//     console.log("Profit percent is : ", proPercent);
// } else if (cp > sp) {
//     loss = cp - sp;
//     let lossPercent = loss * (100 / cp);
//     console.log("Loss percent is : ", lossPercent);

// } else {
//     console.log("No profit and No loss");
// }

// ! Print all even numbers from 1 to 100

// let i = 1;

// while (i <= 100) {
//     if (i % 2 == 0)
//         console.log(i);
//     i++;
// }

// ! print numbers which is divide by 7 or ends with 7

// let i = 7;

// while (i < 100) {
//     if (i % 7 == 0 || i % 10 == 7)
//         console.log(i);
//     i++;
// }



// ! print numbers which is divide by 7 and ends with 7

// let i = 7;
// let count = 0;

// while (i < 100) {
//     if (i % 7 == 0 && i % 10 == 7) {
//         console.log(i);
//         count++
//     }
//     i++;
// }

// console.log("Total such numbers are : ", count);


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


//? Logic 1

/* 

let num = 35;
let temp = num - 1;
while (temp >= 1) {
    if (num % temp == 0)
        console.log(temp);
    temp--;
}
console.log(num);
*/

//? Logic 2

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


// ?Logic 3

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

//? Logic 4
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


// ! First approach
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


// ! Second approach to find entered number is Prime or not

// let n = 100;
// let i = 2;
// let count = 0;

// if (Prime(n))
//     console.log(n, " Is not prime");
// else
//     console.log(n, " Is prime");


// function Prime(n) {
//     if (n < 2)
//         return false;

//     while (i * i <= n) {
//         if (n % i == 0) {
//             let factOne = i;
//             let factTwo = n / i;

//             if (factOne == factTwo) {
//                 return true;
//             } else {
//                 return true;
//             }
//         }
//         i++;
//     }
//     return false;
// }



//! Third Approach to find prime

// let n = 100;
// let i = 2;

// if (Prime(n))
//     console.log(n, " Is prime");
// else
//     console.log(n, " Is not prime");


// function Prime(n) {
//     if (n < 2)
//         return false;

//     while (i * i <= n) {
//         if (n % i == 0)
//             return false;
//         i++;
//     }
//     return true;
// }


//! Fourth approach to find number is prime or not

/*
let n = 99;
let i = 2;

if (Prime(n))
    console.log(n, " Is prime");
else
    console.log(n, " Is not prime");


function Prime(n) {
    if (n < 2)
        return false;
    else if (n == 2 || n == 3)
        return true;
    else if (n % 2 == 0)
        return false;

    let i = 3;

    while (i * i <= n) {
        if (n % i == 0)
            return false;
        i += 2;
    }
    return true;
}

*/



// ! Question 12
// ! Print fibonacci number  [first approach]
/*

let num = 7;
let a = 0
let b = 1;
let i = 2;

console.log(a);
console.log(b);

while (i <= num) {
    c = a + b;
    console.log(c);
    a = b;
    b = c;
    i++;
}
*/


// ! Print fibonacci number  [first approach]

/*
let n = 7;
let n1 = 0;
let n2 = 1;

let i = 0;
console.log(n1);

while (i <= n) {
    /* n3 = n1 + n2;
     console.log(n3);

     n2 = n1;
     n1 = n3;
     i++; star/

    n3 = n1 + n2;
    console.log(n3);
    n1 = n2;
    n2 = n3;
    i++;
}

*/




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


//!Print all factors inculed number itself using function

// let n = prompt("Enter a number to find factor : ")

// // let n = 36;
// let i = 2;
// console.log("1  ", n);

// factor(n);

// function factor(n) {
//     while (i * i <= n) {
//         if (n % i == 0) {
//             let factOne = i;
//             let factTwo = n / i;

//             if (factOne == factTwo)
//                 console.log(factOne);
//             else {
//                 console.log(factOne, " ", factTwo);
//             }
//         }
//         i++;
//     }
// }


//!Print all factors and count the factors too inculed number itself using function

// let n = prompt("Enter a number to find factor : ")

// let n = 36;
// let i = 2;
// let count = 2;
// console.log("1  ", n);

// factor(n);

// function factor(n) {
//     while (i * i <= n) {
//         if (n % i == 0) {
//             let factOne = i;
//             let factTwo = n / i;

//             if (factOne == factTwo) {
//                 console.log(factOne);
//                 count++;
//             } else {
//                 console.log(factOne, " ", factTwo);
//                 count += 2;
//             }
//         }
//         i++;
//     }
//     console.log("Total Factors are : ", count);
// }
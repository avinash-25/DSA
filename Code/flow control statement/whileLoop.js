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


/*
let num = 35;
let temp = num - 1;
while (temp >= 1) {
    if (num % temp == 0)
        console.log(temp);
    temp--;
}
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

let num = 7;
let a = 0
let b = 1;
let i = 2;

while (i <= num) {
    c = a + b;
    a = b;
    b = c;
    i++;
}
console.log("Last term is : ", c);
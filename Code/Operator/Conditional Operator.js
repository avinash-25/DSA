// ! Q1

// let x = 10;
// let y = 5;

// let z = (x > y) ? (x < 15 ? x : y) : (x > 5 ? y : x);

// console.log(z);

//! check three sides of a tringle are valid or not

// let a = 4;
// let b = 5;
// let c = 2;

// let res = (a + b > c && b + c > a && a + c > b) ? `Valid tringle` : `Not a tringle`;
// console.log(res);

// ! check entered charcter is alphabet or not

// let ch = 'a';

// console.log((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') ? `${ch} is chracter` : `Not a character`);


//! Check

// let ch = 'A';

// console.log((ch >= 'A' && ch <= 'Z') ? `${ch} is in uppercase` :
//             (ch >= 'a' && ch <= 'z') ? `${ch} is lowercase` :
//             (ch >= '0' && ch <= '9') ? `${ch} is a digit` : `${ch} is a special character`);
            



// ! check bigger among two number.

// let num1 = 2343;
// let num2 = 432;

// console.log((num1 > num2) ? `${num1} is bigger` : `${num2} is bigger`);



// ! check smaller among two number.

// let num1 = 23;
// let num2 = 432;

// console.log((num1 < num2) ? `${num1} is smaller` : `${num2} is smaller`);




// ! check bigger among three numbers.

// let num1 = 20;
// let num2 = 42;
// let num3 = 13;

// console.log((num1 > num2) && (num1 > num3) ? `${num1} is biggest` : (num2 > num3) ? `${num2} is biggest` : `${num3} is biggest`);


//! Check biggest among four numbers

// let a = 132;
// let b = 43;
// let c = 32;
// let d = 800;

// console.log((a > b && a > c && a > d) ? `${a} is biggest` :
//             (b > c && b > d && b > a) ? `${b} is biggest` :
//             (c > a && c > b && c > d) ? `${c} is biggest` :`${d} is biggest`);
            

//! Test the rank of the student

// let marks = 65;

// console.log((marks >= 75)?`${marks} is Distinction`:(marks >= 60)?"First class":(marks>=50)?"Second class":(marks>= 35)?"Pass":"Fail");


//! Three numbers are given print them in sorted order.

// let a = 90;
// let b = 100;
// let c = 95;

// let smallest = (a < b && a < c) ? a : (b < c) ? b : c;
// let biggest = (a > b && a > c) ? a : (b > c) ? b : c;

// let middle = (a + b + c) - (smallest + biggest);

// console.log(smallest,middle,biggest);


//! Return the 2nd biggest among three numbers

let a = 100;
let b = 100;
let c = 959;

let smallest = (a < b && a < c) ? a : (b < c) ? b : c;
let biggest = (a > b && a > c) ? a : (b > c) ? b : c;

let middle = (a + b + c) - (smallest + biggest);

console.log("2nd Biggest number is : ", middle);


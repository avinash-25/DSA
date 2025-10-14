// ! Question 01

// let a = 20;
// a++;
// let b = a++;
// let c = ++b;

// console.log(a); //22
// console.log(b); // 22
// console.log(c); // 22

//! Question 02

// let a = 12;
// let b = a++;
// b++;
// let c = a++ + --b; 
// console.log(a);
// console.log(b);
// console.log(c);

// ! Question 03

// let p = 12;
// let q = 20;

// let r = p++ + q++ - ++p - --p; // Here we will calculate right to left and value will be updated too in each calculation,
// console.log("p : ",p);
// console.log("q : ",q);
// console.log("r : ", r);

// ! Question 04

// let x = 10;
// let y = 5;

// let z = x-- - --y + x++ + ++y;
// console.log("z = ", z);
// console.log("x = ", x);
// console.log("y = ", y);

// ! Question 05

let t = 5;
console.log(t++ - --t + t-- - --t);

//! Question 06

// let x = 12;
// let y = x++ + ++x;
// y++;
// let z = ++y;
// let p = x++ - ++y + z++;
// console.log(x);
// console.log(y);
// console.log(z);
// console.log(p);

//! Question 07

let a = 8;
let b = 12;
let c = ++a + b++;
c--;
--b;
let d = c-- + ++b + ++a;
let e = a + ++b + c + d++;
console.log(++e);
console.log("a : ", a);
console.log('B : ', b);
console.log("c : ", c);
console.log("d : ", d);

//! Question 08

let x = 4;
let y = 6;
x += (++y * 2);
console.log(x);
console.log(y);

//! Question 09;

let p = 5;
let q = 2;

p *= ++q + p++; // Firstly done all calculation of right side then multiply to the p;
console.log(p);
console.log(q);
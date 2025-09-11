//! Question 1;

let a = true;
let b = false;
let c = true;

let result = (a && b) || (b && c);
console.log(result);

// ! Question 2;

let x = 5;
let y = 10;

let res = (++x > 5) && (--y < 10);
console.log(res);
console.log(x);
console.log(y);

// ! Question 3;

let p = true;
let q = false;
let r = true;

let output = ( p || q ) && ( q || r );
console.log(output);

//! Question 4;

let w = 20;
let n = 30;

console.log(w++ > 15 && n++ > 20);
console.log(w);
console.log(n);

//! Question 5;

let j = 20;
let k = 30;

console.log(j++ > 25 && k++ > 20);
console.log(j);
console.log(k);



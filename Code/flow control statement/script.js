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

let i = 7;
let count = 0;

while (i < 100) {
    if (i % 7 == 0 && i % 10 == 7) {
        console.log(i);
        count++
    }
    i++;
}

console.log("Total such numbers are : ", count);
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


//! Question 05.
//todo Print the even number only

// const n = 43705;
// let max = parseInt(n % 10);
// let biggest = 0;

// function biggestDigit(n) {
//     while (n > 0) {
//         let rem = parseInt(n % 10);

//         if (rem > max)
//             biggest = rem;

//         n = parseInt(n / 10);
//     }
// }

// biggestDigit(n);


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

/*
let n = 45762;

function printDigitLtoR(n) {
    let numStr = n.toString();
    for (let i = 0; i < numStr.length; i++) {
        console.log(numStr[i]);
    }
}

printDigitLtoR(n);
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
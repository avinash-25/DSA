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
console.log("Total digit : ", countValue); */



//! Question 08.
//todo: Print digit from left to right

/*
let n = "43705";
let count = 0;

function printDigitLtoR(n) {
    while (n > 0) {
        count++;
        n = parseInt(n / 10);
    }
    return count;
}

let countValue = printDigitLtoR(n);
console.log("Total digit : ", countValue);*/
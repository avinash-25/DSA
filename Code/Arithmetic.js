/**
*  For a given number int n=5783;
* ! a. Print the last digit of the number
* ! b. Print the last two digit of the number
* ! c. Remove the last digit of the number
* ! d. Remove the last two digit of the number
*/

function arithmeticOperations(n) {

    const lastDigit = n % 10;
    console.log(lastDigit, "Last Digit");

    const lastTwoDigits = n % 100;
    console.log(lastTwoDigits, "Last Two Digits");

    const removeLastDigit = Math.floor(n / 10);
    console.log(removeLastDigit, "Remove Last Digit");

    const removeLastTwoDigits = Math.floor(n / 100);
    console.log(removeLastTwoDigits, "Remove Last Two Digits");

}

console.log("Given Number: 5783");
arithmeticOperations(5783);

/**
* For a given number int n=5783;
* !  Print each digit of the number one by one
*/

let number = 5783;
console.log("Given Number: " + number);


function printDigits(n) {
   
}
printDigits(number);




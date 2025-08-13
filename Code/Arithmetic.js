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


/**
* ! Operator based Programming

* ! a With using a third variable
* ! b. Without using third variable
*/

function swapWithThirdVariable(a, b) {
    console.log("Before Swap: a =", a, ", b =", b);
    let temp = a;
    a = b;
    b = temp;
    console.log("After Swap: a =", a, ", b =", b);
}

function swapWithoutThirdVariable(a, b) {
    console.log("Before Swap: a =", a, ", b =", b);
    a = a + b;
    b = a - b;
    a = a - b;
    console.log("After Swap: a =", a, ", b =", b);
}

console.log("Swapping with Third Variable:");
swapWithThirdVariable(5, 10);   

/**
* ! For the given three numbers. Swap 1st into 2nd, 
* ! 2nd into 3rd and 3rd into 1st  number.
* ! a. With using fourth variable
* ! b. Without using fourth variable
*/

function swapWithFourthVariable(a, b, c) {
    console.log("Before Swap: a =", a, ", b =", b, ", c =", c);
    let temp = a;
    a = b;
    b = c;
    c = temp;
    console.log("After Swap: a =", a, ", b =", b, ", c =", c);
}   

function swapWithoutFourthVariable(a, b, c) {
    console.log("Before Swap: a =", a, ", b =", b, ", c =", c);
    a = a + b + c;
    b = a - (b + c);
    c = a - (b + c);
    a = a - (b + c);
    console.log("After Swap: a =", a, ", b =", b, ", c =", c);
}   

console.log("Swapping with Fourth Variable:");
swapWithFourthVariable(1, 2, 3);


/**
* ! Operator based Programming
* ! For the given CP and SP. Calculate %Profit.
* ! CP=120;
* ! SP=160;
*/

function calculateProfit(cp, sp) {
    const profit = sp - cp;
    const profitPercentage = (profit / cp) * 100;
    console.log("Cost Price:", cp);
    console.log("Selling Price:", sp);
    console.log("Profit Percentage:", profitPercentage.toFixed(2) + "%");
}   

console.log("Calculating Profit Percentage:");
calculateProfit(120, 160);


/**
*! For the given CP and SP. Calculate %Loss.
*! CP=120;
*! SP=90;
*/

function calculateLoss(cp, sp) {
    const loss = cp - sp;
    const lossPercentage = (loss / cp) * 100;
    console.log("Cost Price:", cp);
    console.log("Selling Price:", sp);
    console.log("Loss Percentage:", lossPercentage.toFixed(2) + "%");
}   

console.log("Calculating Loss Percentage:");
calculateLoss(120, 90);


/**
*! Find the Last Digit of a Number Without using 
*! % operator.
*! Int n=12345;
*! Output:
*! 5
*/

function findLastDigitWithoutMod(n) {
    while (n >= 10) {
        n = Math.floor(n / 10);
    }
    console.log(n, "Last Digit without % operator");
}   

console.log("Finding Last Digit without % operator:");
findLastDigitWithoutMod(12345);


/**
*!  Reverse a 3-Digit Number Using Pure 
*! Arithmetic operator.
*! Int n=123;
*! Output:
*! 321
*/

function reverseThreeDigitNumber(n) {
    if (n < 100 || n > 999) {
        console.log("Input must be a 3-digit number.");
        return;
    }
    const lastDigit = n % 10;
    const middleDigit = Math.floor((n / 10) % 10);
    const firstDigit = Math.floor(n / 100);
    const reversedNumber = lastDigit * 100 + middleDigit * 10 + firstDigit;
    console.log(reversedNumber, "Reversed 3-Digit Number");
}

console.log("Reversing 3-Digit Number:");
reverseThreeDigitNumber(123);


/**
*!  Find Sum of three Digit number Without using 
*! Loops
*! Int n=123;
*! Output:
*! 6
*/

function sumOfThreeDigitNumber(n) {
    if (n < 100 || n > 999) {
        console.log("Input must be a 3-digit number.");
        return;
    }
    const lastDigit = n % 10;
    const middleDigit = Math.floor((n / 10) % 10);
    const firstDigit = Math.floor(n / 100);
    const sum = firstDigit + middleDigit + lastDigit;
    console.log("Sum of 3-Digit Number: ",sum);
}

console.log("Calculating Sum of 3-Digit Number:");
sumOfThreeDigitNumber(123);



/**
*!  Find Sum of First N Natural Numbers Without Loop
*! Int n=100;
*! 1+2+3+.... Upto 100
*! Output:
*! 5050
*/

function sumOfFirstNNaturalNumbers(n) {
    if (n < 1) {
        console.log("Input must be a natural number greater than 0.");
        return;
    }
    const sum = (n * (n + 1)) / 2;
    console.log("Sum of First", n, "Natural Numbers:", sum);
}

console.log("Calculating Sum of First N Natural Numbers:");
sumOfFirstNNaturalNumbers(100);


/**
*! Find Sum of all odd Numbers up to n Without Loop
*! Int n=100;
*! 1+3+5+....upto 100
*! Output:
*! 2500
*/

function sumOfOddNumbersUpToN(n) {
    if (n < 1) {
        console.log("Input must be a natural number greater than 0.");
        return;
    }
    const countOfOddNumbers = Math.floor(n / 2) + (n % 2);
    const sum = countOfOddNumbers * countOfOddNumbers;
    console.log("Sum of Odd Numbers up to", n, ":", sum);
}

console.log("Calculating Sum of Odd Numbers up to N:");
sumOfOddNumbersUpToN(100);



/**
*! Find Sum of all even Numbers up to n Without Loop
*! Int n=100;
*! 2+4+6+....upto 100
*! Output:
*! 2550
*/

function sumOfEvenNumbersUpToN(n) {
    if (n < 1) {
        console.log("Input must be a natural number greater than 0.");
        return;
    }
    const countOfEvenNumbers = Math.floor(n / 2);
    const sum = countOfEvenNumbers * (countOfEvenNumbers + 1);
    console.log("Sum of Even Numbers up to", n, ":", sum);
}

console.log("Calculating Sum of Even Numbers up to N:");
sumOfEvenNumbersUpToN(100);


/**
*! Find Sum of squares of all Numbers up to n Without Loop
*! Int n=100;
*! 𝟏𝟐 +𝟐𝟐 +𝟑𝟐 +⋯...................𝒖𝒑𝒕𝒐 𝟏𝟎𝟎
*! Output:
*! 2550
*/

function sumOfSquaresUpToN(n) {
    if (n < 1) {
        console.log("Input must be a natural number greater than 0.");
        return;
    }
    const sum = (n * (n + 1) * (2 * n + 1)) / 6;
    console.log("Sum of squares of numbers up to", n, ":", sum);
}

console.log("Calculating Sum of Squares of Numbers up to N:");
sumOfSquaresUpToN(100);


/**
*! Evaluate the Expression:
*! int x = 5 / 2 * 2;
*! System.out.println(x);
*/

function evaluateExpression() {
    const x = Math.floor(5 / 2) * 2; // Using Math.floor to mimic integer division
    console.log("Value of x:", x);
}   

console.log("Evaluating Expression:");
evaluateExpression();


/**
*! Evaluate the Expression:
*! int n = 128;
*! int rev = (n % 10) * 100 + ((n / 10) % 10) * 10 + (n /100);
*! System.out.println(rev);
*/


function evaluateReverseExpression(n) {
    if (n < 100 || n > 999) {
        console.log("Input must be a 3-digit number.");
        return;
    }
    const rev = (n % 10) * 100 + Math.floor((n / 10) % 10) * 10 + Math.floor(n / 100);
    console.log("Reversed Number:", rev);
}   

console.log("Evaluating Reverse Expression:");
evaluateReverseExpression(128);



/**
*! Evaluate the Expression:
*! int n = 120;
*!int rev = (n % 10) * 100 + ((n / 10) % 10) * 10 + (n / 100);
*/

function evaluateReverseExpressionFor120(n) {
    if (n < 100 || n > 999) {
        console.log("Input must be a 3-digit number.");
        return;
    }
    const rev = (n % 10) * 100 + Math.floor((n / 10) % 10) * 10 + Math.floor(n / 100);
    console.log("Reversed Number for", n, ":", rev);
}

console.log("Evaluating Reverse Expression for 120:");
evaluateReverseExpressionFor120(120);


/**
*! Evaluate the Expression:
*! int x = 1 + 2 * 3 / 4;
*/

    const x = 1 + Math.floor(2 * 3 / 4);
    console.log("Value of x:", x);


/**
*!  Evaluate the Expression:
*! int x = 100 / 10 * 2 % 3;
*/


    const y = Math.floor(100 / 10) * 2 % 3;
    console.log("Value of x:", x);

/**
*! Evaluate the Expression:
*! System.out.println(0/0)
*/

function evaluateZeroDivision() {
    try {
        const result = 0 / 0;
        console.log("Result of 0/0:", result);
        System.out.println(0.0/0.0);
        System.out.println(1.0/0.0);
        System.out.println(-1.0/0.0);
    } catch (error) {
        console.error("Error: Division by zero is undefined.");
    }
}

evaluateZeroDivision();



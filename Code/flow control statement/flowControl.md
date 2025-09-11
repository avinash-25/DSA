# Flow Control Statement

Flow control statements are used to change the flow of execution of the program.

1. if
2. if else
3. else if / ladder if
4. nested if

## 1. if

`if` will check a condition and when condition is true then `if` block will execute otherwise if block will not execute.

**Syntax:**

```js
if (condition) {
    //if block
}
// outside statement
```

## 2. if else

`if else` is used to check a condition and when condition is true then `if` block is execute otherwise `else` block will execute.

**Syntax:**

```js
if (condition) {
    // if block
} else {
    //else block
}
```

<br><br><br><br><br><br><br><br><br><br>

## 3. else if/ladder if

It is used to check multiple conditions and when a condition found true then `if` block will execute.
If no condition is true then `else` block will execute.

**Syntax:**

```js
if (condition 1) {
    //if block-1
} else if (condition 2) {
    // if block-2
} else if (condition 3) {
    //if block -3
}
.
.
.
else {
    //else block
}
```

## 4. Nested if

When one `if` block is used inside another inside block then it is called `Nested if` block.

**Syntax:**

```js
if (condition - 1) {
    if (condition - 1.1) {
        //if block
    } else {
        //else block
    }
} else {
    if (condition - 1.1) {
        //if block
    } else {
        //else block
    }
}
```

<br><br><br><br><br><br><br><br><br><br>

# Loop

Loop is block of instruction which executes until loop condition will be true.
It is of two types:
- Entry control loop
- Exit control loop

Loop is faster than recursion.

## Entry control loop

If the loop condition is at entry point and after loop condition there is a loop body then it is called entry control loop.

Ex: `while` loop and `for` loop

## Exit control loop

If the loop condition is at exit but before loop condition there is a loop body then it is called exit control loop.

Ex: `do while` loop

## 1. while loop

`while` loop is a entry control loop which will execute repeatedly until loop condition will be true.

**Syntax:**

```js
while (condition) {
    // loop body

    // increment or decrement body
}
```

**Example:**

```js
let i = 1;

while (i <= 5) {
    console.log("i : ", i);
    i++;
}
// output
1
2
3
4
5
```

## 2. do while loop

`do while` is an exit control loop where first loop body executes and then condition is checked at the exit point.

**Syntax:**

```js
do {
    //loop body
    // increment/ decrement
} while (condition);
```

**Example:**

```js
let i = 1;

do {
    console.log(i);
    i++;
} while (i <= 10);
```

## break keyword

`break` is a keyword which is used to terminate the execution of loop.
When `break` keyword will execute then immediately that point loop execution will be suspended.

**Example:**

```js
let i = 1;

while (true) {
    console.log(i);

    if (i == 10)
        break;
    i++;
}
```

## continue keyword

`continue` statement is used to one or multiple executions from the loop.
When `continue` executes then control immediately transferred to the increment statement.

**⚠️ Important:** `continue` is not used with `while` loop otherwise loop becomes infinite. Because at the time of execution when control finds `continue`, it immediately looks for the increment in the same place where condition is mentioned. But in the `while` loop there is no increment operator, so the loop becomes infinite.

<br><br>

**Example:**

```js
for (let i = 0; i < 15; i++) {

    if (i == 7 || i == 10)
        continue;

    console.log(i);
}
```
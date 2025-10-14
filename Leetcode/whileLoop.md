## 1. 509 Fibonacci number
- https://leetcode.com/problems/fibonacci-number/description/

```js
var fib = function(n) {
    let a = 0;
    let b = 1;
    let i = 2;

    if(n<=0)
    return 0;

    if(n == 1)
    return 1;

    while(i <= n){
        c = a+b;
        a = b;
        b = c;
        i++;
    }
    return c;
};
```
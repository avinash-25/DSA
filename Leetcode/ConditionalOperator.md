## Leetcode Question and Solutions

1. 319 Bulb Switcher

- https://leetcode.com/problems/bulb-switcher/description/

```js
var bulbSwitch = function(n) {
    // return parseInt(Math.sqrt(n));

    let count = 0;
    let i = 1;
    while((i*i) <= n){
        count++;
        i++;
    }
    return count;
};
```

2. 292 Nim game
- https://leetcode.com/problems/nim-game/description/
- If condition is they can take 2 coin only then they loose on every 3rd coin and their multiple. and so on

```js
var canWinNim = function(n) {

    return n%4 != 0;


    // if(n % 4 == 0)
    //   return false;
    //   else
    //   return true;
};
```

3. 1025 Divisor Game

- https://leetcode.com/problems/divisor-game/description/

```js
var divisorGame = function(n) {
    return (n%2 == 0)? true : false;

};
```


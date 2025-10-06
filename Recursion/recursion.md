## Recursion
Recursion is a mechanaism where a method calls itself.
When a method calls itself then it starts executing again and again repeatedly and this process is called recursion.
If it is not controlled then it will give an error called `stackOverFlowError` error
It must be controlled by using flow control statement.
We can achieve recursion in 3 ways.

1. By calling Method from inside body.

```java
public static void test(){
  test();
}
```

2. By calling method from method call
```java
public static void test(){}

test();
```

3. By calling method from return statement
```java
public static void test(){
  return test();
}
```



### Recursion by calling by inside method body

when a method is called from inside method method body then it will executing repeatdely and if it is not controlled then it will exception. We can control it using flow control statement

### Questions

1. Print numbers from 1 to 10
2. Print numbers from 10 to 1 withot using loop
# Frequency Array.

int a[] = {7, 8, 6, 6, 5, 7, 10, 10, 7, 7, 5, 6, 8};

- first find maxm element
- then minimum element
- By doing this we can find How many different elements in the given array

max = 10
min = 5

Size of different element : `max - min + 1`;

- Make a new array of size different array

  b = {0, 0, 0, 0, 0, 0} ---> this is `frequency array`

- I will increment on that index continueously by 1 where index and value from previous array are matched.
- We can also find the element by : **Element = (index + min)**

So new b = {2, 3, 4, 2, 0, 2};

Here Frequency array indicates :

| value | (index) occurrence |
| ----- | ------------------ |
| 5     | (0) 2 times        |
| 6     | (1) 3 times        |
| 7     | (2) 4 times        |
| 8     | (3) 2 times        |
| 9     | (4) 0 times        |
| 10    | (5) 2 times        |

**Code :-**

```java
class FrequencyArray {
    public static void main(String[] args) {
        int a[] = { 7, 8, 6, 6, 5, 7, 10, 10, 7, 7, 5, 6, 8 };
        generateFrequencyArray(a);

    }

    public static void generateFrequencyArray(int[] a) {
        int max = a[0];
        int min = a[0];

        for (int x : a) {
            if (x > max)
                max = x;
            else if (x < min)
                min = x;
        }
        int[] frq = new int[max - min + 1];

        for (int x : a) {
            frq[x - min]++;
        }

        for (int i = 0; i < frq.length; i++) {
            if (frq[i] > 0)
                System.out.println((i + min) + " is " + frq[i] + " times");
        }
    }
}
```

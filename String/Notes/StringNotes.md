# String

## Key Points about String

- **Immutable**: Once created, String content cannot be changed
- **Reference type**: Stored in heap memory
- **Special pool**: String literals stored in String pool (part of heap)
- **Final class**: Cannot be extended
- **Thread-safe**: Due to immutability

---

## String Methods with Examples

**Input String: `"abcdE"`**

### 1. **charAt(int index)**

- **Definition**: Returns the character at specified index position
- **Example**: `s1.charAt(2)`
- **Output**: `'c'`

---

### 2. **substring(int beginIndex)**

- **Definition**: Returns substring from beginIndex to end of string
- **Example**: `s1.substring(2)`
- **Output**: `"cdE"`

---

### 3. **substring(int beginIndex, int endIndex)**

- **Definition**: Returns substring from beginIndex to endIndex-1 (endIndex excluded)
- **Example**: `s1.substring(1, 4)`
- **Output**: `"bcd"`

---

### 4. **length()**

- **Definition**: Returns total number of characters in string
- **Example**: `s1.length()`
- **Output**: `5`

---

### 5. **toUpperCase()**

- **Definition**: Converts all characters to uppercase
- **Example**: `s1.toUpperCase()`
- **Output**: `"ABCDE"`

---

### 6. **contains(CharSequence sequence)**

- **Definition**: Checks if string contains specified sequence of characters
- **Example**: `s1.contains("cd")`
- **Output**: `true`
- **Example**: `s1.contains("xy")`
- **Output**: `false`

---

**Note**: String class has both instance methods (like above) and static methods (like `valueOf()`, `format()`)

![alt text](../Images/image.png)

### Leetcode code Explanation

![alt text](<../Images/image copy.png>)

![alt text](<../Images/image copy 2.png>)

![alt text](<../Images/image copy 3.png>)


## Day - 2

String can uses by three ways

### String

String s1 = "Avinash"
String s2 = new String ("Mohan");
- It cant be modified
  
### Stringbuilder

Stringbuilder sb1 = new Stringbuilder("Mohan");
- String and String Builder both are differnet we cant consider equal
- It can be modified

### StringBuffer

StringBuffer sb2 = new StringBuffer("Mohan");
- It can also be modified

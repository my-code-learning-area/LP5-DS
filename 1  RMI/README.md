# Steps To Execute (Ensure you opened terminal in right folder)

### Step 1: Terminal 1

    javac *.java

### Step 2: Terminal 1

    rmiregistry

### Step 3: Terminal 2

ensure filename of your server

    java Server

### Step 4: Terminal 3

ensure filename of your client

`java Client input1 input2`

    java Client 2 3


---
---
---


## 1.6 formula to convert Celsius to Fahrenheit

where c is Celsius value

        (c * (9 / 5) + 32)


## 1.7 Miles to Kilometer

where m is Miles value

        m * 1.609344;


## 1.9 Compare Strings

        int result = c.compareTo(m);
        if (result > 0) {
            return c;
        } else if (result < 0) {
            return m;
        } 
        return c;


## 1.10 Count Vowels

        int vc = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vc++;
            }
        }


## 1.11 Factorial

        int fact = 1;
        for(int i = 1; i <= c; i++) {
            fact = fact * i;
        }
        return fact;
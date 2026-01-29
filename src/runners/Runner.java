package runners;

import answers.java.easy.*;

public class Runner {
    public static void main(String[] args) {
        System.out.println("============ Welcome to JAVA section ============");
        System.out.println("Max consecutive ones:" + new MaxConsecutiveOnes().findMaxConsecutiveOnes(new int[] { 1, 1, 0, 1, 1, 1 }));
    }
}

// compile: javac src\runners\Runner.java
// run: java src\runners\Runner.java

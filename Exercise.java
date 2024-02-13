import java.util.Scanner;

public class Exercise {
    static Scanner data = new Scanner(System.in);

    public static void main(String[] args) {
//        question1();
//        question2();
//        question3();
//        question4();
//        question5();
//        question6();
//        question7();
//        question8();
    
    }

    public static void question1() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }

            /*
            ASK TEACHER!
            WHY THIS DOES NOT GIVE ME THE RIGHT ANSWER ??
             */
//            if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            }else if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("FizzBuzz");
//            }
//            else {
//                System.out.println(i);
//            }

        }
    }

    public static void question2() {
        String sentence;
        System.out.print("Write Your Sentence: ");
        sentence = data.nextLine();
        for (int i = sentence.length(); i > 0; i--) {
            System.out.print(sentence.charAt(i - 1));
        }
//        StringBuilder sb = new StringBuilder(sentence);
//        System.out.println(sb.reverse());
    }

    //NOT COMPLATE YET!!
    public static void question3() {
        int num;
        int i = 1;
        int fact = 1;
        System.out.print("Enter the number: ");
        num = data.nextInt();

        //THIS IS IN FOR LOOP
//        for (i = 1; i <= num; i++) {
//            fact *= i;
//            System.out.println(fact);
//        }

        //THIS IS IN WHILE LOOP
        while (i <= num) {
            fact *= i;
            i++;
            System.out.println(fact);
        }
    }
    public static void question4() {
        int firstNumber;
        int secondNumber;
        int result = 1;
        System.out.print("Enter the first number: ");
        firstNumber = data.nextInt();
        System.out.print("Enter the second number: ");
        secondNumber = data.nextInt();

        for (int i = 0; i < secondNumber; i++) {
            result *= firstNumber;
        }
        System.out.println(result);
    }
    public static void question5() {
        System.out.println("Enter the number of integers: ");
        int n = data.nextInt();
        System.out.println("Enter the integers: ");
        int evenSum = 0;
        int oddSum = 0;
        for (int i = 0; i < n; i++) {
            int num = data.nextInt();
            if (num % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }
        }
        System.out.println("The sum of even integers is: " + evenSum);
        System.out.println("The sum of odd integers is: " + oddSum);
    }

    //NOT UNDERSTAND!!!!!
    public static void question6() {
        int input;
        int n;
        boolean isPrime = true;

        while(true) {
            System.out.println("Please Enter Positive Numbers ONLY: ");
            input = data.nextInt();

            if (input < 0) {
                System.out.println("Please Enter Positive Numbers ONLY: ");
            }
            for (int i = 2; i * i <= input; i++) {
                if (input % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (input < 2) {
                isPrime = false;
            }

            if (isPrime) {
                System.out.println(input + " is a prime number.");
            } else {
                System.out.println(input + " is not a prime number.");
            }
        }

    }
    public static void question7() {
        int weeks = 4;
        int days = 7;
        for (int i = 1; i <= weeks; i++) {
            System.out.println("Week" + i);
            for (int j = 1; j <= days; j++) {
                System.out.println("Day" + j);

            }
        }
    }
    public static void question8() {
        String word;
        System.out.println("Enter The Word: ");
        word = data.nextLine();
        boolean isPalindrome = true;
        int left = 0;
        int right = word.length() - 1;
        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        if (isPalindrome) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }

    }
}
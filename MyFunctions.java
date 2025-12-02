
import java.util.Random;
import java.util.Scanner;

public class MyFunctions {
    public static void problemNo1()
	{   
        Scanner s = new Scanner(System.in);
        
        System.out.print("Name: John Kenny Cabansay");
		String name = s.nextLine();
		
		System.out.print("Semeste: 1st ");
		String semester = s.nextLine();
		
		System.out.print("Degree Program: BSIT ");
		String degreeProgram = s.nextLine();
	}
	public static void problemNo2()
    {
    int height = 7;
		int width = 5;
		
		int perimeter = 2 * (height + width);
		
		int area = height * width;
		
		System.out.println("Perimeter of the rectangle = " + perimeter);
		System.out.print("Area if the rectangle = " + area);
    }
    
	public void problemNo3()
	{
		Scanner s = new Scanner(System.in);
		
		System.out.print("Input the Employees ID(Max. 10 chars): ");
		String id = s.nextLine();
		
		System.out.print("Input the working hrs: ");
		int workinghrs = s.nextInt();
		
		System.out.print("Salary amount/hr: ");
		int salaryAmount = s.nextInt();
		
		
		double salary = workinghrs * salaryAmount;
		
		System.out.println("Employees ID = " + id);
		
		System.out.printf("Salary = U$ %.2f%n ", salary);
	}

	public static void problemNo4()
	{   
        Scanner sc = new Scanner(System.in);

		System.out.print("Input the first integer: ");
        int a = sc.nextInt();

        System.out.print("Input the second integer: ");
        int b = sc.nextInt();

        System.out.print("Input the third integer: ");
        int c = sc.nextInt();

        int max = a;

        if (b > max) max = b;
        if (c > max) max = c;

    System.out.println("Maximum value of three integers: " + max);
	}

	public static void problemNo5()
	{
		Scanner sc = new Scanner(System.in);

        System.out.print("Input x1: ");
        double x1 = sc.nextDouble();

        System.out.print("Input y1: ");
        double y1 = sc.nextDouble();

        System.out.print("Input x2: ");
        double x2 = sc.nextDouble();

        System.out.print("Input y2: ");
        double y2 = sc.nextDouble();

        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println("Distance between the said points: %.4f " + distance);
	}

    public static void problemNo6()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input the amount: ");
        int amount = sc.nextInt();

        int n100 = amount / 100;
        amount %= 100;

        int n50 = amount / 50;
        amount %= 50;

        int n20 = amount / 20;
        amount %= 20;

        int n10 = amount / 10;
        amount %= 10;

        int n5 = amount / 5;
        amount %= 5;

        int n2 = amount / 2;
        amount %= 2;

        int n1 = amount;

        System.out.println("There are:");
        System.out.println(n100 + " Note(s) of 100.00");
        System.out.println(n50 + " Note(s) of 50.00");
        System.out.println(n20 + " Note(s) of 20.00");
        System.out.println(n10 + " Note(s) of 10.00");
        System.out.println(n5 + " Note(s) of 5.00");
        System.out.println(n2 + " Note(s) of 2.00");
        System.out.println(n1 + " Note(s) of 1.00");
    }

     public static void problemNo7()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input seconds: ");
        int total = sc.nextInt();

        int hours = total / 3600;
        total %= 3600;

        int minutes = total / 60;
        int seconds = total % 60;

        System.out.println("There are:");
        System.out.println("H:M:S - " + hours + ":" + minutes + ":" + seconds);
    }

     public static void problemNo8()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input a number between 1 to 12 to get the month name: ");
        int m = sc.nextInt();

        String month = "";

        switch (m) {
            case 1: 
            month = "January"; 
            break;
            case 2: 
            month = "February"; 
            break;
            case 3: 
            month = "March"; 
            break;
            case 4: 
            month = "April"; 
            break;
            case 5: 
            month = "May"; 
            break;
            case 6: 
            month = "June"; 
            break;
            case 7: 
            month = "July"; 
            break;
            case 8: 
            month = "August"; 
            break;
            case 9: 
            month = "September"; 
            break;
            case 10:
            month = "October"; 
            break;
            case 11: 
            month = "November"; 
            break;
            case 12: 
            month = "December"; 
            break;
            default: 
            month = "Invalid month number";
    }

    System.out.println(month);
    }

     public static void problemNo9()
    {
        Scanner sc = new Scanner(System.in);

        int pos = 0, neg = 0, num;

        System.out.print("Input the first number: ");
        num = sc.nextInt();
            if (num >= 0) 
        pos++; 
            else 
            neg++;

        System.out.print("Input the second number: ");
        num = sc.nextInt();
            if (num >= 0) 
        pos++; 
            else 
            neg++;

        System.out.print("Input the third number: ");
        num = sc.nextInt();
            if (num >= 0) 
        pos++; 
            else 
            neg++;

        System.out.print("Input the fourth number: ");
        num = sc.nextInt();
            if (num >= 0) 
        pos++; 
            else 
            neg++;

        System.out.print("Input the fifth number: ");
        num = sc.nextInt();
            if (num >= 0) 
        pos++; 
            else 
            neg++;

        System.out.println("Number of positive numbers: " + pos);
        System.out.println("Number of negative numbers: " + neg);
    }

     public static void problemNo10()
    {
        Scanner sc = new Scanner(System.in);
        int password;

            while (true) {
        System.out.print("Input the password: ");
        password = sc.nextInt();

            if (password == 1234) {
            System.out.println("Correct password");
            break;
        } 
        else 
        {
        System.out.println("Incorrect password");
        }
    }
    }

     public static void problemNo11()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input the Coordinate(x,y):");
        System.out.print("x: ");
        int x = sc.nextInt();
        System.out.print("y: ");
        int y = sc.nextInt();

            if (x > 0 && y > 0)
                System.out.println("Quadrant-I(+,+)");
            else if (x < 0 && y > 0)
                System.out.println("Quadrant-II(-,+)");
            else if (x < 0 && y < 0)
                System.out.println("Quadrant-III(-,-)");
            else if (x > 0 && y < 0)
                System.out.println("Quadrant-IV(+,-)");
            else
                System.out.println("The point lies on an axis.");
    }

    public static void problemNo12()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input two numbers:");
        System.out.print("x: ");
        double x = sc.nextDouble();
        System.out.print("y: ");
        double y = sc.nextDouble();

            if (y == 0)
                System.out.println("Division is not possible");
            else
                System.out.println(x / y);
    }

    public static void problemNo13()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input number of lines: ");
        int n = sc.nextInt();

        int num = 1;

            for (int i = 0; i < n; i++) {
                System.out.println(num + " " + (num + 1) + " " + (num + 2));
                num += 3;
            }
    }

    public static void problemNo14()
    {
        Scanner sc = new Scanner(System.in);
        int sum = 0, count = 0, mark;

        System.out.print("Input Mathematics marks (0 to terminate): ");

            while (true) {
                mark = sc.nextInt();
                if (mark <= 0) break;

                sum += mark;
                count++;
            }

            if (count > 0) {
                double avg = (double) sum / count;
                System.out.printf("Average marks in Mathematics: %.2f", avg);
            } 
            else {
                System.out.println("No marks entered.");
            }
    }

    public static void problemNo15()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input the length of the array: ");
        int len = sc.nextInt();

        int[] arr = new int[len];

        System.out.println("Input the array elements:");
            for (int i = 0; i < len; i++) {
                arr[i] = sc.nextInt();
            }

            int smallest = arr[0];
            int position = 0;

            for (int i = 1; i < len; i++) {
                if (arr[i] < smallest) {
                    smallest = arr[i];
                    position = i;
                }
            }

            System.out.println("Smallest Value: " + smallest);
            System.out.println("Position of the element: " + position);
    }

    public static void problemNo16()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input the distance in cm: ");
        double cm = sc.nextDouble();

        double inches = cm / 2.54;

        System.out.printf("Distance of %.2f cms is = %.2f inches", cm, inches);
    }

    public static void problemNo17()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input a number: ");
        int num = sc.nextInt();

        int original = num;
        int rev = 0;

            while (num != 0) {
                rev = rev * 10 + (num % 10);
                num /= 10;
            }

            System.out.println("The original number = " + original);
            System.out.println("The reverse of the said number = " + rev);
    }

    public static void problemNo18()
    {  
        Scanner sc = new Scanner(System.in);

        System.out.print("Input a value (negative): ");
        int num = sc.nextInt();

        System.out.println("Original value = " + num);
        System.out.println("Absolute value = " + Math.abs(num));
    }

    public static void problemNo19()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input the first integer: ");
        int a = sc.nextInt();

        System.out.print("Input the second integer: ");
        int b = sc.nextInt();

            if (b == 0) {
                System.out.println("Cannot check multiples of zero.");
            } 
            else if (a % b == 0) {
                System.out.println(a + " is a multiple of " + b + ".");
            } 
            else {
                System.out.println(a + " is not a multiple of " + b + ".");
            }
    }

    public static void problemNo20()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input some text:");
        sc.nextLine();  
        String text = sc.nextLine();

        String[] words = text.split(" ");

            for (String w : words) {
                System.out.println(w);
            }
    }

    public static void problemNo21()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input the currency value (floating point with two decimal places):");
        double value = sc.nextDouble();

        int pesos = (int) value;
        double centavos = value - pesos;

        int n100 = pesos / 100; pesos %= 100;
        int n50  = pesos / 50;  pesos %= 50;
        int n5   = pesos / 5;   pesos %= 5;
        int n2   = pesos / 2;   pesos %= 2;

        int c50 = (centavos >= 0.50) ? 1 : 0;
        centavos = centavos - (c50 * 0.50);

        int c25 = (centavos >= 0.25) ? 1 : 0;
        System.out.println("\nCurrency Notes:");
        System.out.println("100 number of Note(s): " + n100);
        System.out.println("50 number of Note(s): " + n50);
        System.out.println("5 number of Note(s): " + n5);
        System.out.println("2 number of Note(s): " + n2);
        System.out.println("\nCurrency Coins:");
        System.out.println(".50 number of Coin(s): " + c50);
        System.out.println(".25 number of Coin(s): " + c25);
    }

    public static void problemNo22()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input two angles of triangle separated by comma : ");
        String input = sc.next();

        String[] parts = input.split(",");
        int a1 = Integer.parseInt(parts[0]);
        int a2 = Integer.parseInt(parts[1]);

        int a3 = 180 - (a1 + a2);

        System.out.println("Third angle of the triangle : " + a3);
    }

    public static void problemNo23()
    {
        Scanner sc = new Scanner(System.in);

        char ch = sc.next().toLowerCase().charAt(0);

        if ("aeiou".indexOf(ch) != -1)
        System.out.println("The alphabet is a vowel.");
        else
        System.out.println("The alphabet is a consonant.");
    }

    public static void problemNo24()
    {
        Scanner sc = new Scanner(System.in);
    int digit = sc.nextInt();

    switch (digit) {
        case 0: 
        System.out.println("Zero"); 
        break;
        case 1: 
        System.out.println("One"); 
        break;
        case 2: 
        System.out.println("Two"); 
        break;
        case 3: 
        System.out.println("Three"); 
        break;
        case 4: 
        System.out.println("Four"); 
        break;
        case 5: 
        System.out.println("Five"); 
        break;
        case 6: 
        System.out.println("Six"); 
        break;
        case 7: 
        System.out.println("Seven"); 
        break;
        case 8: 
        System.out.println("Eight"); 
        break;
        case 9: 
        System.out.println("Nine"); 
        break;
        default: 
        System.out.println("Not a digit");
        }
    }

    public static void problemNo25()
    {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();

        int secret = rnd.nextInt(20) + 1;
        int guess = 0;

        System.out.println("Guess a number between 1 and 20:");

        while (guess != secret) {
            guess = sc.nextInt();

            if (guess == secret)
                System.out.println("Correct! The number is " + secret);
            else
                System.out.println("Wrong! Try again:");
        }
    }

    public static void problemNo26()
    {
        Scanner sc = new Scanner(System.in);
        String username = "";

        while (username.length() < 8) {
            System.out.print("Enter username (min 8 characters): ");
            username = sc.nextLine();

            if (username.length() < 8)
                System.out.println("Invalid. Try again.");
        }

        System.out.println("Username accepted!");
    }

    public static void problemNo27()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();

        long fact = 1;
        int i = 1;

        while (i <= n) {
            fact *= i;
            i++;
        }

        System.out.println("Factorial of " + n + " = " + fact);
    }

    public static void problemNo28()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();

        int i = 1;
        while (i <= 10) {
            System.out.println(n + " x " + i + " = " + (n * i));
            i++;
        }
    }

    public static void problemNo29()
    {
        for (int i = 1; i <= 100; i++) {
        if (i % 15 == 0)
            System.out.println("FizzBuzz");
        else if (i % 3 == 0)
            System.out.println("Fizz");
        else if (i % 5 == 0)
            System.out.println("Buzz");
        else
            System.out.println(i);
    }
    }

    public static void problemNo30()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input a sentence: ");
        sc.nextLine(); 
        String sentence = sc.nextLine();

        String[] words = sentence.split(" ");

        String longest = words[0];

        for (String w : words) {
            if (w.length() > longest.length()) {
                longest = w;
            }
        }

        System.out.println("Longest word: " + longest);
        System.out.println("Length: " + longest.length());
    }

    public static void problemNo31()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input the number of elements to be stored in the array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Input " + n + " elements in the array :");
        for (int i = 0; i < n; i++) {
            System.out.print("element - " + i + " : ");
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Maximum element is : " + max);
        System.out.println("Minimum element is : " + min);
    }

    public static void problemNo32()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input the number of elements to be stored in the array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Input " + n + " elements in the array :");
        for (int i = 0; i < n; i++) {
            System.out.print("element - " + i + " : ");
            arr[i] = sc.nextInt();
        }

        System.out.println("The Even elements are :");
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }

        System.out.println("\nThe Odd elements are :");
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void problemNo33()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input the size of array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Input " + n + " elements in the array :");
        for (int i = 0; i < n; i++) {
            System.out.print("element - " + i + " : ");
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Elements of array in sorted ascending order:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void problemNo34()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input the size of array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Input " + n + " elements in the array :");
        for (int i = 0; i < n; i++) {
            System.out.print("element - " + i + " : ");
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Elements of the array in sorted descending order:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void problemNo35()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input the size of array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Input " + n + " elements in the array :");
        for (int i = 0; i < n; i++) {
            System.out.print("element - " + i + " : ");
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("The Second largest element in the array is : " + arr[n - 2]);
    }

    public static void problemNo36()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input any number : ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("The entered number is even.");
        } else {
            System.out.println("The entered number is odd.");
        }
    }

    public static void problemNo37()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input any decimal number : ");
        int num = sc.nextInt();

        String bin = "";
        int temp = num;

        while (temp > 0) {
            int r = temp % 2;
            bin = r + bin;
            temp = temp / 2;
        }

        System.out.println("The Binary value is : " + bin);
    }

    public static void problemNo38()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input year: ");
        int year = sc.nextInt();

        if (year < 1000 || year > 9999) {
            System.out.println("invalid year");
        } else {
            if (year % 400 == 0) {
                System.out.println("Leap Year");
            } else if (year % 100 == 0) {
                System.out.println("Not a Leap Year");
            } else if (year % 4 == 0) {
                System.out.println("Leap Year");
            } else {
                System.out.println("Not a Leap Year");
            }
        }
    }

    public static void problemNo39()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("WELCOME TO NICO’S COMPUTING AREA OF THE CIRCLE PROGRAM");
        System.out.print("Input radius: ");
        float r = sc.nextFloat();

        float area = getAreaCircle(r);

        System.out.println("The area is : " + String.format("%.2f", area));
    }

    public static float getAreaCircle(float r) {
        return 3.1416f * r * r;
    }

    public static void problemNo40()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("WELCOME TO NICO’S COMPUTING AREA OF THE SQUARE PROGRAM");
        System.out.print("Input side: ");
        float side = sc.nextFloat();

        float area = getAreaSquare(side);

        System.out.println("The area is : " + String.format("%.2f", area));
    }

    public static float getAreaSquare(float s) {
        return s * s;
    }

    public static void problemNo41()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("WELCOME TO NICO’S COMPUTING AREA OF THE RECTANGLE PROGRAM");

        System.out.print("Input length: ");
        float length = sc.nextFloat();

        System.out.print("Input width: ");
        float width = sc.nextFloat();

        float area = getArea(length, width);

        System.out.println("Output: the area is : " + area);
    }

    public static float getArea(float length, float width) {
    return length * width;
    }

    public static void problemNo42()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("INPUT FIVE DIGIT INTEGER: ");
        int num = sc.nextInt();

        if (num < 10000 || num > 99999) {
            System.out.println("ONLY FIVE DIGIT");
            return;
        }

        int rev = 0;
        int temp = num;

        while (temp != 0) {
            int digit = temp % 10;
            rev = rev + digit;
            rev = (rev * 10) - digit;  
            temp /= 10;
        }

        if (rev == num) {
            System.out.println("PALINDROME");
        } else {
            System.out.println("NOT PALINDROME");
        }
    }

    public static void problemNo43()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("INPUT FOUR DIGIT INTEGER: ");
        int num = sc.nextInt();

        if (num < 1000 || num > 9999) {
            System.out.println("ONLY FOUR DIGIT");
            return;
        }

        String s = Integer.toString(num);

        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i) + " ");
        }
    }

    public static void problemNo44()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter income: ");
        double income = sc.nextDouble();

        double tax;

        if (income <= 50000) {
            tax = income * 0.10;
        } 
        else if (income <= 100000) {
            tax = 5000 + (income - 50000) * 0.15;
        } 
        else if (income <= 200000) {
            tax = 15000 + (income - 100000) * 0.20;
        } 
        else {
            tax = income * 0.25;
        }

        System.out.println("Tax Due: " + tax);
    }

    public static void problemNo45()
    {
         Scanner sc = new Scanner(System.in);

        System.out.print("Input digit: ");
        long num = sc.nextLong();

        if (num == 0) {
            System.out.println("zero");
            return;
        }

        System.out.println(convertToWords(num));
    }

    private static String convertToWords(long n) {
        String[] ones = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] teens = {"ten","eleven","twelve","thirteen","fourteen","fifteen",
                        "sixteen","seventeen","eighteen","nineteen"};
        String[] tens = {"", "", "twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
        String[] thousands = {"","thousand","million","billion"};

        String words = "";
        int i = 0;

        while (n > 0) {
            int chunk = (int)(n % 1000);
            if (chunk != 0) {
                words = convertChunk(chunk, ones, teens, tens) 
                        + " " + thousands[i] + " " + words;
            }
            n /= 1000;
            i++;
        }

        return words.trim();
    }

    private static String convertChunk(int n, String[] ones, String[] teens, String[] tens) {
        String result = "";

        if (n >= 100) {
            result += ones[n / 100] + " hundred ";
            n %= 100;
        }

        if (n >= 20) {
            result += tens[n / 10] + " ";
            n %= 10;
        } else if (n >= 10) {
            return result + teens[n - 10];
        }

        if (n > 0) {
            result += ones[n] + " ";
        }

        return result.trim();
    }   

    public static void problemNo46()
    {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Input: ");
            String txt = sc.nextLine();

            if (txt.equals("tiuq")) {
                break;
            }

            StringBuilder sb = new StringBuilder(txt);
            System.out.println(sb.reverse().toString());
        }
    }

    public static void problemNo47()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        int a = 1, b = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }

    public static void problemNo48()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();

        System.out.print("Enter years: ");
        int years = sc.nextInt();

        if (amount <= 0 || years <= 0) {
            System.out.println("Invalid input.");
            return;
        }

        for (int i = 1; i <= years; i++) {
            amount += amount * 0.10;
        }

        System.out.println("Future Value: " + amount);
    }

    public static void problemNo49()
    {
        Scanner sc = new Scanner(System.in);

        int total = 0;
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int posTotal = 0;
        int negTotal = 0;
        int negCount = 0;
        int rangeCount = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter number " + i + ": ");
            int n = sc.nextInt();

            total += n;
            if (n > largest) largest = n;
            if (n < smallest) smallest = n;

            if (n > 0) posTotal += n;
            if (n < 0) {
                negTotal += n;
                negCount++;
            }

            if (n >= 50 && n <= 100) rangeCount++;
        }

        System.out.println("Total: " + total);
        System.out.println("Largest: " + largest);
        System.out.println("Smallest: " + smallest);
        System.out.println("Total Positive: " + posTotal);
        System.out.println("Total Negative: " + negTotal);
        System.out.println("Negative Count: " + negCount);
        System.out.println("Numbers between 50-100: " + rangeCount);
    }

    public static void problemNo50()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter destination code (1-4): ");
        int dest = sc.nextInt();

        System.out.print("Enter time code (1=day, 2=night): ");
        int time = sc.nextInt();

        System.out.print("Enter duration (minutes): ");
        int mins = sc.nextInt();

        int block = 0;
        double rate = 0;

        if (dest == 1) {
            block = 3;
            rate = (time == 1) ? 50 : 45;
        } else if (dest == 2) {
            block = 2;
            rate = (time == 1) ? 30 : 27;
        } else if (dest == 3) {
            block = 3;
            rate = (time == 1) ? 40 : 36;
        } else if (dest == 4) {
            block = 2;
            rate = (time == 1) ? 35 : 30;
        } else {
            System.out.println("Invalid destination.");
            return;
        }

        int blocks = (int)Math.ceil((double)mins / block);
        double total = blocks * rate;

        System.out.println("Total Charges: P " + total);
    }

    public static void problemNo51()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance in meters: ");
        int dist = sc.nextInt();

        double fare = 20.00; 

        if (dist > 300) {
            int extra = dist - 300;

            int blocks = (int)Math.ceil(extra / 200.0);

            fare += blocks * 2.00;
        }

        System.out.println("Taxi fare: P " + fare);
    }

    public static void problemNo52()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter code: ");
        String code = sc.nextLine();

        if (code.length() > 5) {
            System.out.println("invalid code");
            return;
        }

        if (!code.startsWith("*")) {
            System.out.println("invalid code");
            return;
        }

        char last = code.charAt(code.length() - 1);
        if (!Character.isLetter(last)) {
            System.out.println("invalid code");
            return;
        }

        System.out.println("valid code");
    }

    public static void problemNo53()
    {
        Scanner sc = new Scanner(System.in);

        double[] score = new double[10];
        System.out.println("Please enter 10 scores:");

        for (int i = 0; i < 10; i++) {
            score[i] = sc.nextDouble();
        }

        double total = 0;
        double highest = score[0];
        double lowest = score[0];

        for (int i = 0; i < 10; i++) {
            total += score[i];

            if (score[i] > highest) highest = score[i];
            if (score[i] < lowest) lowest = score[i];
        }

        double finalScore = (total - highest - lowest) / 8;

        System.out.println("The final score is: " + String.format("%.2f", finalScore));
    }

    public static void problemNo54()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Base: ");
        int base = sc.nextInt();

        System.out.print("Exponent: ");
        int exp = sc.nextInt();

        int result = 1;

        for (int i = 1; i <= exp; i++) {
            result *= base;
        }

        System.out.println("Output: " + result);
    }

    public static void problemNo55()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input number: ");
        int n = sc.nextInt();

        printPattern(n);
    }

    public static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void problemNo56()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("input number: ");
        String num = sc.nextLine();

        int bombs = 0;

        for (int i = 0; i < num.length(); i++) {
            char c = num.charAt(i);

            if (!Character.isDigit(c)) continue; 

            switch (c) {
                case '0':
                case '5':
                case '6':
                case '7':
                    bombs += 1;
                    break;

                case '1':
                case '2':
                    bombs += 2;
                    break;

                default:
                    bombs += 0;
            }
        }

        System.out.println("output: " + bombs + " bombs");
    }

}

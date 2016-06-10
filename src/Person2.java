import java.util.Scanner;

public class Person2 {
    private int age;

    public Person2(int initialAge) {
        if (initialAge <0) {
            this.age = 0;
            System.out.println("Age is not valid, setting age to 0");
        }
        else
            this.age=initialAge;

    }

    public void amIOld() {
        // Write code determining if this person's age is old and print the correct statement:
        String ans = null;
        if (this.age < 13)
            ans ="You are young";
        else {
            if (this.age >= 13 && this.age < 18)
                ans="You are a teenager";
            else
                ans="You are old";
        }

        System.out.println(ans);
    }

    public void yearPasses() {
        this.age = this.age + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int age = sc.nextInt();
            Person2 p = new Person2(age);
            p.amIOld();
            for (int j = 0; j < 3; j++) {
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        }
        sc.close();
    }
}


import java.io.Console;

public class Q2 {
    int marks;

    void input() {
        Console c = System.console();
        marks = Integer.parseInt(c.readLine("Enter your marks : "));

    }

    void cal() {
        if (marks <= 100 && marks >= 80) {
            System.out.println("Honours");
        }
        if (marks <= 79 && marks >= 60) {
            System.out.println("First Division");
        }
        if (marks <= 59 && marks >= 50) {
            System.out.println("Second Division");
        }
        if (marks <= 49 && marks >= 0) {
            System.out.println("Fail");
        }
    }

    public static void main(String[] args) {
        Q2 ob = new Q2();
        ob.input();
        ob.cal();
    }
}

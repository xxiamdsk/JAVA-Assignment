import java.io.Console;

class Q1 {
    int com;

    void comm() {
        Console c = System.console();
        com = Integer.parseInt(c.readLine("Enter your sales amount : "));
    }

    void commcal() {
        if (com <= 500) {
            System.out.println("Your commission is 5% : ");
            System.out.println("commission=" + (com * .05));
        } 
        else if (com > 500 && com <= 2000) {
            System.out.println("Your commission is Rs.35 plus 10% ");
            System.out.println("commission=" + (35 + com * .1));
        } 
        else if (com > 2000 && com <= 5000) {
            System.out.println("Your commission is Rs.35 plus 10% ");
            System.out.println("commission=" + (185 + com * .12));
        } 
         else if (com > 5000) {
            System.out.println("Your commission is Rs.35 plus 10% ");
            System.out.println("commission=" + (com * .125));
        }
        else
        System.out.println("Enter valid sales amount");
    }

    public static void main(String[] args) {
        Q1 ob = new Q1();
        ob.comm();
        ob.commcal();
    }
}

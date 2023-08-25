import java.net.Socket;
import java.security.Principal;
import java.text.NumberFormat;
import java.time.Period;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

import javax.sound.midi.Soundbank;
import javax.swing.JOptionPane;
import javax.swing.text.Position;

public class Main {
    public static void main(String[] args) {
       /* x byte myAge = 30;
        long viewsCount = 3_123_456_789L;
        float price = 10.99F;
        char letter = 'A';
        boolean isEligible = false;
        

        Date now = new Date();
        System.out.println(now);

        byte x = 1;
        byte y = 1;

        String message = "Hello World" + "!!";
        System.out.println(message.endsWith("!!"));
        System.out.println(message.length());
        System.out.println(message.indexOf("H"));
        System.out.println(message.replace("!", "*"));
        System.out.println(message.toLowerCase());
        System.out.println(message.trim());

        String message1 = "Hello \" Lebang";
        System.out.println(message1);

        String message2 = "new \nline";
        System.out.println(message2);        

        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        
        System.out.println(Arrays.toString(numbers)); 

        int[] numbers = {2,3,5,1,4};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers)); 

        int [][] numbers = new int[2][3];
        numbers[0][0] = 1;
        System.out.println(Arrays.deepToString(numbers));

        int [][] numbers = {{1,2,3},{4,5,6}}; 



        double result = (double)10 / (double)3;
        System.out.println(result);

        int x = 1;
        x++;
        System.out.println(x);

        x += 2;
        System.out.println(x); 

        short x = 1;
        int y = x + 2;
        System.out.println(y);

        String i = "1";
        int j = Integer.parseInt(i) + 2;
        System.out.println(j); 

        int result = Math.round(1.1F);
        System.out.println(result);

        int result2 =(int) Math.ceil(1.1F);
        System.out.println(result2);

        int result3 = (int)Math.floor(1.1F);
        System.out.println(result3);

        int result4 = (int)Math.max(1, 2);
        System.out.println(result4);

        double result5 = Math.random();
        System.out.println(result5);

        double result6 = (int)Math.round(Math.random()*100);
        System.out.println(result6); 

        
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(1234567.891);
        System.out.println(result);


        NumberFormat percent = NumberFormat.getPercentInstance();
        String result2 = percent.format(0.1);
        System.out.println(result2); 

        Scanner scanner = new Scanner(System.in);
        System.out.print("Age: ");
        byte age = scanner.nextByte();
        System.out.println("You are " + age); 

        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");
        String name = scanner.nextLine().trim();
        System.out.println("You are " + name);

        Principal
        AnnualInterestRate
        Period
        Mortgage(answer); 

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        NumberFormat number = NumberFormat.getNumberInstance();
        
        Scanner principle = new Scanner(System.in);
        System.out.print("Principle: ");
        int P = principle.nextInt();
        String P2 = currency.format(P);
        System.out.println(P2);

        Scanner annualInterest = new Scanner(System.in);
        System.out.print("Annual Interest: ");
        float r = annualInterest.nextFloat();
        float r2 = r/100/12;
        System.out.println(r);
        

        Scanner Period = new Scanner(System.in);
        System.out.print("Period: ");
        int n = Integer.parseInt(Period.next());
        int n2 = n * 12;
        System.out.println(n2);

        double Mortgage = P*((r2*(Math.pow((1+r2), n2)))/((Math.pow((1+r2), n2))-1));
        String mortgageFormatted = currency.format(Mortgage);
        System.out.println(mortgageFormatted); 

        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hello " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null, "You are " + age + " years old");

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
        JOptionPane.showMessageDialog(null, "You are " + height + "cm tall"); 

        Random random = new Random();

        int x = random.nextInt(6)+1;
        double y = random.nextDouble();
        boolean z = random.nextBoolean();

        System.out.println(x);
        System.out.println(y);
        System.out.println(z); */

        int age = 18;

        if (age >= 18) {
            System.out.println("yep");
        }
    }
}

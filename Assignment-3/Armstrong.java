import java.util.Scanner;
class Armstrong {

    public static void main(String[] args) {

        int num, number, temp, total = 0;
        System.out.println("Enter the number ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        sc.close();
        number = num;

        for( ;number!=0;number /= 10)
        {
            temp = number % 10;
            total = total + temp*temp*temp;
        }

        if(total == num)
            System.out.println(num + " is Armstrong number");
        else
            System.out.println(num + " is not an Armstrong number");
    }
}
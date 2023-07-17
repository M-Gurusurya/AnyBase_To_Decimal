import java.util.Scanner;

    public class AnybaseToDecimal {
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            System.out.println("enter Decimal");
            int decimal=scanner.nextInt();
            System.out.println("enter base");
            int base=scanner.nextInt();
            System.out.println(findBaseToDecimal(decimal,base));
        }
        public static int findBaseToDecimal(int decimal,int base)
        {
            int sum=0;
            int pow=1;
            while (decimal>0)
            {
                sum+=decimal%10*pow;
                pow=pow*base;
                decimal=decimal/10;
            }
            return sum;
        }
    }



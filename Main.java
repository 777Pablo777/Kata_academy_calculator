import javax.lang.model.element.NestingKind;
import java.util.Scanner;
public class Main {
    public static char operation = 0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        calc(s);

    }
    public static void calc(String input) {
        char[] ch = input.toCharArray();
        int count = 0;

            for (int i = 0; i < ch.length; i++) {
                if (ch[i] == '+' | ch[i] == '-' | ch[i] == '*' | ch[i] == '/') {
                    count++;
                    operation = ch[i];
                }

            }
            if (count == 0) {
                throw new ArithmeticException("строка не является математической операцией");
            }
            if (count>=2){
                throw new ArithmeticException("формат математической операции не удовлетворяет заданию - два операнда");
            }

        char n = 0;
        int x1 = 0;
        for (int i = 0; i < ch.length; i++) {
            x1++;
            if (ch[i] == '+' | ch[i] == '-' | ch[i] == '*' | ch[i] == '/') {
                n = ch[i - 1];
                break;
            }
        }

        int n1 = n;

        if(x1==3){
            if(ch[0]=='1'& ch[1]=='0') {
                n1 = 10;
            }
            else {
                    throw new ArithmeticException("формат математической операции не удовлетворяет заданию");
                }


        } else if (x1==2) {
            if ( 48 <= n1  & n1 <= 58) {
                n1 = n1 - '0';
                if(n1==0){
                    throw new ArithmeticException("формат математической операции не удовлетворяет заданию");
                }
            }else {
                throw new ArithmeticException("формат математической операции не удовлетворяет заданию");
            }
        }
        else {
            throw new ArithmeticException("формат математической операции не удовлетворяет заданию");
        }

        char m = 0;
        int x2 = 0;

        for (int i = ch.length - 1; i >= 0; i--) {
            x2++;
            if (ch[i] == '+' | ch[i] == '-' | ch[i] == '*' | ch[i] == '/') {
                m = ch[i + 1];
                break;
            }
        }

        int m1 = m;

        if(x2==3){
            if(ch[ch.length-1]=='0' & ch[ch.length-2]=='1') {
                m1 = 10;
            }
            else{
                throw new ArithmeticException("формат математической операции не удовлетворяет заданию");
            }
        } else if (x2==2) {
            if (48 <= m1 & m1 <= 57) {
                m1 = m1 - '0';
                if(m1==0){
                    throw new ArithmeticException("формат математической операции не удовлетворяет заданию");
                }
            }
            else {
                throw new ArithmeticException("формат математической операции не удовлетворяет заданию");
            }}
        else {
            throw new ArithmeticException("формат математической операции не удовлетворяет заданию");
        }

        if(operation=='+'){
            System.out.println(n1+m1);
        }
        if(operation=='-'){
            System.out.println(n1-m1);
        }
        if(operation=='*'){
            System.out.println(n1*m1);
        }
        if(operation=='/'){
            System.out.println(n1/m1);
        }
    }
}

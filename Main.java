import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        char[] ch = str.toCharArray();
        int count = 0;
        char x = 0;
        if (3 <= ch.length & ch.length <= 5) {
            for (int i = 0; i < ch.length; i++) {
                if (ch[i] == '+' | ch[i] == '-' | ch[i] == '*' | ch[i] == '/') {
                    count++;
                    x = ch[i];
                }

            }
            if (count != 1) {
                System.out.println("throws Exception");
                System.exit(0);
            }
        } else {
            System.out.println("throws Exception");
            System.exit(0);
        }

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '.' | ch[i] == ',') {
                System.out.println("throws Exception");
                System.exit(0);

            }
        }
        char n = 0;
        char m = 0;
        int x1 = 0;
        int x2 = 0;
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
            else{
                System.out.println("throws Exception");
                System.exit(0);
                }

        } else if (x1==2) {
            if (48 <= n1 & n1 <= 57) {
                n1 = n1 - '0';
            }
        }
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
               System.out.println("throws Exception");
               System.exit(0);
           }
        } else if (x2==2) {
            if (48 <= m1 & m1 <= 57) {
                m1 = m1 - '0';
            }
        }
        else {
            System.out.println("throws Exception");
            System.exit(0);
        }

        if(x=='+'){
            System.out.println(n1+m1);
        }
        if(x=='-'){
            System.out.println(n1-m1);
        }
        if(x=='*'){
            System.out.println(n1*m1);
        }
        if(x=='/'){
            System.out.println(n1/m1);
        }
    }
}

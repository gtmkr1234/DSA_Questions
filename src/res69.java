import java.util.Scanner;

public class res69 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int modi = s.nextInt();
        while(modi-->0){
            int len = s.nextInt();
            char[] ch = s.next().toCharArray();
            int q=0;
            for (int i = 0; i < len; i++) {
                if(ch[i]=='Q') q++;
                else q=Math.max(0,q-1);
            }
            System.out.println(q==0?"Yes":"No");
        }
    }
}

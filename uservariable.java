import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class uservariable {
    public static void main(String[] args) throws IOException {
        int a,b;
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the value of a");
        a=Integer.parseInt(br.readLine());
        System.out.println("enter the value of b");
        b=Integer.parseInt(br.readLine());
        System.out.println((a+b)/2);

    }
}

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(fibo(a));
        System.out.println(fact(a));

    }

    public static int fibo(int a)
    {
        if(a == 0 || a== 1)
        {
            return a;
        }
        return fibo(a-1)+fibo(a-2);
    }

    public static int fact(int a)
    {
        if(a <= 1)
        {
            return a;
        }
        return a*fact(a-1);
    }
}
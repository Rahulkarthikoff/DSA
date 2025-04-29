import java.util.*;
public class Derangement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]a = new int[n];
        int[]b = new int[n];

        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
            b[i] = a[i];
        }

//        for(int i=0;i<n;i++)
//        {
//            System.out.println(a[i]);
//        }

        Arrays.sort(a);
        reverseArray(a,n);

        for(int i=0;i<n;i++)
        {
            if(a[i] == b[i])
            {
                if(i+1 < n)
                {
                    int t = a[i];
                    a[i] = a[i+1];
                    a[i+1] = t;
                }
            }
        }


        for(int i : a)
        {
            System.out.print(i+" ");
        }
    }

    public static void reverseArray(int[] a, int n)
    {
        int l = 0, r = n-1;

        while(l < r)
        {
            int t = a[l];
            a[l] = a[r];
            a[r] = t;
            l++;
            r--;
        }
    }
}

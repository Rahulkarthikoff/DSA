public class TCSDigital {
    public static void main(String[] args) {
//        int[] a = {1,3,5,8,9,2,6};
//        int[] a = {1,4,3,1,2,0,7,8,6};
        int[] a = {3, 2, 1, 0, 4};
//        a = [3, 2, 1, 0, 4]

        int n = 9;
//        int ans = countSteps(0,a, n);

//        int mini = n;
        int jump = 0;

        for(int i = 1;i<=a.length;)
        {
            if(a[i] == 0)
            {
                i--;
            }else {
                i += a[i];
                jump++;
            }
        }
        System.out.println(jump+1);
//        mini = Math.min(mini, jump);
    }


}

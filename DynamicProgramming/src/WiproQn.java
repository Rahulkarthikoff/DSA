public class WiproQn {
    public static void main(String[] args) {
        int[] a = {1237,262,666,140};

        int[] freq = new int [10];

        for(int i : a)
        {
            while(i >0)
            {
                int rem = i%10;
                freq[rem]++;
                i/=10;
            }
        }
        int maxi = freq[0];
        int index = -1;
        for(int i = 0;i<10;i++)
        {
            if(freq[i] > maxi)
            {
                maxi = freq[i];
                index = i;
            }
        }

        System.out.println(index+" "+freq[index]+" times");

        System.out.println(freq[6]);
    }
}

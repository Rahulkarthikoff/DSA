class WiproQns {
    public static void main(String[] args) {
        int num = 976592;
        System.out.println(count(num));

    }
    public static int count(int num)
    {
        if(num==0) return 0;
        else
            return ((num%9==0)?9:num%9);
    }
}
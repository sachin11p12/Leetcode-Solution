package String_Solution;

public class _443_compres_string {
    public static String  compress(String ans, char[] arr, int i, int j ){
        ans += arr[i];
        int len = j-i;
        if (len>1) ans +=len;

        
        return ans;
    }
    public static void main(String[] args) {
        String s ="aabbcc";
        char [] arr = s.toCharArray();
        String ans = "";
        int i =0, j=0;
        String a ="";
        while(j<arr.length){
            if(arr[j]==arr[i]) j++;
            else {
                a += compress(ans,arr,i,j);
                i=j;

            }
        }
        a += compress(ans, arr, i ,j);
        System.out.println(a);
    }
}

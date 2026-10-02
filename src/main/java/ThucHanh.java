public class ThucHanh {
    public static void main(String[] args) {
        System.out.println("====bai 1 ====");
        int[]arr={3,1,3,2,1,3};
        bai_1(arr);
        System.out.println("====bai 2 ====");
        bai_2(3);

        String chuoi="hoc lap trinh tai CodeGym";
        String[] word=chuoi.split(" ");
        System.out.println("====bai 3 ====");
        bai_3(word);
        System.out.println("====bai 4 ====");
        bai_4(12,18);
        bai_4(8,4);

        System.out.println("====bai 5 ====");
        int[] arr5={1,4,7,9,12};
        int check=bai_5(arr5,9);
        int check2=bai_5(arr5,5);
        if (check==-1){
            System.out.println("ko tim thay");
        }
        else {
            System.out.println("vi tri: "+check);
        }
        if (check2==-1){
            System.out.println("ko tim thay");
        }
        else {
            System.out.println("vi tri: "+check);
        }
        System.out.println("====bai 6 ====");
        bai_6(13);
    }

    public static void bai_1(int[]arr){
        int max=0;
        int soMax=0;
        for (int i=0;i<arr.length;i++){
            boolean check=true;
            for (int j=0;j<i;j++){
                if (arr[i]==arr[j]){
                    check=false;
                    break;
                }
            }
            if (check){
                int dem=1;
                for (int j=i+1;j<arr.length;j++){
                    if (arr[i]==arr[j])dem++;
                }

                if (dem>max){
                    max=dem;
                    soMax=arr[i];
                }
            }
        }
        System.out.println("Mon "+soMax+" ban chay nhat : "+max+" lan");
    }

    public static void bai_2(int n){
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int j=n+1-i;j<=n-1+i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }


    public static void bai_3(String[] chuoi){
        String maxWord="";
        int maxLength=0;
        for (int i=0;i<chuoi.length;i++){
            if (chuoi[i].length()>maxLength){
                maxLength=chuoi[i].length();
                maxWord=chuoi[i];
            }
        }
        System.out.println(chuoi.length+" tu, "+"tu dai nhat: "+maxWord);
    }

    public static int ucln(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
    public static void bai_4(int a,int b){
        int phanTu=a/ucln(a,b);
        int phanMau=b/ucln(a,b);
        System.out.println(phanTu+"/"+phanMau);
    }

    public static int bai_5(int[]arr,int x){
        int left=0,right= arr.length-1;
        while (left<=right){
            int mid=(left+right)/2;
            if (arr[mid]==x){
                return mid+1;
            }
            else if (arr[mid]<x){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return -1;
    }

    public static void bai_6(int n){
        String result="";
        while (n>0){
            int soDu=n%2;
            result=soDu+result;
            n/=2;
        }
        System.out.println(result);
    }
}

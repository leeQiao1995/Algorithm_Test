public class MoreThanHalfNum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,2,2,2,4,5};
        MoreThanHalfNum m = new MoreThanHalfNum();
        System.out.println(m.getNum(arr));

    }
    public int getNum(int[] arr){
        int num=arr[0];
        int count=0;
        for(int i=1;i<arr.length;i++){
            if(num==arr[i]){
                count++;
            }
            if(count==0){
                num=arr[i];
            }
        }
        count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num)
                count++;
        }
        if(count>arr.length/2){
            return num;
        }else{
            return 0;
        }
    }
}

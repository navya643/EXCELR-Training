import java.util.Arrays;
class Demo064{
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,5};
        System.out.println("before swapping: "+Arrays.toString(arr));
        int temp = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length -1] = temp;
        System.out.println("After swapping:"+Arrays.toString(arr));

    }
}
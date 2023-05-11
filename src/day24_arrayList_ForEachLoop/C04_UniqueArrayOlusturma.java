package day24_arrayList_ForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_UniqueArrayOlusturma {
    public static void main(String[] args) {

        // verilen bir array deki tekrar eden elementleri tek bir defa barindiran
        // yeni bir array olarak donduren bir method olusturun
        int arr[]={2,3,5,6,3,5,4,1,9,6,3,5,5};

        int[]uniqueArray=uniqueArrayOlustur(arr);
        System.out.println(Arrays.toString(uniqueArray));


    }

    public static int[] uniqueArrayOlustur(int[] arr) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        List<Integer> benzersizlist=new ArrayList<>();
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]!=arr[i+1]){
                benzersizlist.add(arr[i]);
            }
        }
        if (!benzersizlist.contains(arr[arr.length-1])){
            benzersizlist.add(arr[arr.length-1]); // son elemani kontor etmek icin yaptık

        }
        int[] tekrarsizArr=new int[benzersizlist.size()];
        for (int i = 0; i < tekrarsizArr.length; i++) {
            tekrarsizArr[i]=benzersizlist.get(i);


        }

        return tekrarsizArr;
    }
}

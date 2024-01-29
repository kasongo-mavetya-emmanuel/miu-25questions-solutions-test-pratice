/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.miu1;
import java.util.Arrays;



/**
 *
 * @author Administrator
 */
public class Miu1 {
    
    //question 1
    static int isCenteredArray(int[]arr) {
        if(arr.length%2==0){
            return 0;
        }
        int middleIdx=arr.length/2;
        for(int i=0;i<arr.length;i++){
            if(i!=middleIdx && arr[i]<=arr[middleIdx]){
                return 0;
        }
        }
            return 1;
    }
    
    //question 2
    
    static int sumOddEven(int[] arr){
        int X=0;
        int Y=0;
        for(int i =0; i<arr.length;i++){
            if(arr[i]%2==0){
                Y+=arr[i];
            }
            else{
                X+=arr[i];
            }
        }
        
        return X-Y;
    }
    //question 3
    static char[] charArr(char[] arr,int start, int len){
        char[] result=new char[len];
        if(start>=arr.length || len>=arr.length|| start<0 || len <0 || start+len>=arr.length){
            return null;
        }
        for(int i=0;i<len;i++){
            result[i]=arr[start+i];  
        }
        
        return result;
    }
    
    //question 4
    static int reverseNumber(int n){
        int reversed=0;
        while(n!=0){
        int digit = n%10;
        reversed= reversed*10+digit;
        n/=10;  
        System.out.println("---------------------");
        System.out.println(n);
    }
        return reversed;
        
    }
    
    //question 5
    static int[] commonElts(int[]arr1,int[]arr2){
        int len=(arr1.length<arr2.length)?arr1.length:arr2.length;

        int[] result= new int[len];
        int k=0;
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    result[k]=arr1[i];
                    k++;
                }
            }
            
        }
        int[] arr=new int[k];
        
        for(int i=0;i<arr.length;i++){
            arr[i]=result[i];
        }
        
        return arr;
        
            
    }
    
    static int findPOE(int[] arr){
        int totalSum=0;
        int n= arr.length;
        int leftSum=0;
        
        if(n<3) return -1;
        
        for(int num : arr){
            totalSum+=num;
        }
        for(int i=0;i<n;i++){
            totalSum-=arr[i];
            
            if(leftSum==totalSum){
                return i;
            }
            
            leftSum+=arr[i];
        }
        return -1;
    }


    public static void main(String[] args) {
//        //question 1
//        int[] arr1 = {1, 2, 3, 4, 5};
//        int[] arr2 = {3, 2, 1, 4, 5};
//        int[] arr3 = {1, 2, 3, 4, 5, 6};
//
//        isCenteredArray(arr1);
//        isCenteredArray(arr2);
//        isCenteredArray(arr3);
//        System.out.println(isCenteredArray(arr1));
//        System.out.println(isCenteredArray(arr2));
//        System.out.println(isCenteredArray(arr3));
//        
//        
//        //question 2
//        System.out.println(sumOddEven(arr1));
//        
//        //question 3
//         char[] inputArray = {'a', 'b', 'c', 'd', 'e', 'f'};
//        int startPosition = 2;
//        int length = 3;
//        
//        System.out.println(charArr(inputArray, startPosition, length));
//        
//        //question 4
//        System.out.println(reverseNumber(134));
        
        //question 5
//         int[]arr1={1, 8, 3, 2,6};
//         int[] arr2={ 2, 6, 1};
//         int[] result= commonElts(arr1,arr2);
//        
//        System.out.println(Arrays.toString(result));
         //question 6
         int[] findPoeArr={1, 8, 3, 7, 10, 2};
         System.out.println(findPOE(findPoeArr));



        


    }
}

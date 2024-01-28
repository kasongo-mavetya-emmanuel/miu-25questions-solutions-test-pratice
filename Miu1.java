/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.miu1;

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

    public static void main(String[] args) {
        //question 1
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 2, 1, 4, 5};
        int[] arr3 = {1, 2, 3, 4, 5, 6};

        isCenteredArray(arr1);
        isCenteredArray(arr2);
        isCenteredArray(arr3);
        System.out.println(isCenteredArray(arr1));
        System.out.println(isCenteredArray(arr2));
        System.out.println(isCenteredArray(arr3));
        
        
        //question 2
        System.out.println(sumOddEven(arr1));
        
        //question 3
         char[] inputArray = {'a', 'b', 'c', 'd', 'e', 'f'};
        int startPosition = 2;
        int length = 3;
        
        System.out.println(charArr(inputArray, startPosition, length));
        
        //question 4
        System.out.println(reverseNumber(134));



        


    }
}

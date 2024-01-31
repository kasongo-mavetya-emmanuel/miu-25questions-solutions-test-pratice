/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.miu1;
import java.util.Arrays;
import java.lang.Math; 




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
    
    //question 6
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
    //question 7
    static int nextSquareElt(int n){
        int root;
        
        if(n<0){
            root=(int) Math.floor(Math.sqrt(-n));
            return -root*root;
            
        }
        else{
            root=(int) Math.ceil(Math.sqrt(n)); 
                  return root*root;  
        }
         
        
      
    }
    //question 8
    static int upCount(int[]a,int n){
        int totalSum=0;
        int upCount=0;
        for(int num:a){
            totalSum+=num;
            if(totalSum>n){
                upCount++;
            }  
        }
        return upCount;
    }
    //question 9
    static int countPrimeNumbers(int start, int end){
        int counterPrime=0;
        while(start<=end){
            int counterFactors=0;
            for(int i=0;i<start;i++){
                
                 if(start%(i+1)==0){
                    counterFactors++;
                }
            }
            if(counterFactors==2){
                counterPrime++;
            }                       

            start++;
        }
        return counterPrime;
    }
    //question 10
    static int isFancy(int n){
        int prev1=1;
        int fancyNum=0;
        int prev2=1;
        while(fancyNum<=n){
            fancyNum= prev1*3+prev2*2;
            prev2=prev1;
            prev1=fancyNum;
            if(fancyNum==n){
                return 1;
            }
        }
        
        return 0;
        
    }
    //question 11
    static int isMeera(int[]a){
        boolean isNine=false;
        boolean isOne=false;
        for(int num: a){
            if(num==9){
               isNine=true; 
            }
            if(num==1){
                isOne=true;
                
            }
        }
        return (isNine&&isOne)?1:0;
    }
    //question 12
    static int isBean(int[] arr){
        for(int num:arr){
            for(int i=0;i<arr.length;i++){
                if(arr[i]==(2*num)||arr[i]==((2*num)+1)||num/2==arr[i]){
                  
                    break;           
                }  
                if(i==arr.length-1)return 0;
            }
        }
        return 1;
    }
    //question 13 
    static int twoSquares(int n){
        int ct=0;
        for(int i=2;(i*i)<n;i++){
            
            int a=n-i*i;    
            
            int j=(int) Math.sqrt(a);
          
           
            if((j*j)==a){   
                System.out.println(i);
                 ct++;
               
               
            }
            
            if(ct>2){
                return 0;
            }
        }
        
        
        return ct==2?1:0;
        
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
//         int[] findPoeArr={1, 8, 3, 7, 10, 2};
//         System.out.println(findPOE(findPoeArr));
         //question 7
//         System.out.println(nextSquareElt(30));
         //question 8
//         int[] upCountArr={2,3,1,-6,8,-3,-1,2};
//         System.out.println(upCount(upCountArr,5));
         //question 9
//         System.out.println(countPrimeNumbers(10,30));
         //question 10
         //System.out.println(isFancy(17));
         //question11
         //int[] arrMeera={7,9,0,10,1};
         //System.out.println(isMeera(arrMeera));
         //question12
         //int[] arrBean={7,7,3,6};
         //System.out.println(isBean(arrBean));
         //question13
         //System.out.println(twoSquares(50));
         

        


    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.miu1;
import java.util.Arrays;
import java.lang.Math; 
import java.util.*;




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
    //question 14
    static int mostOccNumber(int[] arr){
        int currVal=0;
        int currKey=0;
         Map<Integer, Integer> hm 
            = new HashMap<>();
         for(int i=0;i<arr.length;i++){
             if(hm.containsKey(arr[i])){
                 int val=hm.get(arr[i]);
                 hm.put(arr[i],val+1);
             }
             else{
                 hm.put(arr[i], 1);
             }
         }
         
         for(Map.Entry<Integer, Integer> e: hm.entrySet()){
           
             if(e.getValue()>currVal){
                 currVal=e.getValue();
                 currKey=e.getKey();
             }
         }
         
         return currKey;
    }
    //question 15
    static int evenAndSum(int[]arr){
        int leftSum=0;
        int rightSum=0;
        if(arr.length%2!=0){
            return 0;
        }
        for(int i=0;i<arr.length;i++){
            if(i<=((arr.length/2)-1)){
                leftSum+=arr[i];
            }
            else{
                rightSum+=arr[i];
            }
        }
        
        return (leftSum==rightSum)?1:0;
    }
    //question 16
    static int isMadhavArray(int[] arr){
        int n=1;
        int con=0;
       
        
        while(con<arr.length){
            int currentSum=0;
            for(int i=con;i<con+n;i++){
                currentSum+=arr[i];
            }
            
            if(currentSum!=arr[0]){
                return 0;
            }
           
            con+=n;
            n++;
            
        }
        
        return 1;
    }
    //question 17
    static int inertial(int[] arr){
        int hasOddsCount=0;
        int hasEvenCount=0;
        int max=arr[0];
        int minOdd=0;
        int maxEven=0;
        for(int num: arr){
            int val= num<0?-num:num;
             if(val>max){
                max=val;
            }
        }
        for(int i=0;i<arr.length;i++){
            int val=arr[i]<0?-arr[i]:arr[i];
            if(val%2!=0){
                hasOddsCount++;
                if(hasOddsCount==1){
                    minOdd=val;
                }
                if(val<minOdd){
                    minOdd=val;
                }
            }
            if(val%2==0){
                hasEvenCount++;
                if(hasEvenCount==1 && val!= max){
                    maxEven=val;
                }
                
                if(val>maxEven && val!= max){                 
                    maxEven=val;
                }
            }
        }
        System.out.println(hasOddsCount);
         System.out.println(max);
          System.out.println(maxEven);
           System.out.println(minOdd);
        return (hasOddsCount>=1&&(max%2==0)&&maxEven<minOdd)?1:0;
    }
    
    //question 18
    static int countSquarePairs(int[]arr){
        int countPair=0;
        if(arr.length==1){
            return 0;
        }
        for(int val:arr){
            for(int num:arr){
               int pair=val+num;
               int j=(int) Math.sqrt(pair);
               if(j*j==pair){
                   if(val<num && num>0 && val>0){
                       countPair++;
                   }
               }
            }
        }
        return countPair;
    }
    //question 19
    static int findPorcupineNumber(int num){
        int n=num+1;
        int nextPrimeNum=n;
        int currentPrimeNum=n;
        int count=0;
        while(true){
            if(isPrime(n)){
                count++;
                if(count==1){
                    currentPrimeNum=n;
                }
                if(count==2){
                    nextPrimeNum=n;
                     count=0;
                }
                if(nextPrimeNum%10==9 && currentPrimeNum%10==9){
                    System.out.println(nextPrimeNum%10+""+nextPrimeNum+""+currentPrimeNum);
                    return 1;
                }
               
            }
            
          
            
           if(n>=10000){
               break;
           }
            n++;
        }
       return 0; 
        
    }
    
    
    private static boolean isPrime(int n){
        if(n<=1)return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
            
        }
        return true;
    }
    
    //question 20
    static int guthrie(int[] arr){
        int curr=0;
        for(int i=0; i<arr.length;i++){
            if(arr[i]%2==0){
                curr=arr[i]/2;
               if(i+1<arr.length){
                   
                    if(curr!=arr[i+1]){
                    return 0;
                }
               
               }
              
                if(i+1==arr.length-1 && curr!=1){
                    
                    return 0;
                }
               
                
            }else{
                curr=(arr[i]*3)+1;
                if(i+1<arr.length){
                   
                    if(curr!=arr[i+1]){
                    return 0;
                }
                 
                }
                if(i+1==arr.length-1 && curr!=1){
                    

                    return 0;
                }
            }
        }
        return 1;
    }
    
    //question 21
    static int stanlon(int[] arr){
        int count=0;
        int n=0;
        for(int val:arr){
            if(val==1){
                count++;
            }
        }
        for(int num:arr){
            if(num==count){
                n++;
            }
        }
        
        return n;
        
    }
    //question 22
    static int sumFactor(int[] arr){
        int count=0;
        int sum=0;
        for(int val:arr){
           sum+=val;
        }
        for(int num:arr){
            if(num==sum){
                count++;
            }
        }
        
        return count;
        
    }
    //question 23
    static int evenSpaced(int[] arr){
        int max=arr[0];
        int min=arr[0];
        for(int num: arr){
            if(num>max){
              max=num;  
            }else{
               min=num; 
            }
        }
        int total=max-min;
        System.out.println(total);
        return (total%2==0)?1:0;
        
    }
    //question 24
    static int subArray(int[] arr){
        
        int totalSum=0;
        
        
        for(int i=0;i<arr.length;i++){
            totalSum=0;
             for(int j=i+1; j<arr.length;j++){
                 totalSum+=arr[j];
             }
             
            if(arr[i]<=totalSum){
                return 0;
            }   
            
        }
      
        return 1;
    }
    
    //question 25
    static int isSym(int[] arr){
        String[] resultArr=new String[arr.length];
        for(int i=0;i<arr.length;i++){
           if(arr[i]%2==0){
              resultArr[i]="even";  
           }else{
                resultArr[i]="odd";                  
            }
        }
        for(int j=arr.length-1,i=0; j>=0;j--){
           
             
            if(arr[j]%2!=0 && !resultArr[i].equals("odd")){
                
                return 0;
            }
            if(arr[j]%2==0 && !resultArr[i].equals("even")){
                return 0;
            }
            i++;
        }
        return 1;
    }
    
    //Other Questions
    //collection questions Nepal test
    //question 1
    static int isEvenNumber(int n){
        while(n!=0){
            int lastDigit= n%10;
            if(lastDigit%2!=0)return 0;
            n=n/10;
        }
            
     return 1;
    }
    
    static int isMagicalArray(int[] arr){
        int primeSum=0;
        for(int i=1; i<arr.length;i++){
            if(isPrime(arr[i])){
                primeSum+=arr[i];
            }
         
        }
        System.out.println(primeSum);
        return (primeSum==arr[0])?1:0;
    }
    //question 3
    static int isCompleteArray(int[] arr){
        int min=arr[0];
        int max=arr[0];
        int countFirstEven=0;
        for(int i=0;i<arr.length;i++){
           if(arr[i]%2==0){
               countFirstEven++;
               if(countFirstEven==1){
                   min=arr[i];
                   max=arr[i];
               }
                if(arr[i]>max){
                max=arr[i];
            }
                
            if(arr[i]<min){
                min=arr[i];
            }
           }
        }
         System.out.println(min+" "+max+" ");
        
        if(min==max|| min%2!=0 || max%2!=0)return 0;
        int count=0;
        for(int i=min+1;i<max;i++){
            for(int val:arr){
                if(val==i){
                    count++;
                }
            }
        }
         System.out.println(min+" "+max+" "+count+" "+(max-min));
       
        if(count!=(max-min-1))return 0;
        
        return 1;
        
        
    
    }
    
    //test
    //q1
    public static int hasNValues(int[] a, int n) {
      
        HashSet<Integer> uniqueValues = new HashSet<>();

        for (int num : a) {
            uniqueValues.add(num);

           
            if (uniqueValues.size() > n) {
                return 0;
            }
        }

       
        return 1;
    }
    
    //q2
    public static int is121Array(int[] a) {
        int len = a.length;

        // Check if the array is empty
        if (len == 0) {
            return 0;
        }

        // Check if the first element is 1
        if (a[0] != 1 || a[len-1]!=1) {
            return 0;
        }

        // Check if the array contains only 1s and 2s
        for (int num : a) {
            if (num != 1 && num != 2) {
                return 0;
            }
        }

        // Check if the array is a 121 array
        

        int i = 0;
        while (i < len && a[i] == 1) {
            i++;
        }

        //System.out.println(i);
        if (i >= len || a[i] != 2) {
            return 0;
        }

        // Check if the array ends with the same number of 1s as it begins with
        int j = len - 1;
        while (j >= 0 && a[j] == 1) {
            
            j--;
        }
        
        //System.out.println(i+" "+j+" "+(len-1-j)+" "+len);
        if(i!=len-1-j){
           return 0; 
        }
        
       while(i<j){
           if(a[i]!=2){
              return 0;
           }
           
           i++;
       }

        return 1;

        // Check if the number of 1s at the end equals the number of 1s at the beginning
       // return onesCount == twosCount ? 1 : 0;
    }
    
     public static int isMercurial(int[] a) {
        int len = a.length;

        if (len == 0) {
            return 1; 
        }
        if(len==1 && a[0]==1){
            return 1;
        }
        HashSet<Integer> threesIdx = new HashSet<>();
        
        int onesLeftCount=0;
        int onesRightCount=0;
        
        // Check if the array contains only 1s, 2s, and 3s
        for (int i=0; i<len;i++) {
            int num=a[i];
            if(num==3){
                threesIdx.add(i);
            }     
        }
        if(threesIdx.isEmpty()){
            return 0;
        }
        for(int idx: threesIdx){
             onesLeftCount=0;
             onesRightCount=0;
            for (int i=0; i<idx;i++) {
            if(a[i]==1){
                onesLeftCount++;
                break;
            }           
        }
         for (int i=idx+1; i<len;i++) {
            if(a[i]==1){
                onesRightCount++;
                break;
            }
            
        }
         
         if(onesLeftCount>0 && onesRightCount>0){
             return 0;
         }
         
        }
         
         
        return 1; // It's a Mercurial array
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
         //question 14
         //int[] mostOccNumArr={7,7,3,3,6};
         //System.out.println(mostOccNumber(mostOccNumArr));
         //question 15
         //int[] evenAndSumArr= {5,4,3,2,3,4,6,1};
         //System.out.println(evenAndSum(evenAndSumArr));
         //question 16
         //int[] madhavArr= {0,0,0,0,0,0,0,0,0,0,1,1,1,-2,-1};
         //System.out.println(isMadhavArray(madhavArr));
         //question 17            
         //int[] inertialArr= {2,12,4,6,8,11};
         //System.out.println(inertial(inertialArr));
         //question 18
         //int[] countSquarePairsArr={9,0,2,-5,7};
         //System.out.println(countSquarePairs(countSquarePairsArr));
         //question 19
         //System.out.println(findPorcupineNumber(0));
         //question 20
         //int[] guthrieArr={8,4,2,1};
         //System.out.println(guthrie(guthrieArr));
         //question 21
         //int[] stanlonArr={1,3,1,1,3,3,2,3,3,3,4};
         //System.out.println(stanlon(stanlonArr));
         //question 22
         //int[] sumFactorArr={3,0,2,-5,0};
         //System.out.println(sumFactor(sumFactorArr));
         //question 23
         //int[] evenSpacedArr={100,19,-131,-140};
         //System.out.println(evenSpaced(evenSpacedArr));
         //question 24
         //int[] subArrayArr={13,6,3,2};
         //System.out.println(subArray(subArrayArr));
         //question 25
         //int[] isSymArr={9,8,7,13,14,17};
         //System.out.println(isSym(isSymArr));
         
         //other qestions collection nepal
         //question 1
         //System.out.println(isEvenNumber(846));
         //question 2
         //int[] magicalArr={10, 5, 5};
         //System.out.println(isMagicalArray(magicalArr));
         //question 3
         //int[] completeArr={5, 7, 9, 13} ;
         //System.out.println(isCompleteArray(completeArr));
         //int[] array2 = {1, 2, 3, 4, 5};

        //System.out.println(hasNValues(array2, 5));
//        int[] array1 = {1, 2, 1}; // 121 array
//        int[] array2 = {1, 1, 2, 2, 2, 1, 1}; // 121 array
//        int[] array3 = {1, 1, 2, 2, 2, 1, 1, 1}; // Not a 121 array
//        int[] array4 = {1, 1, 2, 1, 2, 1, 1}; // Not a 121 array
//        int[] array5 = {1, 1, 1, 2, 2, 2, 1, 1, 1, 3}; // Not a 121 array
//        int[] array6 = {1, 1, 1, 1, 1, 1}; // Not a 121 array
//        int[] array7 = {2, 2, 2, 1, 1, 1, 2, 2, 2, 1, 1}; // Not a 121 array
//        int[] array8 = {1, 1, 1, 2, 2, 2, 1, 1, 2, 2}; // Not a 121 array
//        int[] array9 = {2, 2, 2}; // Not a 121 array
//
//        System.out.println(is121Array(array1)); // Output: 1
//        System.out.println(is121Array(array2)); // Output: 1
//        System.out.println(is121Array(array3)); // Output: 0
//        System.out.println(is121Array(array4)); // Output: 0
//        System.out.println(is121Array(array5)); // Output: 0
//        System.out.println(is121Array(array6)); // Output: 0
//        System.out.println(is121Array(array7)); // Output: 0
//        System.out.println(is121Array(array8)); // Output: 0
//        System.out.println(is121Array(array9)); // Output: 0
           // Example usage:
        int[] array1 = {1, 2, 10, 3, 15, 1, 2, 2}; // Not a Mercurial array
        int[] array2 = {5, 2, 10, 3, 15, 1, 2, 2}; // Mercurial array
        int[] array3 = {1, 2, 10, 3, 15, 16, 2, 2}; // Mercurial array
        int[] array4 = {3, 2, 18, 1, 0, 3, -11, 1, 3}; // Not a Mercurial array
        int[] array5 = {2, 3, 1, 1, 18}; // Mercurial array
        int[] array6 = {8, 2, 1, 1, 18, 3, 5}; // Mercurial array
        int[] array7 = {3, 3, 3, 3, 3, 3}; // Mercurial array
        int[] array8 = {1}; // Mercurial array
        int[] array9 = {}; // Mercurial array

        System.out.println(isMercurial(array1)); // Output: 0
        System.out.println(isMercurial(array2)); // Output: 1
        System.out.println(isMercurial(array3)); // Output: 1
        System.out.println(isMercurial(array4)); // Output: 0
        System.out.println(isMercurial(array5)); // Output: 1
        System.out.println(isMercurial(array6)); // Output: 1
        System.out.println(isMercurial(array7)); // Output: 1
        System.out.println(isMercurial(array8)); // Output: 1
        System.out.println(isMercurial(array9)); // Output: 1
         
        
         
         
     

        


    }
}

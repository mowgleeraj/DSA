package org.example;

public class missinginarray {
    int missingNumber(int n, int arr[]) {
    int sum1 = 0;
    for(int i=0;i<n-1;i++){
        sum1 += arr[i]; 
    }
    int var1= n*(n+1)/2;
    int diff =var1 -sum1;
    return diff;
}   
    
}

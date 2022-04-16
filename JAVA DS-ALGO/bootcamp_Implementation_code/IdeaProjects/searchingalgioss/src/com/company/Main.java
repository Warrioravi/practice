package com.company;

public class Main {

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        System.out.println(binarysearch(arr,8));


        }
    public static int binarysearch(int[] arr,int target)
    {
        int left=0;
        int right=arr.length-1;

        while (left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(target<arr[mid]){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return -1;
    }


        // write your code here
    }


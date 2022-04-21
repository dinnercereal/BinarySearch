package org.vashonsd;

public class Main {

    public static void main(String[] args) {
        int[] nums = new int[] {0,1,3,5,13,16,45,66,99,1003};
        System.out.println(binarySearch(nums,0,nums.length-1,0));
        System.out.println(binarySearch(nums,0,nums.length-1,1));
        System.out.println(binarySearch(nums,0,nums.length-1,45));
        System.out.println(binarySearch(nums,0,nums.length-1,27));
    }
    public static int binarySearch(int[] nums, int min, int max, int x){
        if(max>=min){
            int mid = min + (max-min) / 2;
            if(nums[mid]==x){
                return mid;
            }
            if(nums[mid]>x){
                return binarySearch(nums,min,mid-1,x);
            }
            return binarySearch(nums,mid+1,max,x);
        }
        return -1;
    }
}

package org.vashonsd;

public class Main {

    public static void main(String[] args) {
        int[] nums = new int[] {0,1,3,5,13,16,45,66,99,1003};
        System.out.println(binarySearch(nums,0,nums.length-1,0));
        System.out.println(binarySearch(nums,0,nums.length-1,1));
        System.out.println(binarySearch(nums,0,nums.length-1,45));
        System.out.println(binarySearch(nums,0,nums.length-1,27));
    }
    public static int binarySearch(int[] nums, int l, int r, int x){
        if(r>=l){
            int mid = l + (r-l) / 2;
            if(nums[mid]==x){
                return mid;
            }
            if(nums[mid]>x){
                return binarySearch(nums,l,mid-1,x);
            }
            return binarySearch(nums,mid+1,r,x);
        }
        return -1;
    }
}

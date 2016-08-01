// Merges two subarrays of arr[].  First subarray is arr[l..m]
// Second subarray is arr[m+1..r]
class GfG
{
   // l is for left index and r is right index of the
    //sub-array of arr to be sorted 
    void mergeSort(int arr[], int l, int r)
    {
        if (l < r)
        {
            int m = (l+r)/2;
            mergeSort(arr, l, m);
            mergeSort(arr , m+1, r);
            merge(arr, l, m, r);
        }
    }
    void merge(int arr[], int l, int m, int r)
    {
         // Your code here
         int[] mergedArr = new int[arr.length];
         int counter = 0;
         
         int leftArrFirstNum = arr[l];
         int rightArrFirstNum = arr[m+1];
         
         if (leftArrFirstNum < rightArrFirstNum) {
             mergedArr[counter] = leftArrFirstNum;
         }
    }
}

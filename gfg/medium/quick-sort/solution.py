class Solution:
    def quickSort(self, arr, low, high):
        # code here
        
        if(low < high):
            
            pivot = self.partition(arr,low,high)
            
            self.quickSort(arr,low,pivot-1)
            self.quickSort(arr,pivot+1,high)

    def partition(self, arr, low, high):
        # code here
        pivot = arr[high]
        
        i = low-1
        
        for j in range(low,high):
            
            if(arr[j] < pivot):
                i += 1
                temp = arr[i]
                arr[i] = arr[j]
                arr[j] = temp
                
        temp = arr[i+1]
        arr[i+1] = arr[high]
        arr[high] = temp
        
        return i+1
        
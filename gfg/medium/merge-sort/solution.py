class Solution:
    
    def mergeArr(self,arr, l, mid, r): 
        n = r-l+1
        temp = [0]*n
        i = l
        j = mid+1
        k = 0
        
        while(i<=mid and j<=r):
            
            if(arr[i] < arr[j]):
                temp[k] = arr[i]
                i+=1
            else:
                temp[k] = arr[j]
                j+=1
            k+=1
            
        while(i<=mid):
            temp[k] = arr[i]
            i+=1
            k+=1
            
        while(j<=r):
            temp[k] = arr[j]
            j+=1
            k+=1
            
        for x in range(n):
            arr[x+l] = temp[x]
        
            
    def mergeSort(self, arr, l, r):
        # code here
        
        if(l>=r): 
            return
        
        mid = l + (r-l)//2
        
        self.mergeSort(arr, l, mid)
        self.mergeSort(arr, mid+1, r)
        
        self.mergeArr(arr,l,mid,r)
        
        
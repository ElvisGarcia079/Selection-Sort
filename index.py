def selectionSort(arr): 
    for i in range(len(arr)):
        min = i
        for j in range(i + 1, len(arr)):
            if(arr[i] > arr[j]):
                min = j
        if(min != i):
            arr[i], arr[min] = arr[min], arr[i]
        
    return arr

nums = [1, 4, 6, 3, 7, 2, 86, 234, 7654]
selectionSort(nums)
print(nums)
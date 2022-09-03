function selectionSort(arr){
    // First Loop to Iterate through the Array
    for(let i = 0; i < arr.length; i++){
        // Setting minimum value to current index
        let min = i;
        // Include the Inner Loop
        for(let j = i + 1; j < arr.length; j++){
            // Check if any value is less than the value at i
            if(arr[i] > arr[j]){
                // Set min to j
                min = j;
            }
        }

        // Check if the minimum value has changed
        if(min != i){
            // Swap the values if the minimum value has changed
            let temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
}

let list = [3, 2, 1, 5, 45, 32, 654, 234, 6543, 24];
console.log(selectionSort(list));
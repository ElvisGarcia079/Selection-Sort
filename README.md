# Selection Sort
Selection Sort is a type of sorting alrithm that has: 
* A Quadratic Runtime or O(n^2)
* Generally not preferred for Sorting but gets the job done. 

---
---
## Pre-Requisite
It's helpful to have an understanding of the following concepts:
* For Loops
* Conditional Statements
* Functions
* Parameters/Arguments
* Arrays/Lists
* Swap Operation
---

## Process
1. Create **function signature** which will take an **array** as input. Then, create an initial or first **for loop** in order to iterate through the entire unsorted array
           
            function selectionSort(arr){
                for(let i = 0; i < arr.length; i++){

                }
            }
2. Initialize the current index in the first **for loop** as the current minimum value. 
            
            let min = i;
3. Create a second **for loop** in order to traverse
the rest of the items in the array. (Start at 1 more than index of the first loop)

        for(let j = i + 1; j < arr.length; j++){

        }
4. Create a **conditional statement** that checks if the value targeted in the first loop is less than any of the rest of the values targeted values, 
        
        if(arr[j] < arr[i]){

        }
5. If there is a value that is less than the targeted value, then we will reassign the minimum index to be **j** or the current index of the second **for loop**

        min = j;
6. Within the first loop after iterating the rest of the array with the second for loop, create another **conditional statement** that checks if the minimum has remained the current index of the outer loop **i** or has changed to **j** from the inner loop. 

        if(min != i) {

        }
7. If the minumum value has changed, that means that there is a smaller value somewhere ahead in the list, so we will perform a **swap operation**.

        let temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
8. Finally, you can now exit your **for loops**, at this point, your list/array is sorted. You can return the same list you were originally given and it'll be sorted. 

        return arr;



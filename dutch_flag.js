let arr = [2,0,1,0,0,1,0,2]
let pivotIdx = 1

// solution 1: O(n) space, O(n) time
// create 3 lists, and then merge these lists

// solution 2: O(1) space, 
function dutchFlagPartition2(pivotIdx, arr){

    let pivot = arr[pivotIdx];

    for (let i=0; i<arr.length; i++){
        for (let j=i+1; j<arr.length; j++){
            if(arr[j]<pivot) {
                // swap them
                [arr[i], arr[j]] = [arr[j], arr[i]];
            }
        }
    }

    console.log(arr);

    for (let i=arr.length-1; i>=0; i--){
        for (let j=i-1; j>=0; j--){
            if(arr[j]>pivot) {
                // swap them
                [arr[i], arr[j]] = [arr[j], arr[i]];
            }
        }
    }
    console.log(arr);

}


// dutchFlagPartition2(pivotIdx, arr);
function dutchFlagPartition3(arr){
    let mid = 0;
    let low = 0;
    let high = arr.length-1;
    while(mid<high){
        if(arr[mid]===0) {
            [arr[mid], arr[low]] = [arr[low], arr[mid]]
            mid+=1;
            low+=1;
        } else if (arr[mid]==1) {
            mid+=1;
        } else if (arr[mid]==2){
            [arr[mid], arr[high]] = [arr[high], arr[mid]]
            high-=1;
        }
    }
    return arr;
}

console.log(dutchFlagPartition3(arr));

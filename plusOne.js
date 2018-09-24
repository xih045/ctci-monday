function plusOne(input){
    let end = input.length-1;
    let i = end;
    input[i]+=1;

    while(i>0 && input[i]===10) {
        input[i]=0;
        i-=1;
        input[i]+=1;
    }

    if(input[0]===10) {
        input[0]=0;
        input.unshift(1);
    }

    return input;
}

console.log(plusOne([1,2,9])) // 1,3,0
console.log(plusOne([1,9,9])) // 2,0,0
console.log(plusOne([9,9,9])) // 1,0,0,0
console.log(plusOne([9])) // 1,0
console.log(plusOne([1,1,1,9])) // 1,1,2,0

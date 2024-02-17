function isPalindrome(x: number): boolean {
    if(x < 0){
        return false;
    }
    let reversedNumber: number = 0;
    let originalX: number = x;
    while(x > 0){
        reversedNumber = reversedNumber*10 + x%10;
        x = Math.floor(x/10); 
    }
    return originalX === reversedNumber;
};

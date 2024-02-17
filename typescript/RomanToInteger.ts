function romanToInt(s: string): number {
    const symbolValues: Map<string, number> = new Map();
    symbolValues.set('I', 1);
    symbolValues.set('V', 5);
    symbolValues.set('X', 10);
    symbolValues.set('L', 50);
    symbolValues.set('C', 100); 
    symbolValues.set('D', 500);
    symbolValues.set('M', 1000);
    let intNum: number = 0;
    for(let i=0; i < s.length; ++i){
        const firstChar: number | undefined = symbolValues.get(s.charAt(i));
        const secondChar: number | undefined = symbolValues.get(s.charAt(i + 1));
        if(firstChar && secondChar){
            if(firstChar < secondChar){
               intNum += secondChar-firstChar; 
               ++i;
            }else {
                intNum += firstChar;
            }
        }else if(firstChar){
                intNum += firstChar;
        }
    }
    return intNum;
};

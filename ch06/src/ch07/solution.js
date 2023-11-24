/**
 * 
 */

 function solution(numbers) {
    var answer = [];
    
     for (let i = 0; i < numbers.length; i++) {
            for (let j = i+1; j <= numbers.length; j++) {
                if (numbers[i] < numbers[j]) {
                    answer.push(numbers[j]);
                    break;
                } else if (!numbers[j]) {
                    answer.push(-1);
                }
            }
        }
        
     // gpt의 제안(그러나 정답은 아닌)
     for (let i = 0; i < numbers.length; i++) {
           let found = false;
            for (let j = i+1; j < numbers.length; j++) {
                if (numbers[i] < numbers[j]) {
                    answer.push(numbers[j]);
                    found = true;
                    break;
                } 
            }
           if (!found) {
               answer.push(-1);
           }
        }
        
  
  	// still ing..
  	let temp = 0;
    let copiedArr = [...numbers];
    
       for (let i = numbers.length - 1; i >= 0; i--) {
           let found = false;
           
           if (i == numbers.length - 1) {
               temp = copiedArr.pop();
               answer.push(-1);
               found = true;
               continue;
           }
           
           if (temp < copiedArr[i]) {
               temp = copiedArr.pop();

           } else if (copiedArr[i] < temp) {
               if(copiedArr[copiedArr.length-1] < numbers[copiedArr.length]) {
                    temp = numbers[copiedArr.length];
                }
               // console.log("copiedArr[copiedArr.length-1] :: ", copiedArr[copiedArr.length -1], " numbers[copiedArr.length] :: ", numbers[copiedArr.length] );
               answer.push(temp); 
               copiedArr.pop();
               found = true;
           } 

           console.log(/*"numbers : ", numbers , */" copiedArr : ", copiedArr, " temp : ", temp, " answer : ", answer)
           if (!found) {
               answer.push(-1);
           }
          
        }
    answer.reverse();
    
    // 너무 길어서인지 런타임에러남 아
    let temp = 0;
    let tempLarge = 0;
    let copiedArr = [...numbers];
    let i = numbers.length - 1;
    
       while (i >= 0) {
           let found = false;
 
           if (i == numbers.length - 1) {
               temp = copiedArr.pop();
               answer.push(-1);
               found = true;
               i--;
               continue;
           } else if (temp < copiedArr[i]) {
               if (temp < tempLarge) {
                   answer.push(tempLarge);
                   continue;
               }
               temp = copiedArr.pop();
           } else if (temp > copiedArr[i]) {
               if (temp > copiedArr[0]) {
                   tempLarge = temp;
               }
               if(copiedArr[i] < numbers[copiedArr.length]) {
                    temp = numbers[copiedArr.length];
                }
               answer.push(temp); 
               copiedArr.pop();
               found = true;
           }

           if (!found) {
               answer.push(-1);
           }
           i--;
        }
    answer.reverse();
    
    // gpt가 알려준 방법 + for문을 while로 (그러나 시간초과로 통과 못함)
     let tmp = [];
    let i = numbers.length - 1;
    
    while (i >= 0) {
        
        while (tmp.length > 0 && numbers[i] >= tmp[tmp.length - 1]) {
            tmp.pop();
        }
        
        if (tmp.length == 0) {
            answer.unshift(-1);
        } else {
            answer.unshift(tmp[tmp.length - 1]);
        }

        tmp.push(numbers[i]);
        
        i--;
    }
  	
    
    return answer;
}
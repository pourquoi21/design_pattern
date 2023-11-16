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
    
    return answer;
}
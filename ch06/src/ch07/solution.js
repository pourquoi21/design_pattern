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
    
    
    // 풀고나니 레벨0문제였어서 너무 화가났던것들
    class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // 주어진 수보다 작은 수들을 차례로 구함
        for (int i = 1; i <= n; i++) {
            
            // 약수의 개수를 담을 변수 선언
            int divisor = 0;
            
            // 숫자 i의 약수를 찾기 위해 순회
            for (int j = 1; j <= i; j++) {
                // i의 약수일 경우 변수에 담고
                if (i % j == 0) {
                    divisor += 1;
                }
                
                // 약수가 3개가 되면 answer을 증가시키고, 해당 수에 대한 순회를 멈춘다
                if (divisor == 3) {
                    answer += 1;
                    break;
                }
            }
        }
        
        return answer;
    }
}

class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 0;
        
        // 단어가 spell에 있는 것으로만 이루어졌는지 확인할 boolean 변수 선언
        boolean check = false;
        
        // dic의 단어 수만큼 순회하여 각 단어 추출
        for (int i = 0; i < dic.length; i++) {
            
            // spell 요소 수만큼 순회
            for (int j = 0; j < spell.length; j++) {
                // dic의 i번째 단어를 검사해서 spell의 요소를 가지고 있는지 검사
                if (!dic[i].contains(spell[j])) {
                    // i번째 단어에 spell의 요소가 아닌 알파벳이 있으면
                    // 일단 check는 false처리하고 해당 단어 검사는 끝냄
                    check = false;
                    break;
                } else {
                    // spell요소이면 true처리, 다음 알파벳 검사
                    check = true;
                }
            }
            // 해당 회차 단어가 spell의 요소로만 이루어졌다면 1, 아니라면 2 반환
            if (check) {
                answer = 1;
                break;
            } else {
                answer = 2;
            }
        }
        
        return answer;
    }
   
}


// 모두를(나 포함..) 고민에 빠뜨린 코드

function solution(number) {
    var answer = 0;
    
    // arr는 수를 뽑고자 하는 원 배열, pick은 뽑고자 하는 개수
    const getCombi = (arr, pick) => {
        
        const result = [];
        
        if (pick == 1) return arr.map(n => [n]);
    
        // forEach를 통해 배열을 순회한다
        // 각 순회마다 선택된 수는 fixed, index는 그 수의 인덱스,
        // origin은 순회하는 원래 배열
        arr.forEach((fixed, index, origin) => {
            
            // 순회할 때마다 그 회차에 선택된 수는 제외하고
            const rest = origin.slice(index + 1);
            
            // 제외된 배열에서 원래 뽑고자 하는 pick - 1만큼의 수를 고른다
            const combi = getCombi(rest, pick - 1);
            
            // 선택된 수 + 새로 뽑은 (pick - 1)개의 수를 더해서 배열 만듦
            const attached = combi.map(c => [fixed, ...c]);
                        
            result.push(...attached);
        })
        
        
       
        // result배열을 리턴함으로써 combi에는 pick - 1, pick - 2...개의 수가 선택되어 들어감
        return result;
        
    }
    
    
    
    const arr = getCombi(number, 3);
    
    console.log("arr :: " + "[" + arr + "]");
    
    // arr배열의 각 요소들은 length 3의 배열들일 것임.
    for (let i = 0; i < arr.length; i++) {
        if (arr[i][0] + arr[i][1] + arr[i][2] == 0) {
            answer += 1;
        }
    }
    
    return answer;
    
   // 이건 뭐지 싶은 쉬운문제.. 
    function solution(seoul) {
    var answer = '';
    
    let idx = seoul.indexOf("Kim");
        
    answer = "김서방은 " + idx + "에 있다"
    
    return answer;
}
}
// 효율이 좋지않은 답..
//    while (callings.length > 0) {
//         let win = callings.shift();
//         let idx = players.findIndex(p => p == win);
//         let overtook = players[idx - 1];
//         players[idx - 1] = win;
//         players[idx] = overtook;
        
//         answer = players;
//     }

// 푸는중.. 쉬운줄 알았는데...
function solution(id_list, report, k) {
    let answer = [];
    let reportNo = new Array(id_list.length).fill(0);
    
    // 중복된 값을 버리기 위해 set을 쓰고 싶었지만 set은 배열을 char로 나눠버림
    // let reportSet = new Set(...report);

    let reporter;
    let warrior;
    
    let uniqRpt = report.filter((r, index) => {
        return report.indexOf(r) == index;
    })
    
    for (let i = 0; i < uniqRpt.length; i++) {
        
        reporter = uniqRpt[i].split(" ")[0];
        warrior  = uniqRpt[i].split(" ")[1];
        
        let rptIdx = id_list.findIndex(i => i == reporter);
        let warIdx = id_list.findIndex(i => i == warrior);
        
        // reporterIdx = id_list.findIndex(uniqRpt[i].split(" ")[0]);
        // warriorIdx = id_list.findIndex(uniqRpt[i].split(" ")[1]);
        console.log(rptIdx, warIdx);
        reportNo[rptIdx] += 1;
        
    }
    
    console.log(reportNo);
    
    return answer;
}

}
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


// 해시맵?
public class Main {
    public static void main(String[] args) {
        // Map.of()를 사용하여 key-value 쌍 추가
        Map<String, Integer> myMap = Map.of(
            "apple", 5,
            "banana", 10,
            "orange", 7
        );

        // key로 value 얻기
        int value = myMap.get("apple");
        System.out.println("Value of 'apple': " + value);

        // 모든 key-value 쌍 출력
        for (Map.Entry<String, Integer> entry : myMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}

// 순열
 const getPermutations = function (arr, selectNumber) {
    const results = [];
    if (selectNumber === 1) return arr.map((el) => [el]); 
    // n개중에서 1개 선택할 때(nP1), 바로 모든 배열의 원소 return. 1개선택이므로 순서가 의미없음.

    arr.forEach((fixed, index, origin) => {
      const rest = [...origin.slice(0, index), ...origin.slice(index+1)] 
      // 해당하는 fixed를 제외한 나머지 배열 
      const permutations = getPermutations(rest, selectNumber - 1); 
      // 나머지에 대해서 순열을 구한다.
      const attached = permutations.map((el) => [fixed, ...el]); 
      //  돌아온 순열에 떼 놓은(fixed) 값 붙이기
      results.push(...attached); 
      // 배열 spread syntax 로 모두다 push
    });

    return results; // 결과 담긴 results return
}

class Solution {
    public int solution(long num) {
        int answer = 0;
        
        while (num != 1) {               
            if (num % 2 == 0) {
                num /= 2;            
                System.out.println(answer + " " + num);
            } else {
                num = num * 3 + 1;            
                System.out.println(answer + " " + num);
            }
            
            answer++;
            
            if (answer == 500) {
                answer = -1;
                return answer;
            }
        }
        

        
        return answer;
    }
}
//중복제거 배열 만들기
    let uniqRpt = report.filter((r, index) => {
        return report.indexOf(r) == index;
    })
    
    // 나름대로 열심히!
    function solution(bandage, health, attacks) {
    var answer = 0;
    
    // 연속회복에 필요한 시간, 회복량, 추가회복량
    let [healTime, heal, addedHeal] = bandage;
    
    // 공격받는 시간
    let attackTime = attacks.map(([attackTime, damage]) => attackTime);
    
    // 데미지
    let damage = attacks.map(([attackTime, damage]) => damage);
    
    // 체력과 현재hp 구분하기 위해 현재hp 의미하는 변수 만듦
    let currentHp = health;
    
    let sec = 0; // 경과시간
    let successive = 0; // 연속성공 체크용
    
    // 몬스터의 최종 공격시간까지는 루프를 계속 돌도록 함
    while (sec < attacks[attacks.length - 1][0]) {
        sec++;
        successive++;
        
        // 현재 초가 공격받을 시간이라면
        if (attackTime.indexOf(sec) != -1) {
            // console.log("it hurts!");
            // console.log(attackTime.indexOf(sec));
            
            // 인덱스를 구해서 데미지값도 구하여 hp에서 뺌
            let idx = attackTime.indexOf(sec);
            currentHp -= damage[idx];
            
            // 공격으로 인해 연속회복 실패 -> 초기화
            successive = 0;
            
            // hp가 0이하가 되면 사망처리
            if (currentHp <= 0) {
                currentHp = -1;
                break;
                // console.log("you died : " + currentHp);
            }
        // 현재 시간에 공격을 받지 않는다면
        } else {
            // 현재 hp가 체력보다 적으면 회복
            if (currentHp < health) {
                currentHp += heal;
                // 연속회복에 성공했다면 연속회복 초기화, 추가회복
                if (successive == healTime) {
                    successive = 0;
                    currentHp += addedHeal;
                }
                
                // hp가 체력을 넘어서면 그냥 체력값으로 세팅
                if (currentHp > health) {
                    successive = 0;
                    currentHp = health;
                }           
            }
        }
        // console.log("sec :: " + sec);
        // console.log("successive :: " + successive);
        // console.log("currentHp :: " + currentHp);
    }
    answer = currentHp;
    
    return answer;
}


function solution(park, routes) {
    var answer = [];
    let start = findStart(park);
    let currentLoc = start;
    answer = start;
    
    for (let i = 0; i < routes.length; i++) {
        
        let [direction, distance] = routes[i].split(" ");
        
        
        // result[0]이 N/S, result[1]이 E/W
        // 한 칸 움직일 때마다 검사해야함
        
        if (direction == 'N') {
            
            let valid = true;
            let currentLocH = answer[1];
            let locV;
            for(let i = 0; i < +distance; i++) {
                
                if (currentLoc[0] == 0) {
                    valid = false;
                    break;
                }
                
                locV = currentLoc[0] - 1;
                
                if (park[locV][currentLocH] == 'X' || !park[locV][currentLocH]) {
                    valid = false;
                    break;
                } else {
                    currentLoc = [locV, currentLocH];
                }
           
                
             }
            
            if (valid) {
                answer = currentLoc;
            } else {
                currentLoc = answer;
            }
            
        } else if (direction == 'S') {
            let valid = true;
            let currentLocH = answer[1];
            let locV;
            for(let i = 0; i < +distance; i++) {
                if (currentLoc[0] == park.length-1) {
                    valid = false;
                    break;
                }
                
                locV = currentLoc[0] + 1;
                
                if (park[locV][currentLocH] == 'X' || !park[locV][currentLocH]) {
                    valid = false;
                    break;
                } else {
                    currentLoc = [locV, currentLocH];
                }
                           
            }
            
            if (valid) {
                answer = currentLoc;
            } else {
                currentLoc = answer;
            }
            
        } else if (direction == 'W') {
            let valid = true;
            let currentLocV = answer[0];
            let locH;
            for(let i = 0; i < +distance; i++) {
                if (currentLoc[1] == 0) {
                    valid = false;
                    break;
                }
                
                locH = currentLoc[1] - 1;
                
                if (locH < 0) {
                    valid = false;
                    break;
                }

                if (park[currentLocV][locH] == 'X' || !park[currentLocV][locH]) {
                    valid = false;
                    break;
                } else {
                    currentLoc = [currentLocV, locH];
                }
           
                
            }
            
            if (valid) {
                answer = currentLoc;
            } else {
                currentLoc = answer;
            }
            
        } else if (direction == 'E') {
            let valid = true;
            let currentLocV = answer[0];
            let locH;
            for(let i = 0; i < +distance; i++) {
                if (currentLoc[0] == park[0].length-1) {
                    valid = false;
                    break;
                }
                locH = currentLoc[1] + 1;

                if (park[currentLocV][locH] == 'X' || !park[currentLocV][locH]) {
                    valid = false;
                    break;
                } else {
                    currentLoc = [currentLocV, locH];
                }
                
            }
            
            if (valid) {
                answer = currentLoc;
            } else {
                currentLoc = answer;
            }

        }
    }
    
    return answer;
}
    
function findStart(park) {
        // park의 행을 순회
    for (let i = 0; i < park.length; i++) {
        // park의 열을 순회
        for (let j = 0; j < park[i].length; j++) {
            // 해당 행*열에 S가 있으면
            if (park[i][j] == 'S') {
                return [i, j]
            }
        }
    }
}


function solution(a, b) {
    var answer = '';
    let day = 0;
    
    let weekDays = {
        0 : "SUN",
        1 : "MON",
        2 : "TUE",
        3 : "WED",
        4 : "THU",
        5 : "FRI",
        6 : "SAT"
    }
    
    for (let i = 1; i < a; i++) {
        switch (i) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
				// switch문에 break쓰는거 까먹으면 안됨..
        }
    }
    
    return answer;
}

players.forEach((player, index) => {
      positions[player] = (positions[player] | 0) + index;
     }) // 비트연산..!!
     
      for (let i = 0; i <= report.length; i++) {
        
        // id_list이용해서 신고자 인덱스 구하기
        reporter = report[i].split(" ")[0];
        let rptIdx = id_list.findIndex(i => i == reporter);
        
        if (superAgro.includes(report[i].split(" ")[1])) {
            reportNo[rptIdx] += 1;
        } else {
            break;
        }
    } // 왜안되는건지 이해가안감...
    
    Map.entry<> map : mapName.entires
    
     // 소요시간이 짧은 것이 먼저오는 큐
        PriorityQueue<int[]> workQ = new PriorityQueue<>((o1, o2) -> o1[1] - o2[1]);

}

public void dfs(int nodeIndex, boolean[] visited, int[][] dungeons, int k) {
        visited[nodeIndex] = true;
        
        System.out.print(nodeIndex + " -> ");
        
        for (int node : dungeons[nodeIndex]) {
            if(!visited[node]) {
                dfs(node, visited, dungeons, k);
            }
        }
        
    }
    
    // 7.16 aujourd'hui j'ai travaille sur javascript
    
    
 Integer[] integerArray = Arrays.stream(array).boxed().toArray(Integer[]::new);
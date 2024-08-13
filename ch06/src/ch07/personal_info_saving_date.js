/**
 * 
 */

 // 처음에 더럽게 풀었던 방식
// function solution(today, terms, privacies) {
//     var answer = [];
    
//     let termsSplit = [];
//     let todayDate  = today.replace(/\./g, '');
    
//     for (let n = 0; n < terms.length; n++) {
//         termsSplit.push(terms[n].split(" ")[0]);
//         termsSplit.push(terms[n].split(" ")[1]);
//     }

//     for (let i = 0; i < privacies.length; i++) {

//         let firstDate  = ((privacies[i].split(" "))[0]).replace(/[^0-9]/g, '');
//         let firstYear  = firstDate.substr(0, 4);
//         let firstMonth = (firstDate.substr(4, 2)) * 1;
//         let firstDay   = (firstDate.substr(6, 2)) * 1;

//         let thisTerm   = (privacies[i].split(" "))[1];
//         let prdMonth   = (termsSplit[(termsSplit.indexOf(thisTerm) + 1)]) * 1;
//         let expDay;

//           if (firstDay === 1) {
//             expDay = '28';
//         } else {
//             expDay = String((firstDay - 1)).padStart(2, '0');
//         }

//         let expMonth   = firstMonth + prdMonth;
//         let expYear    = firstYear;

//         if (expMonth > 12) {
//             expMonth   = expMonth - 12;
//             expYear    = (expYear * 1) + 1;
//         }

//         let expireDate = (String(expYear) + String(expMonth).padStart(2, '0') + expDay) * 1;

//         if (expireDate < todayDate) {
//             answer.push(i + 1);
//         }
//     }

//     return answer;
// }


function solution(today, terms, privacies) {
    var answer = [];
    
    let todayDate  = today.replace(/\./g, '');

    // console.log("termsSplit :: ", termsSplit);

    for (let i = 0; i < privacies.length; i++) {

        let [date, termChar] = privacies[i].split(" ");
        let [year, month, day] = date.split(".");
        
        let term = terms.find(t => t[0] == termChar);
        let termPeriod = parseInt(term.split(" ")[1]);

        let calculatingDate = year + month + day;
        
        let expYear  = parseInt(year) + Math.floor((parseInt(month) + termPeriod - 1) / 12);
        let expMonth = (parseInt(month) + parseInt(termPeriod) - 1) % 12 + 1;
        let expDay   = parseInt(day) - 1;
        // let expDay;
        // if (parseInt(day - 1) == 0) {
        //     expDay = 28
        // } else {
        //     expDay = parseInt(day - 1);
        // }
        
        // if (expDay > 1) {
        //     expDay--;
        // } else {
        //     expDay = 28;
        // }
        // 이상함...
        
        // day가 1일이었을 경우 00이 되니까
        // let expDay = parseInt(day - 1) == 0 ? 28 : parseInt(day - 1) 해야하는 거 아닌가?
        // 그런데 그렇게 하면 19번에서 실패뜸.
        // if문으로 해도 여전히..
        
        // console.log("expYear :: ", expYear, "expMonth :: ", expMonth, "expDay :: ", expDay);

        let expiredDate = parseInt(expYear + String(expMonth).padStart(2, '0') + String(expDay).padStart(2, '0'));
        
        // console.log("expiredDate ::: ", expiredDate);
        
        if (expiredDate < todayDate) {
            answer.push(i + 1);
        }
    }

    console.log("answer :: " , answer);
    return answer;
}
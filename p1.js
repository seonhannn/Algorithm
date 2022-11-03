// 레벨1 푸드파이트

function solution(food) {
    let ans = [];

    for(let i=0; i<food.length; i++) {
        if(food[i]%2) { // 홀수
            if(food[i] === 3) {
                for(let j=0; j<1; j++) {
                    ans.push(i);
                }
            } else {
                for(let j=0; j<(food[i]-1)/2; j++) {
                    ans[j] = i;
                }
            }
        } else { // 짝수
            for(let j=0; j<food[i]/2; j++) {
                ans.push(i);
            }
        }
    }

    let reverseAns = [...ans].reverse();

    ans.push(0);
    ans = ans.join("");
    reverseAns = reverseAns.join("");

    return ans+reverseAns;
}
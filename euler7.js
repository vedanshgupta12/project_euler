let count2 = 0;
let i = 1;

for (; i <= 9999999; i++) {
    if (count2 === 10001)
        break;
    let count = 0;
    for (let j = 1; j <= i; j++) {
        if (i % j === 0)
            count++;
    }
    if (count === 2)
        count2++;
}

console.log(i - 1);

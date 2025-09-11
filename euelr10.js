let sum = 0;

for (let i = 1; i < 2000000; i++) {
    let count = 0;
    for (let j = 1; j <= i; j++) {
        if (i % j === 0)
            count++;
    }
    if (count === 2)
        sum = sum + i;
}

console.log(sum);

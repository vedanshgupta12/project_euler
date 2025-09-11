let palprime = 0;

for (let i = 999; i >= 100; i--) {
    for (let j = 999; j >= 100; j--) {
        let sum = 0;
        let x = i * j;
        let y = x;
        while (y !== 0) {
            let r = y % 10;
            sum = sum * 10 + r;
            y = Math.floor(y / 10);
        }
        if (sum === x && sum > palprime)
            palprime = x;
    }
}

console.log(palprime);

for (let i = 1; i <= 1000; i++) {
    for (let j = i + 1; j <= 1000; j++) {
        let k = 1000 - i - j;
        if ((i * i + j * j) === k * k && i + j + k === 1000) {
            console.log(i * j * k);
        }
    }
}

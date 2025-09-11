let sumofsq = 0;
let sqofsum = 0;
let diff;

for (let i = 1; i <= 100; i++) {
    sqofsum = sqofsum + i;
    sumofsq = sumofsq + i * i;
}

sqofsum = sqofsum * sqofsum;
diff = sqofsum - sumofsq;

console.log(diff);

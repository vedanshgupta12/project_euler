let a;
let b=2;
let sum=0;
for(a=1;a<=4000000;)
{ let fibo=a+b;
    if(a%2===0)
    {
        sum+=a;
    }
    a=b;
    b=fibo;
}
console.log(sum);

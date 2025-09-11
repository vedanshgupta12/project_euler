
let primefact=1;
for(let i=1;i<=600851475143;i++)
{
    if(600851475143%i===0)
    {
        for(let j=1;j<=i;j++)
        { let fact = 0;
            if(j%i===0)
            {
                fact++;
            }
            if(fact>=primefact)
                primefact=fact;
        }
    }
}
console.log(primefact);

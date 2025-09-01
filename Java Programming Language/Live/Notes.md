modulo oerator to check even or odd
-- %

if (n%2==0){
    print even number
} else{
    print odd number
}

if n gives a remainder as 0 when divided by 2 then its a even number else it is odd



2. Prime number check

O(n) and O(n^1/2)

prime number is a number n which is either divisible by 1 or by itself --> 1,n

3,5,7,11,13


non-prime like 6 , 9 etc..

we start checking from 2 . hence it is the smallest and the only even prime number not start with 1

if the number n can be divided by any number from 2 to n-1 then we mark it as non-prime number

n>2
is_Prime = true;
for(int i = 2 ; i<= n-1; i++){
    if(n%i==0){
        is_Prime = false;
    }
}

print not prime;


this is running extra operations
taking O(n) as time complexity


lets do this with O(n^1/2) time complexity


at one point factors start repeating so we dont need to check after that point


as it is redundant and the main logic gets checked as soon as the divisible number is found hence marked as not prime


n^1/2 * n^1/2 is the point where it starts getting repeated

so we can check till n^1/2 and stop

for(i = 2; i*i <=n ; i++){
    if(n%i==0){
        isPrime = false;
    }
}
Print Prime number










3. Fibonacci Sequence

each number is the sum of the two preceding number

0 , 1 , _ , _ , _ , _ , _ , _
        
        
        1 , 2 , 3 , 5 , 8 , 13 , . . . .

        each term here is the sum of the two preceding numbers


-- nth term 
-- first n terms 


for(i = 2; i<=n ; i++){
    third = first + second;
    first = second;
    second = third;
}


nth fibonacci term is the third term
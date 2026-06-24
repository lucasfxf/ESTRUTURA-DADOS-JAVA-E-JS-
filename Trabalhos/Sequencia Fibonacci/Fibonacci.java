public class Fibonacci {
//fibo recursivo
public static int fiboRecursivo(int n){
    if(n == 0){
        return 0;
    }
    
    if(n == 1){
        return 1;
    }
    
    return fiboRecursivo(n - 1) + fiboRecursivo(n - 2);
}

//------------------------------------------------------------

//fibo iterativo
public static int fiboIterativo(int n){
    if (n == 0)
    return 0;

    if (n == 1)
    return 1;

int anterior = 0;
int atual = 1;

for(int i = 2; i <= n; i++){
   int proximo = anterior + atual;
   anterior = atual;
   atual = proximo;
}   
return atual;
}

//------------------------------------------------------------
    public static void main(String[] args) {
    }

}

//representação da fibo(7) - melhor entendimento
/*
fibo(7)
├── fibo(6)
│   ├── fibo(5)
│   │   ├── fibo(4)
│   │   │   ├── fibo(3)
│   │   │   └── fibo(2)
│   │   └── fibo(3)
│   └── fibo(4)
└── fibo(5)
    ├── fibo(4)
    └── fibo(3)
*/

/*
notei que a fibo de 4, 3 e 5 aparecem várias vezes,
então na minha perspectiva isso seria uma chamada redundante(que ocorre varias vezes na vdd).
*/
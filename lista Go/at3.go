package main

import "fmt"


type ContaBancaria struct {
    Titular string
    saldo   float64  
}


func (c *ContaBancaria) Depositar(valor float64) {
    if valor > 0 {
        c.saldo += valor
        fmt.Printf("Depósito de R$%.2f realizado com sucesso.\n", valor)
    } else {
        fmt.Println("Valor inválido para depósito.")
    }
}


func (c *ContaBancaria) Sacar(valor float64) {
    if valor > 0 && valor <= c.saldo {
        c.saldo -= valor
        fmt.Printf("Saque de R$%.2f realizado com sucesso.\n", valor)
    } else {
        fmt.Println("Saldo insuficiente ou valor inválido.")
    }
}


func (c ContaBancaria) GetSaldo() float64 {
    return c.saldo
}

func main() {
    
    conta := ContaBancaria{Titular: "JOSE", saldo: 500}

   
    conta.Depositar(200)
    conta.Sacar(100)
    fmt.Printf("Saldo atual: R$%.2f\n", conta.GetSaldo())
    conta.Sacar(700)  
}

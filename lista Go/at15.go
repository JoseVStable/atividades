package main

import (
    "errors"
    "fmt"
)


type SaldoInsuficienteError struct {
    Saldo      float64
    ValorSaque float64
}

func (e *SaldoInsuficienteError) Error() string {
    return fmt.Sprintf("Saldo insuficiente! Saldo atual: %.2f, Valor do saque: %.2f", e.Saldo, e.ValorSaque)
}


type ContaBancaria struct {
    Titular string
    Saldo   float64
}

func (c *ContaBancaria) Sacar(valor float64) error {
    if valor > c.Saldo {
        return &SaldoInsuficienteError{c.Saldo, valor}
    }
    c.Saldo -= valor
    return nil
}


func (c *ContaBancaria) Depositar(valor float64) {
    c.Saldo += valor
}

func main() {
    conta := ContaBancaria{Titular: "João", Saldo: 500}

    err := conta.Sacar(600)  
    if err != nil {
        fmt.Println(err)
    }
}

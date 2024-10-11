package main

import "fmt"


type Produto struct {
    Nome  string
    Preco float64
}


func SomarPrecos(produto1, produto2 Produto) float64 {
    return produto1.Preco + produto2.Preco
}

func main() {
    produto1 := Produto{"Produto A", 50.75}
    produto2 := Produto{"Produto B", 100.25}


    somaPrecos := SomarPrecos(produto1, produto2)

    fmt.Printf("Soma dos preços: R$%.2f\n", somaPrecos)
}

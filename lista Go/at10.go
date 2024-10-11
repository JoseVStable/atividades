package main

import "fmt"


func SomarDois(a, b int) int {
    return a + b
}


func SomarTres(a, b, c int) int {
    return a + b + c
}

func main() {
    fmt.Println("Soma de 2 números:", SomarDois(5, 10))
    fmt.Println("Soma de 3 números:", SomarTres(5, 10, 15))
}

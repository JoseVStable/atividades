package main

import "fmt"


type Motor struct {
    Tipo string
}


type Carro struct {
    Marca  string
    Modelo string
    Motor  Motor  
}


func (c Carro) ExibirDetalhes() {
    fmt.Printf("Carro: %s %s\n", c.Marca, c.Modelo)
    fmt.Printf("Motor: %s\n", c.Motor.Tipo)
}

func main() {
    
    motorV8 := Motor{Tipo: "V8"}

    
    carro := Carro{Marca: "Ford", Modelo: "Mustang", Motor: motorV8}

    
    carro.ExibirDetalhes()
}

package main

import "fmt"


type Carro struct {
    Marca     string
    Modelo    string
    Ano       int
    Velocidade int
}


func (c *Carro) Acelerar(incremento int) {
    c.Velocidade += incremento
    fmt.Printf("%s acelerou. Velocidade atual: %d km/h\n", c.Modelo, c.Velocidade)
}


func (c *Carro) Frear(decremento int) {
    c.Velocidade -= decremento
    if c.Velocidade < 0 {
        c.Velocidade = 0  
    }
    fmt.Printf("%s freou. Velocidade atual: %d km/h\n", c.Modelo, c.Velocidade)
}


func (c Carro) ExibirVelocidade() {
    fmt.Printf("Velocidade atual de %s: %d km/h\n", c.Modelo, c.Velocidade)
}

func main() {
    
    carro1 := Carro{Marca: "Toyota", Modelo: "Corolla", Ano: 2020, Velocidade: 0}

   
    carro1.Acelerar(30)
    carro1.Acelerar(50)
    carro1.Frear(20)
    carro1.ExibirVelocidade()
}

package main

import (
    "fmt"
    "sync"
)

type Configuracao struct {
    Valor string
}

var instance *Configuracao
var once sync.Once  


func GetInstance() *Configuracao {
    once.Do(func() {
        instance = &Configuracao{}
    })
    return instance
}

func main() {
    config1 := GetInstance()
    config2 := GetInstance()

    config1.Valor = "Configuração 1"
    fmt.Println("Config1:", config1.Valor)
    fmt.Println("Config2:", config2.Valor)  

    fmt.Println("São a mesma instância?", config1 == config2)
}

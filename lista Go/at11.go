package main

import "fmt"


type Funcionario interface {
    calcularSalario() float64
    exibirSalario()
}


type FuncionarioHorista struct {
    Nome            string
    SalarioPorHora  float64
    HorasTrabalhadas int
}


func (f FuncionarioHorista) calcularSalario() float64 {
    return f.SalarioPorHora * float64(f.HorasTrabalhadas)
}


func (f FuncionarioHorista) exibirSalario() {
    fmt.Printf("Nome: %s, Salário: R$ %.2f\n", f.Nome, f.calcularSalario())
}


type FuncionarioAssalariado struct {
    Nome          string
    SalarioMensal float64
}


func (f FuncionarioAssalariado) calcularSalario() float64 {
    return f.SalarioMensal
}


func (f FuncionarioAssalariado) exibirSalario() {
    fmt.Printf("Nome: %s, Salário: R$ %.2f\n", f.Nome, f.calcularSalario())
}

func main() {
    
    horista := FuncionarioHorista{
        Nome:            "Carlos",
        SalarioPorHora:  50.0,
        HorasTrabalhadas: 160,
    }

    
    assalariado := FuncionarioAssalariado{
        Nome:          "Maria",
        SalarioMensal: 4000.0,
    }

    
    horista.exibirSalario()
    assalariado.exibirSalario()
}

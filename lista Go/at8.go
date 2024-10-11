package main

import "fmt"


type Empregado struct {
    Nome   string
    Cargo  string
    Salario float64
}


func (e Empregado) ExibirDetalhes() {
    fmt.Printf("Nome: %s, Cargo: %s, Salário: R$ %.2f\n", e.Nome, e.Cargo, e.Salario)
}


type Empresa struct {
    Nome      string
    Empregados []Empregado  
}


func (e *Empresa) AdicionarEmpregado(empregado Empregado) {
    e.Empregados = append(e.Empregados, empregado)
}


func (e Empresa) ExibirEmpregados() {
    fmt.Printf("Empresa: %s possui os seguintes empregados:\n", e.Nome)
    for _, empregado := range e.Empregados {
        empregado.ExibirDetalhes()
    }
}

func main() {
    empregado1 := Empregado{Nome: "Carlos", Cargo: "Engenheiro de Software", Salario: 8000.00}
    empregado2 := Empregado{Nome: "Maria", Cargo: "Gerente de Projetos", Salario: 12000.00}


    empresa := Empresa{Nome: "Tech Solutions"}

  
    empresa.AdicionarEmpregado(empregado1)
    empresa.AdicionarEmpregado(empregado2)


    empresa.ExibirEmpregados()
}

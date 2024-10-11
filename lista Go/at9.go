package main

import "fmt"


type Imprimivel interface {
    Imprimir()
}


type Relatorio struct {
    Titulo   string
    Conteudo string
}

func (r Relatorio) Imprimir() {
    fmt.Printf("Relatório: %s\nConteúdo: %s\n\n", r.Titulo, r.Conteudo)
}


type Contrato struct {
    Parte1 string
    Parte2 string
    Termos string
}

func (c Contrato) Imprimir() {
    fmt.Printf("Contrato entre %s e %s\nTermos: %s\n\n", c.Parte1, c.Parte2, c.Termos)
}


func ExibirImprimivel(i Imprimivel) {
    i.Imprimir()
}

func main() {
    relatorio := Relatorio{Titulo: "Relatório Financeiro", Conteudo: "Detalhes do relatório financeiro do Q3."}
    contrato := Contrato{Parte1: "Empresa A", Parte2: "Empresa B", Termos: "Termos e condições do acordo."}

    ExibirImprimivel(relatorio)
    ExibirImprimivel(contrato)
}

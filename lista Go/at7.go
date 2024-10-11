package main

import "fmt"


type Professor struct {
    Nome    string
    Escolas []*Escola  
}


func (p *Professor) AdicionarEscola(escola *Escola) {
    p.Escolas = append(p.Escolas, escola)
}


func (p Professor) ExibirEscolas() {
    fmt.Printf("Professor %s leciona nas escolas:\n", p.Nome)
    for _, escola := range p.Escolas {
        fmt.Println(" -", escola.Nome)
    }
}


type Escola struct {
    Nome       string
    Professores []*Professor  
}


func (e *Escola) AdicionarProfessor(professor *Professor) {
    e.Professores = append(e.Professores, professor)
}


func (e Escola) ExibirProfessores() {
    fmt.Printf("Escola %s tem os professores:\n", e.Nome)
    for _, professor := range e.Professores {
        fmt.Println(" -", professor.Nome)
    }
}

func main() {
   
    professor1 := &Professor{Nome: "Carlos"}
    professor2 := &Professor{Nome: "Maria"}

    
    escola1 := &Escola{Nome: "Escola A"}
    escola2 := &Escola{Nome: "Escola B"}

    
    escola1.AdicionarProfessor(professor1)
    escola1.AdicionarProfessor(professor2)
    escola2.AdicionarProfessor(professor2)

    
    professor1.AdicionarEscola(escola1)
    professor2.AdicionarEscola(escola1)
    professor2.AdicionarEscola(escola2)

    
    escola1.ExibirProfessores()
    escola2.ExibirProfessores()

    
    professor1.ExibirEscolas()
    professor2.ExibirEscolas()
}

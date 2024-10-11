class Professor:
    def __init__(self, nome):
        self.nome = nome
        self.escolas = []


    def adicionar_escola(self, escola):

        if escola not in self.escolas:
           self.escolas.append(escola) 
           escola.adicionar_professor(self)
    
    def __str__(self):
        return self.nome
    


class Escola: 
     def __init__(self, nome):
         self.nome = nome
         self.professores = []

    
     def adicionar_professor(self, professor):
         if professor not in self.professores:
             self.professores.append(professor)
    
     def __str__(self):
         return self.nome
     


escola0 = Escola("Escola A")
escola1 = Escola("Escola B")

professor0 = Professor("Pedro")
professor1 = Professor("Ana")


professor0.adicionar_escola(escola0)
professor0.adicionar_escola(escola1)
professor1.adicionar_escola(escola0)


print(f"Professores da {escola0}: {[str(p) for p in escola0.professores]}")
print(f"Professores da {escola1}: {[str(p) for p in escola1.professores]}")


print(f"{professor0} leciona em: {[str(e) for e in professor0.escolas]}")
print(f"{professor1} leciona em: {[str(e) for e in professor1.escolas]}")
        
         
    
    
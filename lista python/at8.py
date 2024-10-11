class Empregado:
    def __init__(self, nome, cargo, salario):
        self.nome = nome
        self.cargo = cargo
        self.salario = salario

    def __str__(self):
        return f"{self.nome}, Cargo: {self.cargo}, Salário: R${self.salario:.2f}"
    


class Empresa:
    def __init__(self, nome):
        self.nome = nome
        self.empregados = []

    def adicionar_empregado(self, empregado):
        self.empregados.append(empregado)

    def listar_empregados(self):
        if not self.empregados:
            print("Nenhum empregado cadastrado.")
        else:
            print(f"Empregados da {self.nome}:")
            for empregado in self.empregados:
                print(empregado)



empregado0 = Empregado("Jorge", "Desenvolvedor Senior", 15000)
empregado1 = Empregado("Jose", "Gerente", 7000)
empregado2 = Empregado("Roberta", "Analista", 6000)


empresa = Empresa("Microsoft")


empresa.adicionar_empregado(empregado0)
empresa.adicionar_empregado(empregado1)
empresa.adicionar_empregado(empregado2)

empresa.listar_empregados()




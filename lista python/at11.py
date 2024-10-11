from abc import ABC, abstractmethod


class Funcionario(ABC):
    def __init__(self, nome):
        self.nome = nome

    @abstractmethod
    def calcular_salario(self):
        pass

class FuncionarioHorista(Funcionario):
    def __init__(self, nome, horas_trabalhadas, salario_hora):
        super().__init__(nome)
        self.horas_trabalhadas = horas_trabalhadas
        self.salario_hora = salario_hora

    def calcular_salario(self):
        return self.horas_trabalhadas * self.salario_hora


class FuncionarioAssalariado(Funcionario):
    def __init__(self, nome, salario_fixo):
        super().__init__(nome)
        self.salario_fixo = salario_fixo

    def calcular_salario(self):
        return self.salario_fixo


horista = FuncionarioHorista("Jose", 320, 100)  
assalariado = FuncionarioAssalariado("Roberta", 10000)  

print(f"Salário de {horista.nome}: R${horista.calcular_salario():.2f}")
print(f"Salário de {assalariado.nome}: R${assalariado.calcular_salario():.2f}")

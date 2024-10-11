from typing import Protocol


class Imprimivel(Protocol):
    def imprimir(self):
        pass


class Relatorio:
    def __init__(self, titulo, conteudo):
        self.titulo = titulo
        self.conteudo = conteudo

    def imprimir(self):
        print(f"Relatório: {self.titulo}\nConteúdo: {self.conteudo}\n")

class Contrato:
    def __init__(self, parte1, parte2, termos):
        self.parte1 = parte1
        self.parte2 = parte2
        self.termos = termos

    def imprimir(self):
        print(f"Contrato entre {self.parte1} e {self.parte2}\nTermos: {self.termos}\n")

def mostrar_imprimivel(documento: Imprimivel):
    documento.imprimir()


relatorio = Relatorio("Relatório Financeiro", "Detalhes do relatório financeiro do Q3.")
contrato = Contrato("Empresa A", "Empresa B", "Termos e condições do acordo.")

mostrar_imprimivel(relatorio)
mostrar_imprimivel(contrato)
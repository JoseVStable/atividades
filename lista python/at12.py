class Produto:
    def __init__(self, nome, preco):
        self.nome = nome
        self.preco = preco

    
    def __add__(self, outro_produto):
        return self.preco + outro_produto.preco

    def __str__(self):
        return f"{self.nome} - R${self.preco:.2f}"


produto1 = Produto("Produto X", 90.75)
produto2 = Produto("Produto Y", 300.25)


soma_precos = produto1 + produto2

print(f"Soma dos preços: R${soma_precos:.2f}")

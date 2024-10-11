class Carro:
    def __init__(self, marca, modelo, ano):
        self.marca = marca
        self.modelo = modelo
        self.ano = ano
        self.velocidade = 0

    def caracteristicas_carro(self):
        return f"Marca: {self.marca}, Modelo: {self.modelo}, Ano: {self.ano}"
    
    def acelerar(self, aumento):
        self.velocidade += aumento
        print(f"A velocidade do carro aumentou para {self.velocidade} km/h.")

    def frear( self, reducao):
        if self.velocidade - reducao < 0:
            self.velocidade = 0
        
        else:
             self.velocidade -= reducao
        print(f"A velocidade do carro reduziu para {self.velocidade} km/h.")
    
    def mostrar_velocidade(self):
        print(f"Velocidade atual: {self.velocidade} km/h.")



carro0 = Carro("Fiat", "Mobi", 2024)

print(carro0.caracteristicas_carro())

carro0.acelerar(100)
carro0.mostrar_velocidade()
carro0.frear(30)
carro0.mostrar_velocidade()


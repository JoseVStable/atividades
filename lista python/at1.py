class Carro:
    def __init__(self, marca, modelo, ano):
        self.marca = marca
        self.modelo = modelo
        self.ano = ano

    def caracteristicas_carro(self):
        return f"Marca: {self.marca}, Modelo: {self.modelo}, Ano: {self.ano}"
    

carro0 = Carro("Fiat", "Mobi", 2024)
carro1 = Carro("Volkswagen", "Gol", 2024)
carro2 = Carro("Hyundai", "HB20", 2024)

print(carro0.caracteristicas_carro())
print(carro1.caracteristicas_carro())
print(carro2.caracteristicas_carro())
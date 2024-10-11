class Motor:
    def __init__(self, potencia):
        self.potencia = potencia

    def __str__(self):
        return f"Motor com {self.potencia} CV"
    

class Carro:
    def __init__(self, marca, modelo, ano, potencia_motor):
        self.marca = marca
        self.modelo = modelo
        self.ano = ano
        self.motor = Motor(potencia_motor)

    def caracteristicas_carro(self):
        return (f"Marca: {self.marca}, Modelo: {self.modelo}, Ano: {self.ano}, "
                f"{self.motor}")
    
carro0 = Carro("Ford", "Mustang", 2022, 550)

print(carro0.caracteristicas_carro())


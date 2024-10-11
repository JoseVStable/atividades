class Calculadora:

    
    def somar(self, a, b, c=None):
        if c is None:
            return a + b  
        return a + b + c 


calculadora = Calculadora()
print("Soma de 2 números:", calculadora.somar(20, 40))
print("Soma de 3 números:", calculadora.somar(15, 25, 35))
class ContaBancaria:
    def __init__(self, titular, saldo_inicial = 0):
        self.__titular = titular
        self.__saldo = saldo_inicial

    def mostrar_detalhes(self):
        return f"Titular: {self.__titular}, Saldo: R${self.__saldo:.2f}"
    

    def depositar (self, valor):
        if valor > 0:
            self.__saldo += valor
            print(f"Depósito de R${valor:.2f} realizado com sucesso.")
        else:
            print("O valor do depósito deve ser positivo!")  


    def sacar(self, valor):
        if valor > self.__saldo:
            print("Saldo insuficiente para a transação.") 
        
        elif valor> 0:
            self.__saldo -= valor
            print(f"Saque de R${valor:.2f} realizado com sucesso.")
        
        else:
            print("O valor de saque deve ser positivo!")

    
    def mostrar_saldo(self):
         return f"Saldo atual: R${self.__saldo:.2f}"
    


conta = ContaBancaria("José Vieira", 50000)

print(conta.mostrar_detalhes())

conta.depositar(1000)
print(conta.mostrar_saldo())

conta.sacar(500)
print(conta.mostrar_saldo())





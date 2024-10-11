class SaldoInsuficienteException(Exception):
    def __init__(self, saldo, valor_saque):
        self.saldo = saldo
        self.valor_saque = valor_saque
        super().__init__(f"Saldo insuficiente! Saldo atual: {self.saldo}, Valor do saque: {self.valor_saque}")

class ContaBancaria:
    def __init__(self, titular, saldo=0):
        self.titular = titular
        self.saldo = saldo

    def sacar(self, valor):
        if valor > self.saldo:
            raise SaldoInsuficienteException(self.saldo, valor)
        self.saldo -= valor
        return valor

    def depositar(self, valor):
        self.saldo += valor


conta = ContaBancaria("Jose", 5000)

try:
    conta.sacar(5100)  
except SaldoInsuficienteException as e:
    print(e)

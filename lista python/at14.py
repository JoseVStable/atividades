class Configuracao:
    _instance = None  

    def __new__(cls):
        if cls._instance is None:
            cls._instance = super(Configuracao, cls).__new__(cls)
            cls._instance.valor = None  
        return cls._instance


config0 = Configuracao()
config1 = Configuracao()

config0.valor = "Configuração 0"
print(f"Config0: {config0.valor}")
print(f"Config1: {config1.valor}") 

print(f"São a mesma instância? {config0 is config1}")

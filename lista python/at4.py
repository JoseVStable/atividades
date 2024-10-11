class Animal:
    def __init__(self, nome):
        self.nome = nome
    
    def som (self):
        raise NotImplementedError("Subclasses devem implementar o método som.")
    

class Cachorro(Animal):
    def som(self):
        return f"{self.nome}: Au au!"
    

class Gato(Animal):
     def som(self):
        return f"{self.nome}: Miau!"
     

cachorro = Cachorro("Mike")
gato = Gato("Garfield")

print(cachorro.som())
print(gato.som())

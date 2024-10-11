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
     


def emitir_sons(animais):
    for animal in animais:
        print(animal.som())

cachorro = Cachorro("Mike")
gato = Gato("Garfield")

lista_de_animais = [cachorro, gato]


emitir_sons(lista_de_animais)


class Matematica:

    @staticmethod
    def fatorial(n):
        if n == 0 or n == 1:
            return 1
        else:
            return n * Matematica.fatorial(n - 1)


print(f"Fatorial de 7: {Matematica.fatorial(7)}")
print(f"Fatorial de 2: {Matematica.fatorial(2)}")

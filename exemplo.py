#Tipagem dinâmica.
nome = input("Digite seu nome: ")
idade = int(input("Digite sua idade:"))
peso = float(input("Digite seu peso:"))

#Exibir resultados:
print(f"Nome: {nome}")
print(f"idade: {idade}")
print(f"Peso: {peso}")

if idade > 18:
    print("Adulto.")
elif idade >= 15:
    print("Aolescente.")
else:
    print("Criança")
print("Fim")

#Tiapagem estática.
nome: str
idade: int
peso: float

nome = (input("Digite seu nome: "))
idade = (input("Digite sua idade:"))
peso = (input("Digite seu peso:"))
#Alt + shift + seta baixo = Duplicar a mesma linha
#Ctrl + D para selecionar elementos do mesmo nome


#Laço de repetição.
for i in range(1,11):
    print(f"Número {i+1}")

for i in range(10, 0, -1):
    print(f"Número {i-1}")

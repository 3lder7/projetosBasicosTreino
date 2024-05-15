import os
os.system("cls || clear")

qtdPares = 0wire
qtdImpares = 0

for i in range(5):
    num = int(input("Digite um número:"))
    if num%2 == 0:
        qtdPares +=1
    else:
        qtdImpares +=1
print(f"Quantidade de pares:{qtdPares}")
print(f"Quantidade de ímpares:{qtdImpares}")

        
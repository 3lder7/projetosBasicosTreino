import os
#Limpa o terminal
os.system("cls || clear")

num = int(input("Digite um número:"))

for i in range(10, 0 , -1):
    print(f"{num} x {i} = {num * i}")

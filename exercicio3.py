import os
#Limpa o terminal
os.system("cls || clear")

num = 0

for i in range(5):
    num += int(input("Digite um número:"))
    

print(f"Soma:{num}")
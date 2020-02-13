import random
import string
listaTemp = []
letras = string.ascii_lowercase
lista=[]
dicc = {}
for x in range(50):
    palabra = ""
    rand_letras = random.choices(letras, k=8)
    listaTemp.append(rand_letras[0])

    palabra = "".join(rand_letras)
    print(palabra)
listaTemp.sort()
print(listaTemp)

for x in range (len(listaTemp)):
    dicc[listaTemp[x]] = 0
for x in listaTemp:
    for y in dicc:
        if y == x:
            dicc[x]+=1
print(dicc)
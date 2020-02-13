inicial=input('ingrese la inicial de los paises a buscar: ').upper()
f = open('PIBLatinoamerica.txt')

line = f.readline()

while line:
    if line[0]==inicial:
        print(line)
    line = f.readline()

f.close()
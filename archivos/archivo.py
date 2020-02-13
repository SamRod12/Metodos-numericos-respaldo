def escribir(num):
    arch = open("n_tabla.txt","w")

    for x in range(10):
        arch.write(str(num)+" x "+str(x+1)+" = "+str(num*(x+1))+"\n")
    arch.close()
def leer():
    arch = open("n_tabla.txt", "r")
    linea = arch.readline()
    while linea != '':
        print(linea, end='')
        linea = arch.readline()
    arch.close()

numero = int(input("ingresa un numero: "))

escribir(numero)
leer()

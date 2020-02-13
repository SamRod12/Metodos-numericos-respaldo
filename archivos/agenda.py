import os
def obt_telefono(arch, cliente):
    try:
        f = open(arch, 'r')
    except FileNotFoundError:
        return ('¡El fichero ' + arch + ' no existe!\n')
    else:
        agenda = f.readlines()
        f.close()
        agenda = dict([tuple(line.split(',')) for line in agenda])
        if cliente in agenda:
            return agenda[cliente]
        else:
            return ('¡El cliente ' + cliente + ' no existe!\n')

def agregar(arch, cliente, tel):
    try:
        f = open(arch, 'a')
    except FileNotFoundError:
        return ('¡El fichero ' + arch + ' no existe!\n')
    else:
        f.write(cliente + ',' + tel + '\n')
        f.close()
        return ('El teléfono se ha añadido.\n')

def eliminar(arch, cliente):
    try:
        f = open(arch, 'r')
    except FileNotFoundError:
        return ('¡El fichero ' + arch + ' no existe!\n')
    else:
        agenda = f.readlines()
        f.close()
        agenda = dict([tuple(line.split(',')) for line in agenda])
        if cliente in agenda:
            del agenda[cliente]
            f = open(arch, 'w')
            for nombre, tel in agenda.items():
                f.write(nombre + ',' + tel)
            f.close()
            return ('El cliente se ha borrado\n')
        else:
            return ('El cliente ' + cliente + ' no existe\n')


def crear_agenda(arch):
    if os.path.isfile(arch):
        answer = input('El fichero ' + arch + ' ya existe. ¿Desea vaciarlo (S/N)? ')
        if answer == 'N':
            return 'No se ha creado el fichero porque ya existe.\n'
    f = open(arch, 'w')
    f.close()
    return 'Se ha creado el fichero.\n'


def menu():
    print('1 - Consultar un teléfono')
    print('2 - Añadir un teléfono')
    print('3 - Eliminar un teléfono')
    print('4 - Crear el listín')
    print('0 - Salir')
    option = input('que quiere hacer?: ')
    return option


def agenda():
    '''
    Función que lanza la aplicación para la gestión del listín telefónico.
    '''
    arch = 'agenda2020.txt'
    while True:
        option = menu()
        if option == '1':
            nombre = input('Introduce el nombre del cliente: ')
            print(obt_telefono(arch, nombre))
        elif option == '2':
            nombre = input('Introduce el nombre del cliente: ')
            tel = input('Introduce el teléfono del cliente: ')
            print(agregar(arch, nombre, tel))
        elif option == '3':
            nombre = input('Introduce el nombre del cliente: ')
            print(eliminar(arch, nombre))
        elif option == '4':
            print(crear_agenda(arch))
        else:
            break
    return


agenda()

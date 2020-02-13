import random

for x in range(20):
    cont = 0
    password = ""
    for x in range(2):
        for y in range(2):
            if cont == 0 :
                consonante = random.choice('QWRTYPLKJHGFDSMNBVCXZ')
                password += consonante
            else:
                consonante = random.choice('qwrtyplkjhgfdszxcvbnm')
                password += consonante
            vocal = random.choice('aeiou')
            password+=vocal
            cont += 1
    password+="_"
    numrand1 = random.randint(0,9)
    password+=str(numrand1)
    numrand2 = random.randint(0, 9)
    password += str(numrand2)
    print(password)
    cont=0
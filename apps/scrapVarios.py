import requests
from bs4 import BeautifulSoup
import csv
from datetime import datetime

# indicar la ruta
url_page = 'http://www.bolsamadrid.es/esp/aspx/Indices/Resumen.aspx'

# tarda 480 milisegundos
page = requests.get(url_page).text 
soup = BeautifulSoup(page, "html.parser")

# Obtenemos la tabla por un ID específico
try:
    tabla = soup.find('table', attrs={'id': 'ctl00_Contenido_tblÍndices'})
    name=""
    price=""
    nroFila=1
    for fila in tabla.find_all("tr"):
        nroCelda=0
        for celda in fila.find_all('td'):
            if nroCelda==0:
                name=celda.text
                #print("Indice:", name)
            if nroCelda==2:
                price=celda.text
                #print("Valor:", price)
            nroCelda=nroCelda+1
        nroFila=nroFila+1
        with open('bolsa_ibex35.csv', 'a') as csv_file:
            writer = csv.writer(csv_file)
            writer.writerow([name, price, datetime.now()])
    print("Se genero el archivo correctamente")
except Exception as e:
    raise e
    print("Se genero un error")



# Abrimos el csv con append para que pueda agregar contenidos al final del archivo
#with open('bolsa_ibex35.csv', 'a') as csv_file:
  #writer = csv.writer(csv_file)
  #writer.writerow([name, price, datetime.now()])



#with open('bolsa_ibex35.csv','r'), open ('bolsa_ibex35_filt.csv','w') as fin, f:
#    writer = csv.writer(f, delimiter=' ')            
#    for row in csv.reader(fin, delimiter=' '):
#        if row[2] == 'Central':
 #           writer.writerow(row)
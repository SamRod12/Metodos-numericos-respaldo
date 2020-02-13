import requests
from bs4 import BeautifulSoup
import csv
from datetime import datetime

# indicar la ruta
url_page = 'https://animeflv.net/'

# tarda 480 milisegundos
page = requests.get(url_page).text
soup = BeautifulSoup(page, "html.parser")

# Obtenemos la tabla por un ID específico
lista = soup.find('ul', attrs={'class': 'ListSdbr'})
for fila in lista.find_all("li"):
    name = fila.find("a").text
    with open('animes.csv', 'a') as csv_file:
        writer = csv.writer(csv_file)
        writer.writerow([name])
print("Se genero el archivo correctamente")


# Abrimos el csv con append para que pueda agregar contenidos al final del archivo

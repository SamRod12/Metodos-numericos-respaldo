import urllib.request
from bs4 import BeautifulSoup


datos = urllib.request.urlopen("https://www.openwebinars.net").read().decode()

soup = BeautifulSoup(datos,"html.parser")

tags = soup('div')

for tag in tags:
    print(tag.get('class'))
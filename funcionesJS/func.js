function numero(num){
    if(num > 0){
        texto = "el numero "+ num +" es positivo"
    }
    else if (num <0){
        texto = "el numero "+ num +" es negativo"
    }
    else{
        texto = "el numero es nulo"
    }
    return texto
}

function main(){
    var numer = parseInt(document.getElementById("entrada").value)
    salida.innerHTML = numero(numer)
}
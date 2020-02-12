function saludo1(){
    alert("Hola");
}

function saludo2(){
    alert("eeey muy buenas a todos")
}

function caja(){
    var contenedor=document.getElementById("cajas")
    var caja=document.createElement("div");
    caja.className="caja";
    contenedor.appendChild(caja);
} 

function cambio(){
var cajas=document.getElementsByClassName("caja");
        function color(){
            this.classList.toggle("negro");
        }
        for(var i=0;i<cajas.length;i++){
            cajas[i].addEventListener("click",color)
        }
}
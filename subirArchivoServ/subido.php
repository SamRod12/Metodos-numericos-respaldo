<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="estilos/estilos.css">
    <title>Archivo cargado</title>
</head>
<body>
<div id="wrapper">
        <div id="contenedor">
            <?php
                if($_FILES["flnombre"]["type"] == "text/plain"){
                    $archivo = $_FILES["flnombre"]["tmp_name"];
                    $destino = "archivos/". $_FILES["flnombre"]["name"];
                    ?>
                    <div class="correcto">
                    <?php
                    echo "<h3>El archivo ".$_FILES["flnombre"]["name"]." tiene el formato correcto</h3>";
                    ?>
                    <img src="img/verf.png">
                    </div>
                    <div class="correcto">
                    <h2>Contenido del archivo</h2>
            <?php
                $archivoID = fopen($archivo, "r");
                $cont = 1;
                while( !feof($archivoID)){
                    $linea = fgets($archivoID, 1024);    
                    print "<p>(".$cont." , ".strlen($linea).")  ".$linea."</p>";
                    $cont += 1;
                }
                fclose($archivoID);
                    echo"<h4>Archivo subido</h4><br><br>
                        <a href=\"cargarArchivo.php\">Volver</a>";
                }else{
                ?>
                </div>
                    <div class="incorrecto">
                    <?php
                    echo "<h3>El archivo ".$_FILES["flnombre"]["name"]." no tiene el formato correcto</h3>";
                    ?>
                    <img src="img/nop.png" >
                    </div>
                    <div class="incorrecto">
                    <?php
                    echo"<h4>Solo se permiten archivos de texto plano.</h4>
                    <a href=\"cargarArchivo.php\">Volver</a>";
                }
                ?>
                </div>
        </div>
        <footer>
                <p> &copy;Leo</p>
        </footer>

    </div>
</body>
</html>
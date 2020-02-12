<!DOCTYPE html>
<html>
    <head>
        <title>Empleados de Sucursal</title>
    </head>
    <body>
<?php

include_once("conxnbd.php");
$conn = conectarbd();
$sucursal = $_GET["cmbSucursal"];

if($sucursal ==""){
    header("Location: index.php");
}
$qry = "SELECT u.idUsuario, u.nombre, s.nombre AS sucursal "."FROM usuarios AS u "."INNER JOIN sucursal AS s ON "."u.idSucursal = s.idSucursal AND s.nombre = '".$sucursal."'";
echo "<h3>Bases de datos con php</h3>\n<h2>Empleados de la sucursal'".$sucursal."´</h2>";

if($resultset = $conn->query($qry)){
    $cant_regs = $resultset->num_rows;
    if($cant_regs <=0){
        echo "<h2>No se encontraron empleados en la sucursal <nombreSucursal> . </h2>";
    }else{
        echo "<table border='1'>";
        echo "<thead>\n <tr><th>Id Usuario</th><th>Nombre</th></tr></thead>";
        echo "<tbody>\n";
        while($linea = $resultset->fetch_assoc()){
            echo "<tr><td>".$linea["idUsuario"]."</td><td>".$linea["nombre"]."</td></tr>\n";
        }
        echo "</tbody>\n</table>";
}

}
?>
<br><br>
<a href="index.php">Regresar a la pagina inicial.</a>
</body>
</html>
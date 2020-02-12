<!DOCTYPE html>
<html>
    <head>
        <title>Empleados de Sucursal</title>
        <link rel="stylesheet" type="text/css" href="css/estilos.css">
    </head>
    <body>
<?php
error_reporting(E_ALL ^ E_NOTICE);

include("conexion.php");
$conn = conectarbd();
$Mes = $_GET["cmbMeses"];
if($Mes ==""){
    header("Location: index.php");
}
?>
<div id = "contenedor">
<?php
$qry = "SELECT Employees.FirstName, Orders.OrderDate , Orders.RequiredDate, Orders.ShipName "."FROM Orders INNER JOIN Employees ON Employees.EmployeeID = Orders.EmployeeID AND MONTH(Employees.BirthDate)= '".$Mes."' ";
echo "<h3>Bases de datos con php</h3>\n<h2>Orden realizada por empleado con mes: '".$Mes."´</h2>";
echo $qry;
?>
<div id=tabla>
<?php
if($resultset = $conn->query($qry)){
    $cant_regs = $resultset->num_rows;
    if($cant_regs <=0){
        echo "<h2>No se encontraron Ordenes del empleado . </h2>";
    }else{
    
        echo "<table border='1'>";
        echo "<thead>\n <tr><th>Nombre Empleado</th><th>Fecha de orden</th> <th>Fecha requerido</th><th>Nombre Cliente</th></tr></thead>";
        echo "<tbody>\n";
        while($linea = $resultset->fetch_assoc()){
            echo "<tr><td>".$linea["FirstName"]."</td><td>".$linea["OrderDate"]."</td><td>".$linea["RequiredDate"]."</td><td>".$linea["ShipName"]."</td></tr>\n";
        }
        echo "</tbody>\n</table>";
}
}
?>
</div>
<?php
echo "<br><br><a href='index.php'>Regresar a la pagina inicial.</a>";
?>
</div>
</body>
</html>
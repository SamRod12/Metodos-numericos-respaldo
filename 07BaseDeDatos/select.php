<?php
     error_reporting(E_ALL ^ E_NOTICE);
     include("conxnbd.php");
     $conn = conectarbd();
     if($conn->connect_error){
         die("<br/>Fallo el intento de conexion a la base de datos:"
         .$conn->connect_error."<br/>");
     }
     $sucursal=$_GET["ed_sucursal"];
     $sql_sel ="SELECT u.*,s.nombre AS sucursal FROM usuario u INNER JOIN sucursal s ON s.idSucursal = u.idSucursal";
     if($sucursal != "+" and $sucursal !=""){
         $sql_sel=$sql_sel . "WHERE s.nombre='".$sucursal."'";
     }
     echo $sql_sel;
     if($resultset = $conn->query($sql_sel)){
         echo "<ul> \n";
         while($linea = $resultset->fetch_assoc()){
             echo"<li>" . $linea["idSucursal"]."(".$linea["sucursal"].")-".$linea["nombre"]."</li> \n";

         }
         echo "<\ul> \n";
         $resultset->close();
     }else{
        echo"Ocurrio un error en la consulta";
     }
?>
<br /><br /> <a href="index.php">Regresa a la pagina inicial.</a>
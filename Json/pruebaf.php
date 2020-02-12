
<?php
// Los delimitadores pueden ser barra, punto o guión
$fecha = "04/30/1973";
list($mes, $día, $ano) = split('[/.-]', $fecha);
echo "<p>Mes: ". $mes."; Día: ". $día."; Año: ".$ano."</p>\n";
?>

<?php

echo '<select id ="mes" name="cmbMeses">\n';
echo '<option value="">Seleciona un Mes</option>\n';
$meses= array(1,2,3,4,5,6,7,8,9,10,11,12);
for($x=0;$x < sizeof($meses);$x++){
    echo "<option value='".$meses[$x]."'>".$meses[$x]."</option>\n";
}
echo "</select>\n"
?>
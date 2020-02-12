
<?php
    $numero = intval($_GET["numero"]);
    $factor = 1;
?>
<head>
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<div id="tabla">

<table>
    <tr><td>Numero</td><td>Factorial</td></tr>
    <?php
        for ($x = 0; $x <= $numero; $x ++){
            if ($x==0){
                echo "<tr><td>".$x."</td><td>".$factor."</td></tr>";
            }
            else{
                $factor *= $x;
                echo "<tr><td>".$x."</td><td>".$factor."</td></tr>";
            }
        }

    ?>
    <br><br><br>
    <a href="forma.html">Regresar</a>
</table>
<div>
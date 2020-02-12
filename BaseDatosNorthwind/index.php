<!DOCTYPE html>
<html lang = "es">
	<head>
		<meta charset = "UTF-8" />
		<title>Bases de datos</title>
		<link rel="stylesheet" type="text/css" href="css/estilos.css">
	</head>
	<body>
		<h3>Bases de datos con PHP</h3>
	
		<form action="consulta.php" method="get" 
						enctype="text/plain" name="frmOrden">
		<div>
		<h2>Orden de compra por Mes.</h2>
		  <label for="mes">Mes:</label>
		    <?php include("combo.php"); ?> 
		 	  <br/> <br/>
			<input type = "submit" name = "btn_entrar" value = "Buscar"/> 
		<br/> <br/>
		</div>
		</form>


	</body>
</html>



<!--		<div>
		  <label for="sucursal">Sucursal sin form:</label>
		  <select id="sucursal" name="cmbSucursal" required>
		    <option value="">Selecciona una sucursal</option>
		  // Este include hace un query y pinta los option que faltan
		    <?php include("combo.php"); ?> 
		  </select>
		</div> -->



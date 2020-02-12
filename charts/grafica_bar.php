<?php
  $con = mysqli_connect('localhost','root','Tsukiko@81','Northwind') or Die(mysql_error());
?>
<html>
  <head>
    <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
    <script type="text/javascript">
      
      google.charts.load('current', {packages:['corechart']});
      google.charts.setOnLoadCallback(drawChart);

      function drawChart() {

        var data = google.visualization.arrayToDataTable([
          <?php
          $query = "SELECT COUNT(ProductID) as ProductCount, ProductName FROM Products GROUP BY(ProductName)";
          ?>
          ['Producto', 'Ventas'],
          
          <?php
          $exec = mysqli_query($con,$query);
 		         while($row = mysqli_fetch_array($exec)){

 			        echo '["'.$row['ProductName'].'",'.$row['ProductCount'].'],';
              }
              ?>
        ]);
             
        var options = {
          title: 'My Daily Activities'
        };

        var chart = new google.visualization.PieChart(document.getElementById('piechart'));

        chart.draw(data, options);
      }
    </script>


  </head>
  <body>
    <div align="center"><h2>Gráfica de Pie</h2></div>
    <div align="center"><h3>Ventas por mes</h3></div>
    <div align="center" id="piechart" style="width: 900px; height: 500px;"></div>

  </body>
</html>
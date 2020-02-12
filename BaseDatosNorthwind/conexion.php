<?php

function conectarbd(){
    $servername="localhost";
    $username="root";
    $pass="Tsukiko@81";
    $dbname="Northwind";

    $conxn = new mysqli($servername,$username,$pass,$dbname);
    return $conxn;
}

?>
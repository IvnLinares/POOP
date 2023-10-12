<%@page import="java.sql.ResultSet"%>
<%@page import="procesos.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/tabla.css" rel="stylesheet" type="text/css">
        <title>Tabla</title>
    </head>
    <body>
        
        <h1>Prueba Tabla</h1>
<%
    //Conexion conn = new ConexionPool();
    Conexion conn = new ConexionBD();
    Operaciones.setConexion(conn);

    String[][] paises =
    Operaciones.consultar("SELECT * FROM paises");
  
    String[] cabeceras = new String[]{
      "ID Pais",
      "Nombre Pais"
    };
    Tabla tab = new Tabla(paises, //array que contiene los datos
          "50%", //ancho de la tabla px | % 
          Tabla.STYLE.TABLE01, //estilo de la tabla
          Tabla.ALIGN.CENTER,  // alineacion de la tabla
          cabeceras); //array con las cabeceras de la tabla
  
    tab.setEliminable(true);
    tab.setModificable(true);
    tab.setSeleccionable(true);
    tab.setPaginaEliminable("eliminar.jsp");
    tab.setTextoEliminable("quitar");
    tab.setTextoModificable("Actualizar");
    tab.setIconoEliminable("iconos/delete.png");
    tab.setColumnasSeleccionables(new int[]{1});
    tab.setPie("Resultado paises");
        String tabla01 = tab.getTabla();
        out.println(tabla01);
        %>
    </body>
</html>

<%@page import="java.util.*"%>
<%@page import="procesos.*"%>
<%@page import="entidades.*"%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Prueba operaciones</title>
        <link rel="stylesheet" href="css/tabla.css"/>
    </head>
    <body>
        <h1>Prueba Conexion</h1>
        <%
  //Creando la conexion
  //Conexion conn = new ConexionPool();
  ConexionBD conn = new ConexionBD();
  Operaciones.setConexion(conn);
           
  //Creando objetos para operaciones
    Paises p = new Paises(100);
    Aeropuertos a = new Aeropuertos(
            "EL SALVADOR", 
            "SONSONATE", 
            p.getIdpais());
    Usuarios u = new Usuarios("user", 
                    "abc", 
                    "def", 
                    "@", 
                    "2451", 
                    Usuarios.getHash("admin"), 
                    2, 
                    100);           
            
    //operacion insertar
    int r = Operaciones.insertar(u);                                                                                                                                             
    //int r2 = Operaciones.insertar(a); 
    if (r>0){
        out.println("Operacion satisfactoria<br/>");
        out.println("Resultado:" + r);
    }
    
    //operacion actualizar
    Operaciones.actualizar(a, // objeto con los nuevos datos
                    "50"); //id a actualizar
    //Operacion Eliminar
    //Operaciones.eliminar(new Aeropuertos(), "50");
    //Operaciones.eliminar(new Aeropuertos(), new String[]{"50", "51"});
    
    //obtener un registro
    HashMap<String,String> mp=new HashMap();
    mp = Operaciones.getRegistro(new Usuarios(), "alvaro");

    Iterator it=mp.keySet().iterator();

    while(it.hasNext())
    {            
        String m =(String)it.next();

        String key=m; 
        String value=(String)mp.get(key);

        out.println("<br>Key: "+key+"  Value: "+value);
    }                    
        %>
    </body>
</html>

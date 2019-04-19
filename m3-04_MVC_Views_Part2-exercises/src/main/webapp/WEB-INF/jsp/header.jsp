<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>


<!DOCTYPE html>

<html>

<head>
    <meta name="viewport" content="width=device-width" />
    <title>Toy Department</title>
    <link rel="stylesheet" href="css/site.css" />
</head>

<body>
    <header>
        <h1>MVC Exercises - Views Part 2: Models</h1>   
        <h1><c:out value="${param.detailPage}"/></h1>    
             
    </header>
    <nav>
        <ul>
            <li><a href="productList.jsp">List Layout</a></li>
            <li><a href="productTable.jsp">Table Layout</a></li>
            <li><a href="productTiles.jsp">Tile Layout</a></li>
        </ul>
        
    </nav>
   
   <section id="main-content">
   	
   		<h3>Toy Department</h3>
    
    <br/><br/>
   
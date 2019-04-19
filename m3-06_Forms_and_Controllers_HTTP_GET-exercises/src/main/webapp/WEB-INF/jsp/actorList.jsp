<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:set var="pageTitle" value="All Actors List" />

<%@include file="common/header.jspf"%>

<div class="form">

	<c:url var="retrieveUserInput" value= "/actorListResult" />

	<form action="${retrieveUserInput}" method="GET">
		
		<div class= "inputForSearchActor">
			
			<label for = "actor"></label> 
			
			<input id="actor" type="text" name="actor" />

			<p>
				<input type="submit" value="Search" class= "button" />
			</p>

		</div>
	</form>
</div>



<table class="table">
	<tr>
		<th>Name</th>
	</tr>
	 <c:forEach items="${listOfActors}" var="actor">
		<tr>
		<td><c:out value="${actor.firstName} ${actor.lastName}" /></td>
		</tr>
	 </c:forEach>
</table>

<%@include file="common/footer.jspf"%>
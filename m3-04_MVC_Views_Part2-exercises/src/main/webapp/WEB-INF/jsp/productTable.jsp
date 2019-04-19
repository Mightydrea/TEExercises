<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/WEB-INF/jsp/header.jsp">
	<c:param name="pageTitle" value="Product Table"/>
</c:import>

<table>

	<tr>
		<th></th>

		<td><img src="img/toy-balls.jpg"></td>
		<td><img src="img/toy-car.jpg"></td>
		<td><img src="img/toy-gym.jpg"></td>
		<td><img src="img/toy-horse.jpg"></td>
		<td><img src="img/toy-snail.jpg"></td>
		<td><img src="img/toy-tricycle.jpg"></td>

	</tr>
	<tr>
		<th></th>
		<c:forEach var="product" items="${productList}">
			<td><c:if test="${product.topSeller}">
					<span><jsp:text>  BEST SELLER!</jsp:text></span>
				</c:if>
		</c:forEach>
	</tr>
	<tr>
		<th id="rowHeader">Name</th>
		<c:forEach var="product" items="${productList}">
			<td bgcolor="lightgrey">${product.name}</td>
		</c:forEach>
	</tr>
	<tr>
		<th id="rowHeader">Rating</th>
		<c:forEach var="product" items="${productList}">
			<c:choose>
				<c:when test="${product.averageRating <= 1.4}">
					<td id="star1"><img src="img/1-star.png" alt="1 Stars"></td>

				</c:when>
				<c:when
					test="${product.averageRating >=1.5 && product.averageRating <= 2.4}">
					<td id="star1"><img src="img/2-star.png" alt="2 Stars"></td>
				</c:when>

				<c:when
					test="${product.averageRating >=2.5 && product.averageRating <= 3.4}">
					<td id="star1"><img src="img/3-star.png" alt="3 Stars"></td>
				</c:when>

				<c:when
					test="${product.averageRating >=3.5 && product.averageRating <= 4.4}">
					<td id="star1"><img src="img/4-star.png" alt="4 Stars"></td>
				</c:when>

				<c:otherwise>
					<td id="star1"><img src="img/5-star.png" alt="5 Stars"></td>
				</c:otherwise>
			</c:choose>

		</c:forEach>
	</tr>
	<tr>
		<th id="rowHeader">Mfr</th>
		<c:forEach var="product" items="${productList}">
			<td bgcolor="lightgrey">${product.manufacturer}</td>
		</c:forEach>
	</tr>
	<tr>
		<th id="rowHeader">Price</th>
		<c:forEach var="product" items="${productList}">
			<td><span><c:out value='$' />${product.price}</span></td>
		</c:forEach>
	</tr>
	<tr>
		<th id="rowHeader">wt.(in lbs)</th>
		<c:forEach var="product" items="${productList}">
			<td bgcolor="lightgrey">${product.weightInLbs}</td>
		</c:forEach>
	</tr>
</table>

<%@ include file="footer.jsp"%>

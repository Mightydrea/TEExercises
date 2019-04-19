<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<c:import url="/WEB-INF/jsp/header.jsp">
	<c:param name="title" value="Product List" />
</c:import>

<div id="entireLayout">

	<c:forEach var="product" items="${productList}">
 
 		<c:set var="description" value="${product.description}"/>

		
		<c:url var="productDetail" value="/productDetails">
			<c:param name="productId" value="${product.productId}"/>
		</c:url>
		
		
		<div id="productImage">
			<a href="${productDetails}">
				<img src="img/${product.imageName}"/></a>

			<div id="name">${product.name}<c:if test="${product.topSeller}">
					<span><jsp:text>  BEST SELLER!</jsp:text></span>
				</c:if>
			</div>

			<div>
				<c:out value='by ' />${product.manufacturer}</div>

			<c:choose>

				<c:when test="${product.remainingStock >= 3}">
					<c:out value="" />
				</c:when>
				<c:when test="${product.remainingStock == 1}">
					<span id="numberLeft"><c:out value='Only 1 left!' /></span>
				</c:when>
				<c:when test="${product.remainingStock == 2}">
					<span id="numberLeft"><c:out value='Only 2 left!' /></span>
				</c:when>
				<c:otherwise>
					<span><c:out value='SOLD OUT!' /></span>
				</c:otherwise>

			</c:choose>
			<div>
				<span><c:out value='$' />${product.price}</span>
			</div>

			<div>
				<span id="weight"><c:out value='Weight ' /></span>${product.weightInLbs}<c:out
					value=' lbs' />
			</div>

			<c:choose>
				<c:when test="${product.averageRating <= 1.4}">
					<div id="star">
						<img src="img/1-star.png" alt="1 Stars">
					</div>

				</c:when>
				<c:when
					test="${product.averageRating >=1.5 && product.averageRating <= 2.4}">
					<div id="star">
						<img src="img/2-star.png" alt="2 Stars">
					</div>
				</c:when>

				<c:when
					test="${product.averageRating >=2.5 && product.averageRating <= 3.4}">
					<div id="star">
						<img src="img/3-star.png" alt="3 Stars">
					</div>
				</c:when>

				<c:when
					test="${product.averageRating >=3.5 && product.averageRating <= 4.4}">
					<div id="star">
						<img src="img/4-star.png" alt="4 Stars">
					</div>
				</c:when>

				<c:otherwise>
					<div id="star">
						<img src="img/5-star.png" alt="5 Stars">
					</div>
				</c:otherwise>
			</c:choose>

		</div>

	</c:forEach>
</div>

<%@ include file="footer.jsp"%>

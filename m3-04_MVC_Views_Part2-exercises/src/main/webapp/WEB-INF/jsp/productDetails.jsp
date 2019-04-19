<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<c:import url="/WEB-INF/jsp/header.jsp">
	<c:param name="details" value="something" />
	<c:param name="title" value="Product Detail" />
</c:import>

	<div class="container"><img src="img/${product.imageName}"/>

		<div class="details">
			<p class="detail-name">${product.name}</p>

			<div id="name">${product.name}<c:if test="${product.topSeller}">
					<span><jsp:text>  BEST SELLER!</jsp:text></span>
				</c:if>
			</div>

			<div><c:out value='by ' />${product.manufacturer}</div>

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

			<div>
				<span id="description"><c:out value='Description ' /></span>${product.description}<c:out
					value=' lbs' />
			</div>

		</div>
	</div>
]
	<%@ include file="footer.jsp"%>
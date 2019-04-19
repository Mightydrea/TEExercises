<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<c:import url="/WEB-INF/jsp/common/header.jsp" />


<div>

	<c:forEach var="review" items="${reviews}">

		<div>
			<p>User: <c:out value="${review.username}" /></p>

		</div>

		<div class="reviewDate">
			<fmt:parseDate var="parseDate" value="${review.dateSubmitted}"
				type="both" pattern="yyyy-MM-dd'T'HH:mm" />
			<fmt:formatDate var="formatDate" value="${parseDate}"
				pattern="M/d/yyyy" />
			<p>
				<c:out value="${formatDate}" />
			</p>
		</div>

		<div class="starRating">
			<fmt:formatNumber var="rating" type="number" maxFractionDigits="0"
				value="${review.rating}" />
			<p>
				<img class="starImage" src="img/${rating}-star.png"
					alt="Star Rating" />
			</p>
		</div>

		<div>
			<c:out value="${review.title}" />

		</div>

		<div id="text">
			<c:out value="${review.text}" />

		</div>
		<hr>

	</c:forEach>











</div>






<c:import url="/WEB-INF/jsp/common/footer.jsp" />
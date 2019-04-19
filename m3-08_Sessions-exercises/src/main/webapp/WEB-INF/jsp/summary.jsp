<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<c:import url="/WEB-INF/jsp/common/header.jsp" />

<label>Favorite Color:</label><c:out value="${answers.userColorInput}"></c:out>
<th>
<label>Favorite Food:</label><c:out value="${answers.userFoodInput}"></c:out><th>
<th>
<label>Favorite Season:</label><c:out value="${answers.userSeasonInput}"></c:out>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />


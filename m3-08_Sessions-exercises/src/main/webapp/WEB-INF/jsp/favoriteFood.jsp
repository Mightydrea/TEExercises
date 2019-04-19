<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<c:import url="/WEB-INF/jsp/common/header.jsp" />


<div id="question">

	<h1>What is your favorite food?</h1>

	<form action="favoriteSeason" method="POST">
		 
		<input type="text"name= "userFoodInput"/> 
		<input type="submit" value="Next>>>" class="submitButton" />

	</form>
	
	

</div>




<c:import url="/WEB-INF/jsp/common/footer.jsp" />
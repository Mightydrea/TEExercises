<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<c:import url="/WEB-INF/jsp/common/header.jsp" />


<div id="question">

	<h1>What is your favorite season?</h1>

	<form action="summary" method="POST">
		 
		<p><input type="radio" name="userSeasonInput" value="Spring"/>Spring</p>
		<p><input type="radio" name="userSeasonInput" value="Summer"/>Summer</p> 
		<p><input type="radio" name="userSeasonInput" value="Fall"/>Fall</p>
		<p><input type="radio" name="userSeasonInput" value="Winter"/>Winter</p>
		
		<input type="submit" value="Next>>>" class="submitButton" />

	</form>
	
</div>


<c:import url="/WEB-INF/jsp/common/footer.jsp" />
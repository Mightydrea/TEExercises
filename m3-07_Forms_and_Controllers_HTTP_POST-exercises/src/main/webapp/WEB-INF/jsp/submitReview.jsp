<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<c:import url="/WEB-INF/jsp/common/header.jsp" />


<div id="reviewForumInput">

	<h1>New Book Review</h1>

	<c:url var="submitUserReview" value="/submitUserReview" />

	<form action="${submitUserReview}" method="POST">
		<label for="username"> Username: </label> 
		<input type="text"name="usernameInput" /> 
			
		<label for="rating"> Rating: </label> 
		
		<p><input type="radio" name="userRatingInput" value= "1" />1-Star</p>
		<p><input type="radio" name="userRatingInput" value= "2" />2-Stars</p> 
		<p><input type="radio" name="userRatingInput" value= "3" />3-Stars</p>
		<p><input type="radio" name="userRatingInput" value= "4" />4-Stars</p>
		<p><input type="radio" name="userRatingInput" value= "5" />5-Stars</p> 
		
		
		
		<label for="title">Review Title: </label> 
		<input id="title" type="text" name="userTitleInput" /> 
		<label for="text">Review Text:</label>
		<textarea name="userTextInput" rows="5" cols="50"></textarea>
		<br /> <br /> 
		<input type="submit" value="Submit" class="submitButton" />

	</form>

</div>



<c:import url="/WEB-INF/jsp/common/footer.jsp" />

<%@include file="common/header.jspf"%>

<c:url var="loginUrl" value="/login" />

<h2>Login</h2>
 
 	<h2 class="error">${error}</h2>
 
	<form:form action="${loginUrl}" method="POST" modelAttribute = "login">


		<div>
			<label for="email">Email</label>  
			<form:input path="email" placeholder ="enter email"/>            
        		<form:errors path="email" cssClass="error"/>
        </div>
        
		<div>
			<label for="password">Password</label> 
			<form:input type="password" path="password" placeholder ="enter password" /> <br>           
        		<form:errors path="password" cssClass="error"/>
		</div> 
	
		<input type="submit" value="Login" />

	</form:form>


<%@include file="common/footer.jspf"%>
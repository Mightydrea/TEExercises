<%@include file="common/header.jspf"%>


	<h2>New User Registration</h2>

	<h2 class="error">${error}</h2>

	<c:url var="registrationUrl" value="/register" />

	<form:form action="${registrationUrl}" method="POST" modelAttribute = "registration">
				
		<div>
			<label for="firstName">First Name</label> 
			<form:input path="firstName" placeholder ="enter first name"/>
        	<form:errors path="firstName" cssClass="error"/>
        		
        </div>
			
		<div>
			<label for="lastName">Last Name</label>  
			<form:input path="lastName" placeholder ="enter last name"/>
        	<form:errors path="lastName" cssClass="error"/>
        </div>
		
		<div>
			<label for="email">Email</label>  
			<form:input path="email" placeholder ="enter email" />            
        		<form:errors path="email" cssClass="error"/>
        		<form:errors path="emailMatching" cssClass="error"/>
        </div>
			
		<div>
			<label for="confirmEmail">Confirm Email</label> 
				<form:input path="confirmEmail" placeholder ="confirm email address" />
            	<form:errors path="confirmEmail" cssClass="error"/> 
			 
		</div> 
			 
		<div>
			<label for="password">Password</label> 
			<form:input path="password" placeholder ="enter password" />            
        		<form:errors path="password" cssClass="error"/>
        		<form:errors path="passwordMatching" cssClass="error"/>	
		</div> 
		
		<div>
			<label for="confirmPassword">Confirm Password</label> 
			<form:input path="confirmPassword" placeholder ="confirm password" />
            	<form:errors path="confirmPassword" cssClass="error"/> 
		</div>
		
		<div>
			<label for="birthday">Birthday</label> 
			<form:input path="birthday" placeholder ="enter birth date yyyy/MM/dd" />
            <form:errors path="birthday" cssClass="error"/>
		</div>
			
		<div>
			<label for="numberOfTickets"># of Tickets</label> 
			<form:input path="numberOfTickets" placeholder ="enter number of tickets"/>
            <form:errors path="numberOfTickets" cssClass="error"/>
		</div>
		
		<div>
			<input type="submit" value="Submit" />
		</div>

</form:form>
	

<%@include file="common/footer.jspf"%>

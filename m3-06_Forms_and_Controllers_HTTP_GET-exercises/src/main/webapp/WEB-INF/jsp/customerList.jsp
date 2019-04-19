<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:set var="pageTitle" value="All Customers List" />

<%@include file="common/header.jspf"%>


<div class="form">

	<c:url var="retrieveUserInput" value="/customerListResult" />


	<form action="${retrieveUserInput}" method="GET">

		<div class="inputForSearchCustomer">

			<div>
				<input id="customer" type="text" name="customerName" />
			</div>

		</div>

		<div class="inputForSearchCustomer">

			<label for="customerName">Sort:</label>
			<select name="sort" id="name">


				<option value="last_name">Last Name</option>
				<option value="email">E-Mail</option>
				<option value="active">Active</option>
				
				

			</select>

		</div>

		<p>
			<input type="submit" value="Search" class="button" />
		</p>
</form>
		<table class="table">
			<tr>
				<th>NAME</th>
				<th>EMAIL</th>
				<th>ACTIVE</th>
			</tr>
		

		<c:forEach items="${customers}" var="customer">
			<tr id="customerData">
				<td><c:out value="${customer.firstName} ${customer.lastName}" /></td>

				<td><c:out value="${customer.email}" /></td>

				<td><c:out value="${customer.active}"/></td>

			</tr>
		</c:forEach>
		</table>

</div>

<%@include file="common/footer.jspf"%>
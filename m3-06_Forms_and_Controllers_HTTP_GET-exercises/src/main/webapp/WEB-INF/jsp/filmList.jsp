<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:set var="pageTitle" value="All Films List" />

<%@include file="common/header.jspf"%>

<div id="form">

	<c:url var="retrieveUserInput" value="/filmListResult" />


	<form action="${retrieveUserInput}" method="GET">

		<div class="inputForSearchFilm">

			<label for="minimumLength">Minimum Length:</label>

			<div>
				<input id="film" type="text" name="minimumLengthFilm" />
			</div>

		</div>


		<div class="inputForSearchFilm">

			<label for="maximumLength">Maximum Length:</label>

			<div>
				<input id="film" type="text" name="maximumLengthFilm" />
			</div>

		</div>

		<div class="inputForSearchFilm">

			<label for="genre">Genre:</label>

		</div>

		<div class="inputForSearchFilm">

			<select name="genre" id="genre">


				<option value="Action">Action</option>
				<option value="Animation">Animation</option>
				<option value="Children">Children</option>
				<option value="Classics">Classics</option>
				<option value="Comedy">Comedy</option>
				<option value="Documentary">Documentary</option>
				<option value="Drama">Drama</option>
				<option value="Family">Family</option>
				<option value="Foreign">Foreign</option>
				<option value="Games">Games</option>
				<option value="Horror">Horror</option>
				<option value="Music">Music</option>
				<option value="New">New</option>
				<option value="Sci-Fi">Sci-Fi</option>
				<option value="Sports">Sports</option>
				<option value="Travel">Travel</option>

			</select>

		</div>
		<p>
			<input type="submit" value="Search" class="button" />
		</p>

	</form>
</div>
<table class="table">
	<tr>
		<th>TITLE</th>
		<th>DESCRIPTION</th>
		<th>RELEASE YEAR</th>
		<th>LENGTH</th>
		<th>RATING</th>
	</tr>

	<c:forEach items="${listOfFilms}" var="film">
		<tr>
			<td><c:out value="${film.title}" /></td>

			<td><c:out value="${film.description}" /></td>

			<td><c:out value="${film.releaseYear}" /></td>
			
			<td><c:out value="${film.length}" /></td>
			
			<td><c:out value="${film.rating}" /></td>
		</tr>
	</c:forEach>
</table>

<%@include file="common/footer.jspf"%>
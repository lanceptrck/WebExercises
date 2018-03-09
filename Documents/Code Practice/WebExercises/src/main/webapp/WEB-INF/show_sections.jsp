<html>
<head>
<title>Sections</title>
</head>
<body>
	<h1>Sections:</h1>
	<table>
		<tr>
			<th>Section ID</th>
			<th>Subject</th>
			<th>Schedule</th>
			<th>Room</th>
			</tr>

			<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
			<c:forEach var="entry" items="${DTOs}">		
					<tr>
					<td>
						<a href="sections/<!-- TODO: Section ID from 'dto' -->">
							${entry.sectionId}
						</a>
					</td>
					<td>${entry.subjectId}</td>
					<td>${entry.schedule}</td>
					<td>${entry.roomName} </td>
					</tr>
			</c:forEach>
		<!-- TODO: Close the forEach loop -->
	</table>
	
</body>
</html>
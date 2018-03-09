<html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<head>
<title>Section ${dto.sectionId} </title>
</head>
<body>
<h1>Section ${dto.sectionId}</h1>
<ul>
<li>Subject: ${dto.subjectId}</li>
<li>Schedule: ${dto.schedule}</li>
<li>Room: ${dto.roomName}</li>
</ul>
</body>
</html>
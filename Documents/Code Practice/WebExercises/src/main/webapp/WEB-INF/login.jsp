<html>
<head>
<title>Login</title>
</head>
<body>
<form action="${requestScope['javax.servlet.forward.request_uri']}">
<strong>Enter Your Username: </strong>
<input type="text" name="username"/>
<input	type="submit" value="Submit" />
</form>
</body>
</html>
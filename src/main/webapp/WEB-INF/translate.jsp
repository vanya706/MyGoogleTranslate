<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
    <title>MyTranslate</title>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</head>
<body>

	<form method="post">
		<input type="text" name="srcLanguage" value="en">
		<input type="text" name="destLanguage" value="uk">
		<br>
		<input type="text" name="originText">
		<br>
		<button>TRANSLATE</button>
	</form>

	<div>
		<%= session.getAttribute("originText")%>
	</div>
	<div>
		<%= session.getAttribute("translatedText")%>
	</div>
	<br>
	<div>
		<%= session.getAttribute("translatedText")%>
	</div>
	<div>
		<%= session.getAttribute("translatedTextDest")%>
	</div>


</body>
</html>
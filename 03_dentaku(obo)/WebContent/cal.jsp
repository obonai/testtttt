
<%@ page contentType="text/html; charset=Shift_JIS"%>



<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>


<head>
<meta http-equiv="Content-Type" content="text/html; charset=hift_JIS"">
<title>Insert title here</title>
</head>
<body>

	<form action="Controller" method="POST">
		<input type="text" name="num01" size=10 maxlength="10" />
		<select name="ope">
			<option value="+">+</option>
			<option value="-">-</option>
			<option value="*">*</option>
			<option value="/">/</option>
		</select>
		<input type="text" name="num02" size=10 maxlength="10" />
		<input type="submit" value="Às" />

	</form>
</body>
</html>
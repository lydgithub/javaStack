<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>lyd - Spring MVC Example with AJAX call</title>

<style type="text/css">
body {
    background-image:
        url('http://cdn3.crunchify.com/wp-content/uploads/2013/03/Crunchify.bg_.300.png');
}
</style>

<script type="text/javascript"  src="http://code.jquery.com/jquery-1.10.1.min.js"></script>
<script type="text/javascript">
    function crunchifyAjax() {
        $.ajax({
            url : 'ajaxtest.html',
            success : function(data) {
                $('#result').html(data);
            }
        });
    }
</script>

<script type="text/javascript">
    var intervalId = 0;
    intervalId = setInterval(crunchifyAjax, 3000);
</script>
</head>
<body>
	<div align="center">
        <br> <br> ${message} <br> <br>
        <div id="result"></div>
        <br>
        <p>
            by <a href="http://crunchify.com">Crunchify.com</a>
        </p>
    </div>
</body>
</html>
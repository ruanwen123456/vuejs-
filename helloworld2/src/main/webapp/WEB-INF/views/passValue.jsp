<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://cdn.bootcss.com/jquery/3.3.1/jquery.min.js"></script>
</head>
<body>

	<input type="text" id="demo"/>
	<input type="submit" id="submit"/>
	
	<span id="textSpan">返回数据</span>
	<script>
	
		$("#submit").click(function(){
			
			$.ajax({
				url:"submitDemo",
				type:"Post",
				data:{"demotext":$("#demo").val()},
				success:function(data){
					console.log(data)
					$("#textSpan").html(data)
				},
				error:function(err){
					console.log(err)
				}
			})
		})
	</script>
</body>
</html>
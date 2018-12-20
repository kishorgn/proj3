<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<script>  
			var request;  
			function verify()  
			{  
				var v=document.vinform.t1.value;  
				var url="page2.jsp?val="+v;  
			  
				if(window.XMLHttpRequest){  
				request=new XMLHttpRequest();  
				}  
				else if(window.ActiveXObject){  
					request=new ActiveXObject("Microsoft.XMLHTTP");  
				}  
				  
				try{  
					request.onreadystatechange=getInfo;  
					request.open("GET",url,true);  
					request.send();  
				}
				catch(e)
				{
					alert("Unable to connect to server");
				}  
			}  
			  
			function getInfo(){  
				if(request.readyState==4){  
					var val=request.responseText;  
					document.getElementById('result').innerHTML=val;  
				}  
			}  
		  
		</script>  
		<title>Insert title here</title>
	</head>
	<body>
		<form name="vinform">  
			Enter id:<input type="text" name="t1" onkeyup="verify()">  
		</form>  
	  
		<span id="result"> </span>  
	</body>
</html>

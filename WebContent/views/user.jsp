<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<script src="../js/jquery-3.2.1.min.js"></script>
<script type="text/javascript">
	function getAllUser() {
		$.ajax({
			url:'../user/getAllUser.do',
			type:'POST',
			success:function(r) {
				$('#result').text(r);
			}
		});
	}
	
	function getUser() {
		var userId = $('#userId').val().trim();
		if (userId == '') {
			alert('用户id不允许为空');
			return false;
		}
		$.ajax({
			url:'../user/getUserById.do',
			type:'POST',
			data:{id:userId},
			success:function(r) {
				$('#result').text(r);
			}
		});
	}
	
</script>
<title>jsp</title>
</head>
<body>
<div style="font-size:20;color:blue;">controller返回值：${user}</div>
<input type="text" id="userId" placeholder="请输入用户id"/><button onclick="getUser()">查询</button>
<button onclick="getAllUser()">获取所有用户</button>
<p>结果</p>
<div id="result"></div>
</body>
</html>
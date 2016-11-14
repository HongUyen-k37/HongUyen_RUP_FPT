<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">

<link rel="stylesheet" href="bootstrap.min.css">
<script src="bootstrap.min.js"></script>
<link rel="stylesheet" href="reset.css">
<link rel="stylesheet" href="style-login.css">
<link rel="stylesheet" href="style.css">
<script src="//code.jquery.com/jquery.min.js"></script>
<title>Trang chủ</title>
</head>
<body>
<div class="container">
<!--Header -->
	<div id="header">
		<p>XÂY DỰNG HỆ THỐNG QUẢN LÝ THỰC HIỆN ĐỀ TÀI TỐT NGHIỆP CỦA KHOA CNTT</p>
	</div>
	<!-- navBar -->
		<div id="menu">
			<div  class="container">
				<ul>
					<li><a href="trangchu.jsp">Trang chủ</a></li>
					
					<div class="log-out">
						<span style="color: #fff;">Xin chào, <b>admin</b>!</span>
						<button type="submit" class="btn btn-success btn-all">Đăng xuất</button>
					</div>
				</ul>
			</div>
		</div>
		<!-- content -->
		<div id="content">
			<div class="col-sm-9">
				<div id="main-content">
					
				</div>	
			</div>
			<div class="col-sm-3">
				<div id="login">
					<h4>Đăng nhập hệ thống</h4>
					<form class="form-horizontal" action="index.jsp">
						<div class="form-group">
							<label class="control-label col-sm-5">Tên đăng nhập</label>
							<div class="col-sm-7">
								<input type="text" class="form-control">
							</div>
						</div>
						<div class="form-group">
							<label class="control-label col-sm-5">Mật khẩu</label>
							<div class="col-sm-7"> 
								<input type="password" class="form-control">
							</div>
						</div>
						<div class="form-group"> 
							<div class="col-sm-offset-2 col-sm-10">
								<button type="submit" class="btn btn-success">Đăng nhập</button>
							</div>
						</div>
					</form>
				</div>
			</div>
		</div>
		<!-- footer -->
		<div id="footer">
			<p> &copy; Bản quyền Trường Đại Học Khoa Học Huế </p>
		</div>
<script type="text/javascript">
	$('#menu li').hover(
  		function() {
   		 $('ul', this).stop().slideDown(200);
 		 },
  		function() {
   		 $('ul', this).stop().slideUp(200);
 		}
	);
</script>
</div>	
</body>
</html>
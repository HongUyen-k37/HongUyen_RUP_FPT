<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" href="style.css">
<link rel="stylesheet" href="bootstrap.min.css">
<script src="bootstrap.min.js"></script>
<link rel="stylesheet" href="reset.css">
<script src="//code.jquery.com/jquery.min.js"></script>
<title>Xác nhận đăng ký đề tài</title>
<style>
table{
height: 300px;
}
.nameLabel{
    font-weight: 100;
    width: 40%;
}
.inputCaptcha{
height: 44px;
width: 95%;
}
</style>
</head>
<body>
<div class="container">
		<!--Header -->
		<div id="header">
			<p>XÂY DỰNG HỆ THỐNG QUẢN LÝ THỰC HIỆN ĐỀ TÀI TỐT NGHIỆP CỦA KHOA CNTT</p>
		</div>
	</div>
		<!-- navBar -->
		<div id="menu">
			<div  class="container">
				<ul>
					<li><a href="login.php">Trang chủ</a></li>
					<li> <a href="#">Thông tin đề tài </a>
					<ul>
						<li><a href="#">Đăng kí đề tài</a></li>
						<li><a href="#">Cập nhật thông tin đề tài</a></li>
						<li><a href="#">Tra cứu thống kê</a></li>
					</ul>
					</li>
					<li><a href="#">Thông tin cá nhân</a>
					<ul>
						<li><a href="#">Cập nhật thông tin cá nhân</a></li>
					</ul>
					</li>
					<li> <a href="#">Tin nhắn</a>
						<ul>
						<li><a href="#">Xem tin nhắn</a></li>
						<li><a href="#">Gửi tin nhắn</a></li>
						</ul>
					</li>
					<div class="log-out">
						<span style="color: #fff;">Xin chào, <b>admin</b>!</span>
						<button type="submit" class="btn btn-success btn-all">Đăng xuất</button>
					</div>
				</ul>
			</div>
		</div>
		<!-- content -->
		<div id="content">
				<div class="container">
				<div class="row">
		<h4>XÁC NHẬN ĐĂNG KÝ ĐỀ TÀI</h4>
		<form action="" method="get">
		<table >
		<tr style="border:hidden;">
		<th class="nameLabel">Mã đề tài:</th>
		<th>Cai nay hien thi ma de tai</th>
		</tr>
		<tr style="border:hidden;">
		<th class="nameLabel">Tên đề tài:</th>
		<th>Cai nay hien thi ma de tai</th>
		</tr>
		<tr style="border:hidden;">
		<th class="nameLabel">Giáo viên:</th>
		<th>Cai nay hien thi ma de tai</th>
		</tr>
		<tr style="border:hidden;">
		<th class="nameLabel">Số lượng sinh viên đăng ký:</th>
		<th>Cai nay hien thi ma de tai</th>
		</tr>
		<tr style="border:hidden;">
		<th class="nameLabel">Mã bảo mật:</th>
		<th><input type="text" class="inputCaptcha"></th>
		<th><input type="text" class="inputCaptcha"></th>
		</tr>
		<tr style="border:hidden;">
		<th class="nameLabel">Bạn có đồng ý không ?</th>
		<th><input type="checkbox"></th>
		</tr>
		</table>	
		<button class="btn btn-info" style="margin-left: 20%; margin-right: 20px;" >Thực hiện </button>
		<button class="btn btn-info">Hủy bỏ</button>
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
</body>
</html>
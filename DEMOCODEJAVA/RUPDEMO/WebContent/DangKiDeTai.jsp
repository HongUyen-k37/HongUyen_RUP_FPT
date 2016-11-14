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
<title>Đăng ký đề tài</title>
<style>
thead{
background:#6495ED;
color:white;
}
table, td, th {
    border: 1px solid grey;
}

table {
    border-collapse: collapse;
    width: 100%;
}

td {
    height: 50px;
    vertical-align: bottom;
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
		<h4>ĐĂNG KÝ ĐỀ TÀI</h4>
					<div class="row">
					<table class="table ">
					<thead>
					<tr>
					<th>Mã đề tài</th>
					<th>Tên đề tài</th>
					<th>Tên giáo viên</th>
					<th>Số lượng sinh viên đăng ký tối đa</th>
					<th>Số lượng sinh viên đã đăng ký</th>
					<th>Đăng ký</th>
					</tr>
					</thead>
					<tbody>
					<tr>
					<td>Dong nay load ma de tai</td>
					<td>Dong nay load ten de tai</td>
					<td>Dong nay load ten giao vien</td>
					<td>Dong nay load so luong sinh vien dang ky toi da</td>
					<td>Dong nay count so luong sinh vien da dang ki</td>
					<td><a href=""><img alt="imgDangKy" src="Register16.gif"></a></td> 
					</tr>		
					</tbody>
					</table>		
				
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
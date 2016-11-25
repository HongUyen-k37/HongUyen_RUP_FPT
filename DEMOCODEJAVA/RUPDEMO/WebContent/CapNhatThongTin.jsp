<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">

<link rel="stylesheet" href="bootstrap.min.css">
<link rel="stylesheet" href="style.css">
<script src="bootstrap.min.js"></script>
<link rel="stylesheet" href="style-duyetdetai.css">
<script src="//code.jquery.com/jquery.min.js"></script>

<title>Cập nhật thông tin cá nhân</title>
</head>
<body>
<div class="container">
	<div id="header">
		<p>XÂY DỰNG HỆ THỐNG QUẢN LÝ THỰC HIỆN ĐỀ TÀI TỐT NGHIỆP CỦA KHOA CNTT</p>
	</div>
	<!-- navBar -->
	<div id="menu">
		<ul>
			<li><a href="login.jsp">Trang chủ</a></li>
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

<div class="col-md-12">
		<div class="group-content">
			<div class="row main-nav" >
				<p class="title">CẬP NHẬT THÔNG TIN CÁ NHÂN</p>
				<form action="" class="form-horizontal" method="POST" role="form">
					<div class="col-md-6">
						<div class="form-group">
							<label class="control-label col-md-3 no-pad" for="masinhvien">Mã sinh viên:</label>
							<div class="col-md-8">
								<input type="text" class="form-control" name="masinhvien" disabled>
							</div>
						</div>
						<div class="form-group">
							<label class="control-label col-md-3 no-pad" for="birthday">Ngày sinh:</label>
							<div class="col-md-8">
								<input type="text" class="form-control" name="birthday">
							</div>
						</div>
						<div class="form-group">
							<label class="control-label col-md-3 no-pad" for="gioitinh">Giới tính:</label>
							<div class="col-md-8">
								<select class=" form-control" name="gioitinh">
									<option value="">Nam</option>
									<option value="">Nữ</option>
								</select>
							</div>
						</div>
						<div class="form-group">
							<label class="control-label col-md-3 no-pad" for="email">Email:</label>
							<div class="col-md-8">
								<input type="text" class="form-control" name="email">
							</div>
						</div>
					</div>
					<div class="col-md-6 pad-5">
						<div class="form-group">
							<label class="control-label col-md-3 no-pad" for="name">Họ và tên:</label>
							<div class="col-md-8 ">
								<input type="text" class="form-control" name="name" disabled>
							</div>
						</div>
						<div class="form-group">
							<label class="control-label col-md-3 no-pad" for="birthday-place">Nơi sinh:</label>
							<div class="col-md-8 ">
								<input type="text" class="form-control" name="birthday-place">
							</div>
						</div>
						<div class="form-group">
							<label class="control-label col-md-3 no-pad" for="CMND">Số CMND:</label>
							<div class="col-md-8">
								<input type="text" class="form-control" name="CMND">
							</div>
						</div>
						<div class="form-group">
							<label class="control-label col-md-3 no-pad" for="phone">Số điện thoại:</label>
							<div class="col-md-8">
								<input type="text" class="form-control" name="phone">
							</div>
						</div>
						
					</div>
				</form>
			</div><!-- end form-->
		<div class="main-nav">
							<label class="control-label col-md-3 no-pad" for="address">Địa chỉ liên hệ:</label>
							<textarea class="form-control" rows="4" cols="100" name="address"></textarea>
						</div>
		<div class="btn-gr">
			<button type="submit" class="btn btn-success btn-all" name='change-key'>Đổi mật khẩu</button>
			<button type="submit" class="btn btn-success btn-all" name='save-info'>Lưu thông tin cá nhân</button>
		</div>
		
		</div>
		</div>
	</div>

</body>
</html>
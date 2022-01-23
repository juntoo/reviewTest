<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<c:set var="root" value="${pageContext.request.contextPath}"/>
<html>
<head>
<meta charset="UTF-8">
<title>Mypage-M-D</title>
<link rel="stylesheet" href="${root}/resources/css/member/member.css"/>
</head>
<body>
    <div>
        <div id="title"><a>Mypage</a></div>
        <div id="menuF">
            <div id="category">
                <div id="detail" style="border-left: 0px;"></div>
                <div id="detail" style="border-right: 0px;"><a>Account</a></div>
                <div id="detail" style="height: 690px; border-left: 0px; border-bottom: 0px;"></div>
            </div>
            
            <div id="content">
                <div style="float: left; margin-top: 60px; margin-left: 50px; font-size: 50px;">Account</div>
                <div style="border : 2px black solid; width: 900px; height: 640px; margin-top: 40px;margin-right: 110px;">
					<form name="memberForm"  id="form_style" action="#" method="post" onsubmit="return registerForm(this)">
						<div class="M_line_box">
							<div class="line">
									<label class="title">Name</label>
									<span class="content">
										<input type="text" name="Mname" value="${memberDto.Mname}" disabled="disabled"/>
									</span>
								</div>
								
								<div class="line">
									<label class="title">Regi.Num</label>
									<span class="content">
										<input type="text" name="Mresidentnumber1" size="11" maxlength="6" value="${memberDto.Mresidentnumber1}" disabled="disabled"/>
										- <input type="password" name="Mresidentnumber2" size="12" maxlength="7" value="${memberDto.Mresidentnumber2}" disabled="disabled"/>
									</span>	
								</div>
								
								<div class="line">  
									<label class="title">ID</label>  
									
									<span class="content"> 
										<input type="text" name="Mid" value="${memberDto.Mid}" disabled="disabled"/>
									</span>
								</div>
								
								<div class="line">
									<label class="title">Password</label>
									<span class="content">
										<input type="password" name="Mpassword" value="${memberDto.Mpassword}" disabled="disabled"/>
									</span>
								</div>
								
								<div class="line">
									<label class="title"></label>
									<span class="content">
										<input type="password" name="MpasswordCheck"value="${memberDto.MpasswordCheck}" disabled="disabled"/>
									</span>
								</div>
								
								<div class="line">
									<label class="title">Address</label>
									<span class="content">
										<input type="text" name="Mpostalcode" value="${memberDto.Mpostalcode}" disabled="disabled"/>
										<input type="button" value="Search" />
									</span>
							  	</div>
								
								<div class="line">
									<label class="title"></label>
									<span class="content">
										<input type="text" name="Maddress" size="40" value="${memberDto.Maddress}" disabled="disabled"/>
									</span>
								</div>
								
								<div class="line">
									<label class="title">E-Mail</label>
									
									<span class="content">
										<input type="text" name="Memail" size="25" value="${memberDto.Memail}" disabled="disabled"/>
									</span>
								</div>
								
								<div class="line">
									<label class="title">Tel)</label>
									
									<span class="content">
										<input type="text" name="Mcallnumber1" size="5" maxlength="3" value="${memberDto.Mcallnumber1}" disabled="disabled"/>
										<input type="text" name="Mcallnumber2" size="10" maxlength="4" value="${memberDto.Mcallnumber2}" disabled="disabled"/>
										<input type="text" name="Mcallnumber3" size="10" maxlength="4" value="${memberDto.Mcallnumber3}" disabled="disabled"/>
									</span>	
								</div>
							</div>
						<div class="line_btn">
							<input type="submit" value="Okay"/>
							<input type="reset" value="Cancle"/>
						</div>
					</form>
				</div>	
			</div>
		</div>
	</div>
</body>
</html>
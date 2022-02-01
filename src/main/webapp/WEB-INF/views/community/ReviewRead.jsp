<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:set var="root" value="${pageContext.request.contextPath}" />
<link rel="stylesheet" href="${root}/resources/css/community/ReviewStyle.css" />
</head>
<body>
	<div>
		<div id="title">
			<a>Community</a>
		</div>
		<div id="menuF">
			<div id="category">
				<div id="detail" style="border-left: 0px;"></div>
				<div id="detail" style="border-right: 0px;"
					onclick="location.href='${root}/community/ReviewList.do';">
					<a>Review</a>
				</div>
				<div id="detail"
					onclick="location.href='${root}/community/EventList.do';">
					<a>Event</a>
				</div>
				<div id="detail"
					onclick="location.href='${root}/community/Notice.do';">
					<a>Notice</a>
				</div>
				<div id="detail"
					style="height: 630px; border-left: 0px; border-bottom: 0px;"></div>
			</div>
			<div id="content">
				<div id="mid1">
					<span id="viewcount">조회수</span> <span id="mid1_button">${reviewDto.RVcount} <input
						type="button" value="수정" />
					</span>
				</div>
				<div id="mid2">
					<div style="display: inline-block;">
						<span style="font-size: 30px; line-height: 60px">${reviewDto.RVtitle}</span>
					</div>
					<div id="mid3">
						<div>
							${Mid} <input type="text" value="naninani" disabled="disabled"
								style="width: 100px; text-align: center;" />
						</div>
					</div>
					<div id="mid4">
						<div id="mid_image">
							<img alt="picon"
								src="https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2F20150803_11%2Fopera2528_1438599289948ID68K_JPEG%2Fnaver_com_20150714_193055.jpg&type=sc960_832">
						</div>
					</div>
					<div id="mid5">
						<span> </span>
					</div>
					<div id="mid6">
						<div style="word-break:break-all; overflow: auto; width: 80%; height: 206px;">
							${reviewDto.RVcontent}
						</div>
						<div>
							<a href="http://122.34.87.29:8181/practice1/css/EventList.jsp"><input
								type="button" value="목록"
								style="float: right; margin-right: 30px;" /></a>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
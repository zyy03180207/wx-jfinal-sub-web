<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="utf-8">
		<title>Hello MUI</title>
		<meta name="viewport" content="width=device-width, initial-scale=1,maximum-scale=1,user-scalable=no">
		<meta name="apple-mobile-web-app-capable" content="yes">
		<meta name="apple-mobile-web-app-status-bar-style" content="black">
		<link rel="stylesheet" href="css/mui.min.css">
	</head>

	<body>
		
		<!--下拉刷新容器-->
		<div id="pullrefresh" class="mui-content mui-scroll-wrapper">
			<div class="mui-scroll">
				<div id="slider" class="mui-slider">
				<div class="mui-slider-group mui-slider-loop">
					<!-- 额外增加的一个节点(循环轮播：第一个节点是最后一张轮播) -->
					<div class="mui-slider-item mui-slider-item-duplicate">
						<a href="#">
							<img src="images/yuantiao.jpg">
							<p class="mui-slider-title">静静看这世界</p>
						</a>
					</div>
					<div class="mui-slider-item">
						<a href="#">
							<img src="images/shuijiao.jpg">
							<p class="mui-slider-title">幸福就是可以一起睡觉</p>
						</a>
					</div>
					<div class="mui-slider-item">
						<a href="#">
							<img src="images/muwu.jpg">
							<p class="mui-slider-title">想要一间这样的木屋，静静的喝咖啡</p>
						</a>
					</div>
					<div class="mui-slider-item">
						<a href="#">
							<img src="images/cbd.jpg">
							<p class="mui-slider-title">Color of SIP CBD</p>
						</a>
					</div>
					<div class="mui-slider-item">
						<a href="#">
							<img src="images/yuantiao.jpg">
							<p class="mui-slider-title">静静看这世界</p>
						</a>
					</div>
					<!-- 额外增加的一个节点(循环轮播：最后一个节点是第一张轮播) -->
					<div class="mui-slider-item mui-slider-item-duplicate">
						<a href="#">
							<img src="images/shuijiao.jpg">
							<p class="mui-slider-title">幸福就是可以一起睡觉</p>
						</a>
					</div>
				</div>
				<div class="mui-slider-indicator mui-text-right">
					<div class="mui-indicator mui-active"></div>
					<div class="mui-indicator"></div>
					<div class="mui-indicator"></div>
					<div class="mui-indicator"></div>
				</div>
			</div>
				<!--数据列表-->
				<ul class="mui-table-view mui-table-view-chevron">
					
				</ul>
			</div>
		</div>
		<script src="js/mui.min.js"></script>
		<script>
			mui.init({
				pullRefresh: {
					container: '#pullrefresh',
					down: {
						callback: pulldownRefresh
					},
					up: {
						contentrefresh: '正在加载...',
						callback: pullupRefresh
					}
				}
			});
			/**
			 * 下拉刷新具体业务实现
			 */
			function pulldownRefresh() {
				setTimeout(function() {
					var table = document.body.querySelector('.mui-table-view');
					table.innerHTML = '';
					var cells = document.body.querySelectorAll('.mui-table-view-cell');
					for (var i = cells.length, len = i + 3; i < len; i++) {
						var li = document.createElement('li');
						li.className = 'mui-table-view-cell mui-media';
						li.innerHTML = '<a href="javascript:;">'+
						'<img class="mui-media-object mui-pull-left" src="images/shuijiao.jpg">'+
						'<div class="mui-media-body">'+
							'幸福'+
							'<p class="mui-ellipsis">能和心爱的人一起睡觉，是件幸福的事情；可是，打呼噜怎么办？</p>'+
						'</div>'+
					'</a>';
						//下拉刷新，新纪录插到最前面；
						table.appendChild(li);
					}
					mui('#pullrefresh').pullRefresh().endPulldownToRefresh(); //refresh completed
				}, 1500);
			}
			var count = 0;
			/**
			 * 上拉加载具体业务实现
			 */
			function pullupRefresh() {
				setTimeout(function() {
					mui('#pullrefresh').pullRefresh().endPullupToRefresh((++count > 2)); //参数为true代表没有更多数据了。
					var table = document.body.querySelector('.mui-table-view');
					var cells = document.body.querySelectorAll('.mui-table-view-cell');
					for (var i = cells.length, len = i + 3; i < len; i++) {
						var li = document.createElement('li');
						li.className = 'mui-table-view-cell';
						li.innerHTML = '<a href="javascript:;">'+
						'<img class="mui-media-object mui-pull-left" src="images/shuijiao.jpg">'+
						'<div class="mui-media-body">'+
							'幸福'+
							'<p class="mui-ellipsis">能和心爱的人一起睡觉，是件幸福的事情；可是，打呼噜怎么办？</p>'+
						'</div>'+
					'</a>';
						table.appendChild(li);
					}
				}, 1500);
			}
			if (mui.os.plus) {
				mui.plusReady(function() {
					setTimeout(function() {
						mui('#pullrefresh').pullRefresh().pullupLoading();
					}, 1000);

				});
			} else {
				mui.ready(function() {
					mui('#pullrefresh').pullRefresh().pullupLoading();
				});
			}
		</script>
	</body>
</html>
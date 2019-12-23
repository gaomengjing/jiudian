onload=function(){
		var arr = document.getElementsByClassName("slide");
		for(var i=0;i<arr.length;i++){
			arr[i].style.left = i*1500+"px";
		}
	}
	function LeftMove(){
		var arr = document.getElementsByClassName("slide");//获取三个子div
		for(var i=0;i<arr.length;i++){
			var left = parseFloat(arr[i].style.left);//函数可解析一个字符串，并返回一个浮点数。arr[i].style.left直接获取属性值（也就是必须是内联样式才行）
			left-=2;
			var width = 1500;//图片的宽度
			if(left<=-width){
				left=(arr.length-1)*width;//当图片完全走出显示框，拼接到末尾
				clearInterval(moveId);
			}
			arr[i].style.left = left+"px";
		}
	}
	function divInterval(){
		moveId=setInterval(LeftMove,0.1);//设置一个10毫秒定时器
	}
	
	
	timeId=setInterval(divInterval,6000);//设置一个3秒的定时器。
	
	function stop(){
		clearInterval(timeId);
	}
	function start(){
		clearInterval(timeId);
		timeId=setInterval(divInterval,3000);
	}
	
	//页面失去焦点停止
	onblur = function(){
		stop();
	}
	//页面获取焦点时开始
	onfocus = function(){
		start();
	}

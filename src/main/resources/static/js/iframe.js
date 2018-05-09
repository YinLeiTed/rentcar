/*子窗口宽度自适应*/
function IFrameResize(name){
	//alert(this.document.body.scrollHeight); //弹出当前页面的高度 
	var obj = parent.document.getElementById(name); //取得父页面IFrame对象 
	//alert(obj.height); //弹出父页面中IFrame中设置的高度 
	obj.height = this.document.body.scrollHeight; //调整父页面中IFrame的高度为此页面的高度 
} 
/*父窗口高度适应*/
function getHeight(doc) {
  var body = doc.body,
      html = doc.documentElement;

  var height = Math.max( body.scrollHeight, body.offsetHeight,
    html.clientHeight, html.scrollHeight, html.offsetHeight );
  return height;
}
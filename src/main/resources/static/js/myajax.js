function myajax2(myaddress,mytype,mydata){
    var mydata2;
	$.ajax({
         type: mytype,
         url: myaddress,
         data: mydata,
         async:false,
         dataType: "json",
         success: function(data){
             mydata2=data;
      	}
    });
    return mydata2;
}
function myajax(myaddress,mytype){
    var mydata;
    $.ajax({
         type: mytype,
         url: myaddress,
         dataType: "json",
         async:false,
         success: function(data){
             mydata=data;
      	}
    });
    return mydata;
}
//跨域请求
function myajax3(myaddress,mytype){
    var mydata;
    $.ajax({
        type: mytype,
        url: myaddress,
        dataType: "jsonp",
        crossDomain: true,
        success: function(data){
            mydata=data;
        }
    });
    return mydata;
}
//将SerializeArray数据转为JSON
function alterSerializeArrayToJson(a)
{
    var o = {};
    $.each(a, function() {
        if (o[this.name]) {
            if (!o[this.name].push) {
                o[this.name] = [o[this.name]];
            }
            o[this.name].push(this.value || '');
        } else {
            o[this.name] = this.value || '';
        }
    });
    return o;
};
//倒计时跳转页面
function countDown(secs,surl){
    if(--secs>0){
        setTimeout("countDown("+secs+",'"+surl+"')",1000);
    }
    else{
        location.href=surl;
    }
}

//将user_table改为驼峰命名规则
function alterTableColumnName(s1) {
    for(var i in s1)
    {6
        s1[i] = s1[i].replace(/_(\w)/g, function(all, letter){
            return letter.toUpperCase();});
    }
    return s1;
}
//将user_table改为驼峰命名规则,并且首字母大写
function alterTableName(s1) {
    for(var i in s1)
    {
        s1[i] = s1[i].replace(/_(\w)/g, function(all, letter){
            return letter.toUpperCase();});
        s1[i] = s1[i].replace(s1[i].charAt(0),s1[i].charAt(0).toUpperCase())
    }
    return s1;
}

/*
json合并对象
一，保存object1和2合并后产生新对象，若2中有与1相同的key，默认2将会覆盖1的值
    var object = $.extend({}, object1, object2);
二，将2的值合并到1，同key时 默认2将会覆盖1的值
    // Merge object2 into object1
    $.extend( object1, object2 );
三，将2的值合并到1，设置递归为true，
    同key时 将进行递归合并
        // Merge object2 into object1
        $.extend( true, object1, object2 );
*/

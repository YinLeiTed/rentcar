function myajax(myaddress,mydata,mytype){
    var mydata;
	$.ajax({
         type: mytype,
         url: myaddress,
         data: mydata,
         async:false,
         dataType: "json",
         success: function(data){
             mydata=data;
      	}
    });
    return mydata;
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
	
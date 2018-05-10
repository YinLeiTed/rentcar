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
	
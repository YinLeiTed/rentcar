function myajax(myaddress,mydata,myresult){
	$.ajax({
         type: "post",
         url: myaddress,
         data: mydata,
         dataType: "json",
         success: function(data){
            myresult=data;
      	}
    });
}
function myajax(myaddress,myresult){
	$.ajax({
         type: "post",
         url: myaddress,
         dataType: "json",
         success: function(data){
            myresult=data;
      	}
    });
}
	
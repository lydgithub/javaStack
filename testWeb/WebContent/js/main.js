(function(){
	'use strict';
	
	var form=$('#my-form'),
		inputs=$('input'),
		username=$('#username'),
		email=$('#email'),
		password=$('#password'),
		password2=$('#password2'),
		capcharImg=$('#capcharImg'),
		captchar=$('#captchar'),
		terms=$('#terms'),
		submit=$('#submitBtn'),
		usernameErr=username.siblings('.err'),
		emailErr=email.siblings('.err'),
		passwordErr=password.siblings('.err'),
		password2Err=password2.siblings('.err'),
		captcharErr=captchar.siblings('.err'),
		termsErr=terms.siblings('.err'),
		val=null,
		passwordVal=null;
	var USERNAME_MAX_LEN=32,
		USERNAME_MIN_LEN=4,
		PASSWORD_MAX_LEN=255,
		PASSWORD_MIN_LEN=6;
	var ERR_USERNAME_LEN='用户名需在'+USERNAME_MIN_LEN+'和'+USERNAME_MAX_LEN+"位之间",
		EER_PASSWORD_LEN='密码需在'+PASSWORD_MIN_LEN+'和'+PASSWORD_MAX_LEN+'位之间';
		
	var REG_USERNAME=/^[a-zA-Z0-9]+$/,
		REG_EMAIL=/^([a-z0-9_\.-]+)@([\da-z\.-]+)\.([a-z\.]{2,6})$/;
	
		inputs.on('change',function(){
			$(this).siblings('.err').hide();
		})
		
		function isEmpty(ele){
			if($.trim(ele)==null||$.trim(ele)==''){
				return true;
			}
			return false;
		}
		
		username.on('blur',function(){
			val=$(this).val();
			
			if(isEmpty($(this))){
				usernameErr.html('用户名不能为空').show();
			}
			//check username length
			else if(val.length<USERNAME_MIN_LEN||val.length>USERNAME_MAX_LEN){
				usernameErr.html(ERR_USERNAME_LEN).show();
			}
			//check username format
			else if(!REG_USERNAME.test(val)){
				usernameErr.html('用户名只接受字母或数字').show();
			}
			
		})
		
		email.on('blur',function(){
			val=$(this).val();
			if(isEmpty(val)){
				emailErr.html('email不能为空').show();
			}
			else if(!REG_EMAIL.test(val)){
				emailErr.html('邮箱格式不正确').show();
			}
		})
		
		password.on('blur',function(){
			passwordVal=$(this).val();
			if(isEmpty(passwordVal)){
				passwordErr.html('密码不能为空').show();
			}else if(passwordVal.length<PASSWORD_MIN_LEN||passwordVal.length>PASSWORD_MAX_LEN){
				passwordErr.html(EER_PASSWORD_LEN).show();
			}
		})
		
		password2.on('blur',function(){
			val=$(this).val();
			if(isEmpty(val)){
				password2Err.html('密码不能为空').show();
			}else if(val.length<PASSWORD_MIN_LEN||val.length>PASSWORD_MAX_LEN){
				password2Err.html(EER_PASSWORD_LEN).show();
			}
			else if(val!=passwordVal){
				password2Err.html('密码不一致').show();
			}
		})
		
		capcharImg.on('click',function(){
			//jsp?**********
			capcharImg.attr({"src":capcharImg.attr('codesrc')+'?'+(+new Date())});
			//alert($.session.get('rand'));
			/*
			captcharStr=captchar.val();
			$.ajax({        
	            url: 'validate.jsp?'+(),
	            dataType: 'text',
	            success: function (data) {          
	                alert(data);
	            },
	            error: function(){
	            	alert("error");
	            }
			});
			*/
		})
		
		captchar.on('blur',function(){
			val=$(this).val();
			//alert(val);
			if(isEmpty(val)){
				captcharErr.html('验证码不能为空').show();
			}else{
				//captcharErr.html(val).show();
				//var jsonData= "{ \"rand\": \"" +val +"\" }";	
				var jsonData={"rand":val};
				$.ajax({
					 type:'POST',
					 dataType:"json",
					 url:'validate.jsp',
					 data:jsonData,
					 success: function(result) {
						 if(result=='1'){
							 $('#validationOKImg').show();
							 $('#validationErrImg').hide();
						 }else{
							 $('#validationErrImg').show();
							 $('#validationOKImg').hide();
						 }
			         },
			         error: function(result){
			        	alert("error:"+result);
			         }
				 });
				
			}
		})
		
		terms.on('change',function(){
		//	if(!terms.prop('checked')){
			if(!$(this).is(":checked")){
				termsErr.html('请选中checkbox').show();
			}else{
				termsErr.hide();
			}
		})
		
		submit.on('click',function(){
			//不做判断
			var flag=true;
			if(username.val().trim()==null||username.val().trim()==""){
				usernameErr.html('用户名不能为空').show();
				flag=false;
			}
			if(password.val().trim()==null||password.val().trim()==""){
				passwordErr.html('密码不能为空').show();
				flag=false;
			}
			if(password2.val().trim()==null||password2.val().trim()==""){
				password2Err.html('确认密码不能为空').show();
				flag=false;
			}
			if(email.val().trim()==null||email.val().trim()==""){
				emailErr.html('邮箱不能为空').show();
				flag=false;
			}
			if(captchar.val().trim()==null||captchar.val().trim()==""){
				captcharErr.html('验证码不能为空').show();
				flag=false;
			}
			if(flag==true){
				var url='process.jsp';
				$('#my-form').attr('action',url);
			}
		})
		
})()
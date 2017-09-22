<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html >
<head>
  <meta charset="UTF-8">
  <title>CsquareEducation Contact Form</title>
  <script src="http://s.codepen.io/assets/libs/modernizr.js" type="text/javascript"></script>
  <style>
  .copy {
  text-align:center;
  padding:1.5em 1em;
    background: #18c9d2;
  }
.copy p {
  color: #fff;
  font-size: 0.85em;
}
.copy p a:hover{
	 text-decoration: underline;
	 }
.logo {
  float: left;
}
.logo  a h1{
 font-size: 2.7em;
 font-weight:400;
 color: #18C9D2;
 font-family: 'Poiret One', cursive;
}
.logo  a h1:hover{
 text-decoration:none;
}
.logo a h1 span {
  color:#b42b36;
}
.logo  a h1 i{
color:#000;
}

	 </style>

  
  <link rel='stylesheet prefetch' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css'>
<link rel='stylesheet prefetch' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap-theme.min.css'>
<link rel='stylesheet prefetch' href='https://cdnjs.cloudflare.com/ajax/libs/jquery.bootstrapvalidator/0.5.0/css/bootstrapValidator.min.css'>

      <link rel="stylesheet" href="css/style.css">
<META HTTP-EQUIV="Content-type" CONTENT="text/html; charset=UTF-8">
  
</head>

<body>



  <div class="container">
  <p>
	<div class="logo">
						<a href="https://csquareeducation.com" ><img src="csquarelogo.png" alt="Urbanic Template" title="Csquare" /></a>
					 </div>
		<h3 style="color:#18C9D2; display:block; font-weight:bold;  margin-top:1.5em; margin-bottom:1.5em;" align="center" >
                  Csquare Enquiry Form</h3>
         <h4 align="center" style="display:block; font-weight:bold; margin-top:1.5em; margin-bottom:1.5em;">Please fill the form. We will contact you shortly. 	</h5>			  
					 </h4></p>

    <form class="well form-horizontal" action="https://www.salesforce.com/servlet/servlet.WebToLead?encoding=UTF-8"  method="post"  id="contact_form">

<input type=hidden name="oid" value="00D28000001ddKz">
<input type=hidden name="retURL" value="http://csquareeducation.com">

<fieldset>
<!-- Text input-->

<div class="form-group">
  <label class="col-md-4 control-label">First Name</label>  
  <div class="col-md-4 inputGroupContainer">
  <div class="input-group">
  <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
  <input id="first_name" name="first_name" placeholder="First Name" class="form-control"  type="text" required>
    </div>
  </div>
</div>

<!-- Text input-->

<div class="form-group">
  <label class="col-md-4 control-label" >Last Name</label> 
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
  <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
  <input id="last_name" name="last_name" placeholder="Last Name" class="form-control"  type="text" required>
    </div>
  </div>
</div>

<!-- Text input-->
       <div class="form-group">
  <label class="col-md-4 control-label">E-Mail</label>  
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
        <span class="input-group-addon"><i class="glyphicon glyphicon-envelope"></i></span>
  <input id="email" name="email" placeholder="E-Mail Address" class="form-control"  type="text" required>
    </div>
  </div>
</div>


<!-- Text input-->
       
<div class="form-group">
  <label class="col-md-4 control-label">Mobile </label>  
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
        <span class="input-group-addon"><i class="glyphicon glyphicon-earphone"></i></span>
  <input id="mobile" name="mobile" placeholder="080-4040400" class="form-control" type="text" required>
    </div>
  </div>
</div>

<!-- Text input-->
      
<div class="form-group">
  <label class="col-md-4 control-label">Address</label>  
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
        <span class="input-group-addon"><i class="glyphicon glyphicon-home"></i></span>
  <input id="00N2800000InWNh" name="00N2800000InWNh" placeholder="Address" class="form-control" type="text">
    </div>
  </div>
</div>

<!-- Text input-->
 

<!-- Select Basic -->
   
<div class="form-group"> 
  <label class="col-md-4 control-label">Gender</label>
    <div class="col-md-4 selectContainer">
    <div class="input-group">
        <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
    <select id="00N2800000InS2z" name="00N2800000InS2z" title="Gender" class="form-control selectpicker" >
      <option value=" " >Select </option>
		<option value="Male">Male</option>
<option value="Female">Female</option>
    </select>
  </div>
</div>
</div>
<div class="form-group"> 
  <label class="col-md-4 control-label">City</label>
    <div class="col-md-4 selectContainer">
    <div class="input-group">
        <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
    <select id="00N2800000JHZzk" name="00N2800000JHZzk" title="City" class="form-control selectpicker" >
      <option value=" " >Select </option>
		<option value="Bangalore">Bangalore</option>
<option value="Delhi">Delhi</option>
<option value="Ranchi">Ranchi</option>
    </select>
  </div>
</div>
</div>
<label for="company"></label><input type="hidden" id="company"  name="company" value="Csquare" />
<label for="Lead Type"></label><input type="hidden" id="00N2800000InWOG" name="00N2800000InWOG" value="Student" />
<!-- Text input-->
<div class="form-group"> 
  <label class="col-md-4 control-label">Syllabus Preferred</label>
    <div class="col-md-4 selectContainer">
    <div class="input-group">
        <span class="input-group-addon"><i class="glyphicon glyphicon-th-list"></i></span>
    <select id="00N2800000InS34" name="00N2800000InS34" class="form-control selectpicker" >
      <option value="">Select</option><option value="CBSE">CBSE</option>
<option value="ICSE">ICSE</option>
<option value="State Board">State Board</option>
<option value="International Board">International Board</option>
<option value="Other">Other</option>
    </select>
  </div>
</div>
</div>

<!-- Text input-->
<div class="form-group"> 
  <label class="col-md-4 control-label">Preferred Grade</label>
    <div class="col-md-4 selectContainer">
    <div class="input-group">
        <span class="input-group-addon"><i class="glyphicon glyphicon-th-list"></i></span>
    <select id="00N2800000InS39" multiple="multiple" name="00N2800000InS39" class="form-control selectpicker" >
      <option value="">Select</option>
<option value="1st Grade">1st Grade</option>
<option value="2nd Grade">2nd Grade</option>
<option value="3rd Grade">3rd Grade</option>
<option value="4th Grade">4th Grade</option>
<option value="5th Grade">5th Grade</option>
<option value="6th Grade">6th Grade</option>
<option value="7th Grade">7th Grade</option>
<option value="8th Grade">8th Grade</option>
<option value="9th Grade">9th Grade</option>
<option value="10th Grade">10th Grade</option>
<option value="11th Grade (Science)">11th Grade (Science)</option>
<option value="11th Grade (Commerce)">11th Grade (Commerce)</option>
<option value="11th Grade (Arts)">11th Grade (Arts)</option>
<option value="12th Grade (Science)">12th Grade (Science)</option>
<option value="12th Grade (Commerce)">12th Grade (Commerce)</option>
<option value="12th Grade (Arts)">12th Grade (Arts)</option>
<option value="Others">Others</option>
    </select>
  </div>
</div>
</div>
<!-- radio checks -->
<div class="form-group"> 
  <label class="col-md-4 control-label">Preferred Subject</label>
    <div class="col-md-4 selectContainer">
    <div class="input-group">
        <span class="input-group-addon"><i class="glyphicon glyphicon-th-list"></i></span>
    <select id="00N2800000InS3E" multiple="multiple" name="00N2800000InS3E" class="form-control selectpicker" >
 <option value="">Select</option>
 <option value="Mathematics">Mathematics</option>
<option value="Physics">Physics</option>
<option value="Chemistry">Chemistry</option>
<option value="Biology">Biology</option>
<option value="Account">Account</option>
<option value="Economics">Economics</option>
<option value="Business Study">Business Study</option>
<option value="Social Science">Social Science</option>
<option value="English">English</option>
<option value="Kannada">Kannada</option>
<option value="Hindi">Hindi</option>
<option value="French">French</option>
<option value="Others">Others</option>
    </select>
  </div>
</div>
</div>
<!-- Text area -->
  
<div class="form-group">
  <label class="col-md-4 control-label">Comment</label>
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
        <span class="input-group-addon"><i class="glyphicon glyphicon-pencil"></i></span>
        	<textarea class="form-control" id="00N2800000InWNm" name="00N2800000InWNm" ></textarea>
  </div>
  </div>
</div>
<!-- Button -->
<div class="form-group">
  <label class="col-md-4 control-label"></label>
  <div class="col-md-4">
    <button type="submit" class="btn btn-warning" >Send <span class="glyphicon glyphicon-send"></span></button>
  </div>
</div>

</fieldset>
</form>
</div>
    </div><!-- /.container -->
	<div class="copy">
			
		                  <p>Copyright © 2014-2017 Csquareeducation. All rights reserved </p>
		              <p> Like Us On:  <div id="share-buttons">
					  
					  
					        <!-- Facebook -->
    <a href="https://www.facebook.com/csquareeducation/" target="_blank">
        <img src="https://simplesharebuttons.com/images/somacro/facebook.png" alt="Facebook" />
    </a>
    
    <!-- Google+ -->
    <a href="https://plus.google.com/u/0/" target="_blank">
        <img src="https://simplesharebuttons.com/images/somacro/google.png" alt="Google" />
    </a>
    
      <!-- Twitter -->
    <a href="https://twitter.com/CsquareEduc" target="_blank">
        <img src="https://simplesharebuttons.com/images/somacro/twitter.png" alt="Twitter" />
    </a>

	
     <!-- LinkedIn -->
    <a href="http://www.linkedin.com/shareArticle?mini=true&amp;url=https://simplesharebuttons.com" target="_blank">
        <img src="https://simplesharebuttons.com/images/somacro/linkedin.png" alt="LinkedIn" />
    </a>
		            </div>
					
					<span id="siteseal"><script async type="text/javascript" src="https://seal.godaddy.com/getSeal?sealID=qHUkzTVTyZDPZoBvpFXQkrewdxM1YwPxdTSuqEUl9VZlLDUsv9o2cI7m5bs4"></script></span>
					
</div>
  <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
<script src='http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js'></script>
<script src='http://cdnjs.cloudflare.com/ajax/libs/bootstrap-validator/0.4.5/js/bootstrapvalidator.min.js'></script>

    <script src="js/jav.js"></script>
    
        <script>
	  (function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){
	  (i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),
	  m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
	  })(window,document,'script','https://www.google-analytics.com/analytics.js','ga');
	
	  ga('create', 'UA-102645225-1', 'auto');
	  ga('send', 'pageview');
	
   </script>
   

<!--Add the following script at the bottom of the web page (before </body></html>)
<script type="text/javascript" async="async" defer="defer" data-cfasync="false" src="https://mylivechat.com/chatinline.aspx?hccid=94943162"></script>-->
<a rel="nofollow" href="http://bc.linkody.com/en/seo-tools/free-backlink-checker/csquareeducation.com" title="backlink checker - csquareeducation.com"><img src="http://www.linkody.com/bc/e3/csquareeducation.com.png" alt="backlink checker - csquareeducation.com"></a>

</body>
</html>

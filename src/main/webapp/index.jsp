<html>
   <title>IBS</title>
   <meta name="viewport" content="width=device-width, initial-scale=1">
   <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
   <body>
      <div class="w3-container">
         <h2 class="w3-center">Internet Banking System</h2>

      </div>
      <div class="w3-row w3-row-padding">
         <div class="w3-col  l8 m8 s12  w3-center">
            <p><a href="hello.html">Hello Spring</a> | 
               <a href="contact.html">Contact</a>
            </p>
         </div>
         <div class="w3-col  l4 m4 s12  w3-center" style="hight:100%">
            	<form class="w3-container  w3-light-grey" action="login.html">
            		<br/>
            		<div class="w3-row">
            			<img src="${pageContext.request.contextPath}/resources/img/logo/logo.png" style="width:20%" class="w3-round" alt="Norway">
            		</div>
            		<br/>
            		<div class="w3-row">
					  <input placeholder="User Name" class="w3-input w3-border w3-round" name="first" type="text">
					  <br/>
					</div>
					<div class="w3-row">
					  <input placeholder="Password" class="w3-input w3-border w3-round-large" name="last" type="text">
					</div>
					<div class="w3-row">
						<div class="s8 w3-left-align">forgot password?</div>
						<div class="s4 w3-right-align">
							 <input type="submit" class="w3-button w3-black" value="Sign In">
						</div>
					</div>
					<br/>
				</form>	

         </div>
      </div>
   </body>
</html>

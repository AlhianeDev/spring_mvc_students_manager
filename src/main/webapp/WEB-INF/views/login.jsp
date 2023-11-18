<%@ include file="includes/header.jspf" %>

	<section class="sec sign-up-in">
	
		<div class="container">
		
			<c:if test="${ param.logout != null }">
			
				<div class="error-msg">
				
					<c:out value="You Hava Been Logged Out!"></c:out>
				
				</div>
			
			</c:if>
			
			<c:if test="${ param.error != null }">
			
				<div class="error-msg">
				
					<c:out value="Invalid Username Or Password!"></c:out>
				
				</div>
			
			</c:if>
		
			<form action="/login" class="sign-box" method="post">
			
				<input type="text" name="username" placeholder="Username">
				
				<input type="password" name="password" 
				
				class="for_input" placeholder="Password">
				
				<div class="showing">
				
					<input type="checkbox" id="for_checkbox"
					
					class="show_pass" data-show="for">
					
					<label class="for_label" for="for_checkbox">
					
						show password
					
					</label>
				
				</div>
				
				<input type="hidden" name="${ _csrf.parameterName }" 
				
				value="${ _csrf.token }">
				
				<input type="submit" value="Sign In">
				
				<p>Dont't have an account ? <a href="/sign_up">Sign Up</a></p>
			
			</form>
		
		</div>
	
	</section>

	<%@ include file="includes/footer.jspf" %>

	<script type="text/javascript" 
	
		src="${ pageContext.request.contextPath }/resources/js/scripts.js">
	
	</script>

	</body>

</html>

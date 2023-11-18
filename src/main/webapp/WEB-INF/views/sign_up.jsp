<%@ include file="includes/header.jspf" %>

	<section class="sec sign-up-in">
	
		<div class="container">
		
			<form class="sign-box" action="/sign_up" method="post">
			
				<input type="text" name="full_name" placeholder="Full Name"
				
				value="${ user.full_name }">
				
				<c:if test="${ full_name_error != null }">
				
					<span class="error-msg">
					
						<c:out value="${ full_name_error }"></c:out>
					
					</span>
				
				</c:if>
			
				<input type="text" name="username" placeholder="Username"
				
				value="${ user.username }">
				
				<c:if test="${ username_error != null }">
				
					<span class="error-msg">
					
						<c:out value="${ username_error }"></c:out>
					
					</span>
				
				</c:if>
				
				<input type="password" name="password" 
				
				class="pour_input" placeholder="Password">
				
				<div class="showing">
				
					<input type="checkbox" id="pour_checkbox"
					
					class="show_pass" data-show="pour">
					
					<label class="pour_label" for="pour_checkbox">
					
						show password
					
					</label>
				
				</div>
				
				<c:if test="${ password_error != null }">
				
					<span class="error-msg">
					
						<c:out value="${ password_error }"></c:out>
					
					</span>
				
				</c:if>
				
				<input type="hidden" name="${ _csrf.parameterName }" 
				
				value="${ _csrf.token }">
				
				<input type="submit" value="Sign Up">
				
				<p>Already have an account ? <a href="/login">Sign In</a></p>
			
			</form>
		
		</div>
	
	</section>

	<%@ include file="includes/footer.jspf" %>
	
	<script type="text/javascript" 
	
		src="${ pageContext.request.contextPath }/resources/js/scripts.js">
	
	</script>

	</body>

</html>

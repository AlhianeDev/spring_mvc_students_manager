<%@ include file="../includes/header.jspf" %>
		
	<section class="sec">
	
		<div class="container">
		
			<form action="/contact" class="contact-form" method="post">
				
				<input type="text" name="recipient"
				
				class="normal-input" placeholder="recipient"
				
				value="programmingt909@gmail.com" readonly="readonly">
				
				<input type="text" name="subject"
				
				class="normal-input" placeholder="subject">
				
				<textarea class="normal-input textarea" name="message"
				
				 placeholder="Message"></textarea>
				 
				<input type="hidden" name="${ _csrf.parameterName }" 
				
				value="${ _csrf.token }">
				 
				<input type="submit" class="submit-input" value="Send">
			
			</form>
		
		</div>
	
	</section>
		
	<%@ include file="../includes/footer.jspf" %>

	</body>

</html>

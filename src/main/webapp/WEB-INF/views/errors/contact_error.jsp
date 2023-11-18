<%@ include file="../includes/header.jspf" %>

	<section class="sec error-sec">
	
		<div class="container">
		
			<h2 class="page-title">Email Exception!</h2>
		
			<p class="page-desc">
			
				Sorry, the email was not sent because of the following error: 
				
				<br>
				
				${ exception.message }
				
				<br>
				
				click <a href="/contact">here</a> And Try Again!
				
			</p>
			
		</div>
	
	</section>
	
	<%@ include file="../includes/footer.jspf" %>

	</body>

</html>
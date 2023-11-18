<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<%@ include file="../includes/header.jspf" %>

	<section class="sec add_sec">
		
		<div class="container">
		
			<div class="sec-head">
			
				<h2 class="sec-title">Add Student</h2>
				
				<a href="/students" class="target">View Students</a>
			
			</div>
			
			<form action="/add_student" method="post" class="students-form">
			
				<input type="text" name="full_name" 
				
				class="text-input" placeholder="Full Name"
				
				value="${ student.full_name }">
				
				<c:if test="${ full_name_error != null }">
				
					<span class="error-msg">
					
						<c:out value="${ full_name_error }"></c:out>
					
					</span>
				
				</c:if>
				
				<input type="number" name="age" 
				
				class="text-input" placeholder="Age" 
				
				value="${ student.age }">
				
				<c:if test="${ age_error != null }">
				
					<span class="error-msg">
					
						<c:out value="${ age_error }"></c:out>
					
					</span>
				
				</c:if>
				
				<select class="text-input" name="gender_id">
				
					<c:forEach var="g" items="${ genders }">
					
						<c:choose>
						
							<c:when test="${ student.gender_id == g.primary_gender_id }">
							
								<option 
								
									value="${ g.primary_gender_id }" 
									
									selected="selected">
							
									"${ g.gender }"
							
								</option>
							
							</c:when>
							
							<c:otherwise>
							
								<option value="${ g.primary_gender_id }">
								
									"${ g.gender }"
								
								</option>
							
							</c:otherwise>
						
						</c:choose>
					
					</c:forEach>
				
				</select>
				
				<select class="text-input" name="country_id">
				
					<c:forEach var="c" items="${ countries }">
					
						<c:choose>
						
							<c:when test="${ student.country_id == c.primary_country_id }">
							
								<option 
								
									value="${ c.primary_country_id }" 
									
									selected="selected">
							
									"${ c.country }"
							
								</option>
							
							</c:when>
							
							<c:otherwise>
							
								<option value="${ c.primary_country_id }">
								
									"${ c.country }"
								
								</option>
							
							</c:otherwise>
						
						</c:choose>
					
					</c:forEach>
				
				</select>
				
				<input type="hidden" name="${ _csrf.parameterName }" 
				
				value="${ _csrf.token }">
				
				<input type="submit" class="submit-input" value="Add Student">
			
			</form>
		
		</div>
	
	</section>

	<%@ include file="../includes/footer.jspf" %>

	</body>

</html>

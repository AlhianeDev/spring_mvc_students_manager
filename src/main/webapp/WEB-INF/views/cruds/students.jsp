<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<%@ include file="../includes/header.jspf" %>

	<section class="sec view">
	
		<div class="container">
		
			<div class="sec-head">
			
				<h2 class="sec-title">View Students</h2>
				
				<a href="/add_student" class="target">Add Student</a>
			
			</div>
			
			<table>
			
				<thead>
				
					<tr>
						
						<th>Full Name</th>
						
						<th>Age</th>
						
						<th>Country</th>
						
						<th>Gender</th>
						
						<th>Actions</th>
					
					</tr>
				
				</thead>
				
				<tbody>
				
					<c:forEach var="student" items="${ students }">
					
						<tr>
							
							<td>${ student.full_name }</td>
							
							<td>${ student.age }</td>
							
							<td>${ student.gender }</td>
							
							<td>${ student.country }</td>
							
							<td>
							
								<a href="/update_student?
								
								primary_student_id=${ student.primary_student_id }">
									
									Update
									
								</a>
								
								<a href="/delete_student?
								
								primary_student_id=${ student.primary_student_id }">
									
									Delete
									
								</a>
							
							</td>
						
						</tr>
				
					</c:forEach>
				
				</tbody>
			
			</table>
		
		</div>
	
	</section>

	<%@ include file="../includes/footer.jspf" %>

	</body>

</html>

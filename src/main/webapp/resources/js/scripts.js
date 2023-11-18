/*

const error_msg = document.querySelectorAll(".error-msg");

error_msg.forEach(error => {
	
	window.setTimeout(() => {
		
		error.styles.display = "none";
		
	}, 1500);
	
});

*/

// Show - Hide Password.

document.querySelectorAll(".show_pass").forEach(input => {
	
	input.addEventListener("input", (event) => {
		
		let data_show = event.target.getAttribute("data-show");
		
		let label = document.querySelector("." + data_show + "_label");
		
		let input = document.querySelector("." + data_show + "_input");
		
		if (event.target.checked == true) {
			
			input.setAttribute("type", "text");
			
			label.textContent = "hide password";
			
		} else {
			
			input.setAttribute("type", "password");
			
			label.textContent = "show password";
			
		}
		
	});
	
});

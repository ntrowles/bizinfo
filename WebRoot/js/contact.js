function validateEmail(email) {
	if (email == "" || email == null)
	{
		return true;
		}
	else {
		var remail = /(.+)@(.+){2,}\.(.+){2,}/;
		return remail.test(email);
	}
}

function validateForm() {

	// Validate name
	var name = $("#name").val();
	if (name == "" || name == null) {
		alert("Please enter a valid name");
	}

	// Validate name
	var feedback = $("#feedback").val();
	if (feedback == "" || feedback == null) {
		alert("Please enter a feedback");
	}

	// Validate Title
	var title = $("#subject").val();
	if (title == "" || title == null) {
		alert("Please enter the subject");
	}
	// Validate Email
	var email = $("#email").val();
	if ((validateEmail(email))) {
		alert("Your feedback is sending to our team, please wait for a moment. Thanks for your comments.");
		document.getElementById("submit").disabled = true;
		return true;
	} else {
		alert("Please enter a valid email");
	}

	return false;
}

function resetform() {
	document.getElementById("name").value = "";
	document.getElementById("subject").value = "";
	document.getElementById("email").value = "";
	document.getElementById("feedback").value = "";
}
function validateURLForm() {

	// Validate name
	var title = $("#title").val();
	if (title == "" || title == null) {
		alert("Please enter a valid title");
		return false;
	}

	// Validate name
	var URLlink = $("#URLlink").val();
	if (URLlink == "" || URLlink == null) {
		alert("Please enter a URLlink");
		return false;
	}

	return true;
}

function validateCategoryForm() {
	// Validate name
	var category = $("#category").val();
	if (category == "" || category == null) {
		alert("Please enter a category");
		return false;
	}

	return true;
}

function validateURL() {
	// Validate name
	var linkurl = $("#linkurl").val();
	if (linkurl == "" || linkurl == null) {
		alert("Please enter a URL");
		return false;
	}

	return true;
}
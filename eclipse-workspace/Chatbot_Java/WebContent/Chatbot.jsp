<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="row contact-wrap">
		<div class="status alert alert-success" style="display: none"></div>
		<form id="main-contact-form" class="contact-form" name="contact-form"
			method="post" action="ContactController">
			 <div class="col-sm-5">
			<div class="form-group">
                            <label>Company Name</label>
                            <input type="text" name="companyname" class="form-control">
                        </div> 
                        </div>                        
                    <div class="col-sm-5">
                        <div class="form-group">
                            <label>Subject *</label>
                            <input type="text" name="subject" class="form-control" required="required">
                        </div>
                        </div>
			<div class="col-sm-5 col-sm-offset-1">
				<div class="form-group">
					<label>Message *</label>
					<textarea name="message" id="message" required="required"
						class="form-control" rows="8"></textarea>
				</div>
				<div class="form-group">
					<button type="submit" name="action" value="submit"
						class="btn btn-primary btn-lg">Contact Us</button>
				</div>
			</div>
		</form>
	</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
function checkFname()
{
	var f=document.frm.fname.value;
	var reg=/^[A-Za-z]+$/;
	if(f=="")
		{
		document.getElementById("fname").innerHTML="Please Enter First Name";
		document.getElementById("btn").disabled="true";
		}
	else if(!reg.test(f))
		{
		document.getElementById("fname").innerHTML="Please Enter Only Alphabets";
		document.getElementById("btn").disabled="true";
		}
	else
		{
		document.getElementById("fname").innerHTML="";
		document.getElementById("btn").disabled="";
		}
}
function checkLname()
{
	var f=document.frm.lname.value;
	var reg=/^[A-Za-z]+$/;
	if(f=="")
		{
		document.getElementById("lname").innerHTML="Please Enter Last Name";
		document.getElementById("btn").disabled="true";
		}
	else if (!reg.test(f))
		{
		document.getElementById("lname").innerHTML="Please Enter Only Alphabets";
		document.getElementById("btn").disabled="true";
		}
	else
		{
		document.getElementById("lname").innerHTML="";
		document.getElementById("btn").disabled="";
		}
}
function checkEmail()
{
	var f=document.frm.email.value;
	var reg=/^[A-Za-z0-9-_.]+@[A-Za-z]+\.[A-Za-z]{2,4 }$/;
	if(f=="")
		{
		document.getElementById("email").innerHTML="Please Enter Email";
		document.getElementById("btn").disabled="true";
		}
	else if(!reg.test(f))
		{
		document.getElementById("email").innerHTML="Please Enter Standard Email Id";
		document.getElementById("btn").disabled="true";
		}
	else
		{
		document.getElementById("email").innerHTML="";
		document.getElementById("btn").disabled="";
		}
}
function checkMobile()
{
	var f=document.frm.mobile.value;
	var reg=/^\d{10}$/;
	if(f=="")
		{
		document.getElementById("mobile").innerHTML="Please Enter Mobile No";
		document.getElementById("btn").disabled="true";
		}
	else if(!reg.test(f))
	{
	document.getElementById("mobile").innerHTML="Please Enter 10 Digit Mobile No";
	document.getElementById("btn").disabled="true";
	}
	else
		{
		document.getElementById("mobile").innerHTML="";
		document.getElementById("btn").disabled="";
		}
}
function checkPassword()
{
	var f=document.frm.password.value;
	var reg= /^(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[^a-zA-Z0-9])(?!.*\s).{8,15}$/;
	if(f=="")
	{
	document.getElementById("password").innerHTML="Please Enter Password";
	document.getElementById("btn").disabled="true";
	}
else if(!reg.test(f))
{
document.getElementById("password").innerHTML="1 Upper & LowerLetter,1 Digit,1 Special Symbol(8-15)";
document.getElementById("btn").disabled="true";
}
else
	{
	document.getElementById("password").innerHTML="";
	document.getElementById("btn").disabled="";
	}
}
	
</script>
</head>
<body>
	<form name="frm" method="post" action="">
		<table cellspacing="5" cellpadding="5">
			<tr>
				<td>First Name</td>
				<td><input type="text" name="fname" onblur="checkFname();"></td>
				<td><span id="fname"></span></td>
			</tr>
			<tr>
				<td>Last Name</td>
				<td><input type="text" name="lname" onblur="checkLname();"></td>
				<td><span id="lname"></span></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input type="text" name="email" onblur="checkEmail();"></td>
				<td><span id="email"></span></td>
			</tr>
			<tr>
				<td>Mobile</td>
				<td><input type="text" name="mobile" onblur="checkMobile();"></td>
				<td><span id="mobile"></span></td>
				
			</tr>
			<tr>
				<td>Address</td>
				<td><textarea rows="5" cols="22" name="address"></textarea></td>
			</tr>
			<tr>
				<td>Gender</td>
				<td><input type="radio" name="gender" value="male">Male
					<input type="radio" name="gender" value="female">Female</td>
			</tr>
			<tr>
				<td>Hobby</td>
				<td><input type="checkbox" name="h" value="music">Music
					<input type="checkbox" name="h" value="reading">Reading 
					<input type="checkbox" name="h" value="travelling">Travelling 
					<input type="checkbox" name="h" value="sports">Sports</td>
			</tr>
			<tr>
				<td>Education</td>
				<td><select name="education">
						<option>-----Select Education----</option>
						<option value=" ">10th</option>
						<option value=" ">12th</option>
						<option value=" ">BE</option>
						<option value=" ">BCA</option>
						<option value=" ">BSC IT</option>
						<option value=" ">ME</option>
						<option value=" ">MCA</option>
						<option value=" ">Msc IT</option>
				</select></td>
			</tr>
			<tr>
				<td>Resume</td>
				<td><input type="file" name="resume"></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="password" onblur="checkPassword();"></td>
				<td><span id="password"></span></td>
			</tr>
			<tr>
				<td><input type="submit" name="action" value="Submit"></td>
				<td><input type="Reset" name="action" value="Reset"></td>
			</tr>
		</table>
	</form>
</body>
</html>
